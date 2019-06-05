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
import model.Producent_Gry;
import org.hibernate.Query;


public class Producent_GryDAO extends HibernateUtil {
   
   
    public List<Producent_Gry> getAll() {
        
         openSessionWithTrans();
         List<Producent_Gry> list = new ArrayList<Producent_Gry>();
            getCurrentLocalSession().doWork((Connection connection) -> {
            CallableStatement statement = null;
             try {
                 statement = connection.prepareCall("{call GET_PRODUCENT_GRY(?)}");
                  statement.registerOutParameter(1, oracle.jdbc.OracleTypes.CURSOR);
                    statement.execute();
                  ResultSet rs = (ResultSet)statement.getObject(1);
                   while(rs.next()){
                Producent_Gry pg = new Producent_Gry();
                int id_prodgry = rs.getInt("id_prodgry");
                String nazwa_firmy = rs.getString("nazwa_firmy");
                pg.setId_prodgry(id_prodgry);
                pg.setNazwa_firmy(nazwa_firmy);
                
                list.add(pg);
                }
             } catch (SQLException ex) {
                 Logger.getLogger(Producent_GryDAO.class.getName()).log(Level.SEVERE, null, ex);
             }
          }); 
        closeSessionWithTrans();
        
        return list;
         
    };
    
    public void update(Producent_Gry k, Producent_Gry k2){
        openSessionWithTrans();
        Query query = getCurrentLocalSession().createSQLQuery("call UPDATE_PRODUCENT_GRY(:nazwa_firmy,:nazwa_firmynew)");
        query.setParameter("nazwa_firmy", k.getNazwa_firmy());
        query.setParameter("nazwa_firmynew", k2.getNazwa_firmy());
        query.executeUpdate();
        closeSessionWithTrans();
    };
    public void delete(Producent_Gry k){
        openSessionWithTrans();
        Query query = getCurrentLocalSession().createSQLQuery("call DELETE_PRODUCENT_GRY(:nazwa_firmy)").setParameter("nazwa_firmy", k.getNazwa_firmy());
        query.executeUpdate();
        closeSessionWithTrans();
    };
    public void create(Producent_Gry k){
        openSessionWithTrans();
        Query query = getCurrentLocalSession().createSQLQuery("call INSERT_PRODUCENT_GRY(:nazwa_firmy)").setParameter("nazwa_firmy", k.getNazwa_firmy());
        query.executeUpdate();
        closeSessionWithTrans();
    };
   
    
    public Producent_GryDAO(){};
}

