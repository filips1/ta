/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DAO.HibernateUtil;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Producent_Sprzetu;
import org.hibernate.Query;


public class Producent_SprzetuDAO extends HibernateUtil {
   
   
    public List<Producent_Sprzetu> getAll() {
        
         openSessionWithTrans();
         List<Producent_Sprzetu> list = new ArrayList<Producent_Sprzetu>();
            getCurrentLocalSession().doWork((Connection connection) -> {
            CallableStatement statement = null;
             try {
                 statement = connection.prepareCall("{call GET_PRODUCENT_SPRZETU(?)}");
                  statement.registerOutParameter(1, oracle.jdbc.OracleTypes.CURSOR);
                    statement.execute();
                  ResultSet rs = (ResultSet)statement.getObject(1);
                   while(rs.next()){
                Producent_Sprzetu ps = new Producent_Sprzetu();
                int id_prodsprzetu = rs.getInt("id_prodsprzetu");
                String nazwa_firmy = rs.getString("nazwa_firmy");
                ps.setId_prodsprzetu(id_prodsprzetu);
                ps.setNazwa_firmy(nazwa_firmy);
                
                list.add(ps);
                }
             } catch (SQLException ex) {
                 Logger.getLogger(Producent_SprzetuDAO.class.getName()).log(Level.SEVERE, null, ex);
             }
          }); 
        closeSessionWithTrans();
        
        return list;
         
    };
    
    public void update(Producent_Sprzetu k, Producent_Sprzetu k2){
        openSessionWithTrans();
        Query query = getCurrentLocalSession().createSQLQuery("call UPDATE_PRODUCENT_SPRZETU(:nazwa_firmy,:nazwa_firmynew)");
        query.setParameter("nazwa_firmy", k.getNazwa_firmy());
        query.setParameter("nazwa_firmynew", k2.getNazwa_firmy());
        query.executeUpdate();
        closeSessionWithTrans();
    };
    public void delete(Producent_Sprzetu k){
        openSessionWithTrans();
        Query query = getCurrentLocalSession().createSQLQuery("call DELETE_PRODUCENT_SPRZETU(:nazwa_firmy)").setParameter("nazwa_firmy", k.getNazwa_firmy());
        query.executeUpdate();
        closeSessionWithTrans();
    };
    public void create(Producent_Sprzetu k){
        openSessionWithTrans();
        Query query = getCurrentLocalSession().createSQLQuery("call INSERT_PRODUCENT_SPRZETU(:nazwa_firmy)").setParameter("nazwa_firmy", k.getNazwa_firmy());
        query.executeUpdate();
        closeSessionWithTrans();
    };
   
    
    public Producent_SprzetuDAO(){};
}

