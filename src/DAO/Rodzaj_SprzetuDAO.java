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
import model.Rodzaj_Sprzetu;
import org.hibernate.Query;


public class Rodzaj_SprzetuDAO extends HibernateUtil {
   
   
    public List<Rodzaj_Sprzetu> getAll() {
        
         openSessionWithTrans();
         List<Rodzaj_Sprzetu> list = new ArrayList<Rodzaj_Sprzetu>();
            getCurrentLocalSession().doWork((Connection connection) -> {
            CallableStatement statement = null;
             try {
                 statement = connection.prepareCall("{call GET_RODZAJ_SPRZETU(?)}");
                  statement.registerOutParameter(1, oracle.jdbc.OracleTypes.CURSOR);
                    statement.execute();
                  ResultSet rs = (ResultSet)statement.getObject(1);
                   while(rs.next()){
                Rodzaj_Sprzetu ros = new Rodzaj_Sprzetu();
                int id_rodzajsprzetu = rs.getInt("id_rodzajsprzetu");
                String rodzaj = rs.getString("rodzaj");
                ros.setId_rodzajsprzetu(id_rodzajsprzetu);
                ros.setRodzaj(rodzaj);
                
                list.add(ros);
                }
             } catch (SQLException ex) {
                 Logger.getLogger(Rodzaj_SprzetuDAO.class.getName()).log(Level.SEVERE, null, ex);
             }
          }); 
        closeSessionWithTrans();
        
        return list;
         
    };
    
    public void update(Rodzaj_Sprzetu k, Rodzaj_Sprzetu k2){
        openSessionWithTrans();
        Query query = getCurrentLocalSession().createSQLQuery("call UPDATE_RODZAJ_SPRZETU(:rodzaj,:rodzajnew)");
        query.setParameter("rodzaj", k.getRodzaj());
        query.setParameter("rodzajnew", k2.getRodzaj());
        query.executeUpdate();
        closeSessionWithTrans();
    };
    public void delete(Rodzaj_Sprzetu k){
        openSessionWithTrans();
        Query query = getCurrentLocalSession().createSQLQuery("call DELETE_RODZAJ_SPRZETU(:rodzaj)").setParameter("rodzaj", k.getRodzaj());
        query.executeUpdate();
        closeSessionWithTrans();
    };
    public void create(Rodzaj_Sprzetu k){
        openSessionWithTrans();
        Query query = getCurrentLocalSession().createSQLQuery("call INSERT_RODZAJ_SPRZETU(:rodzaj)").setParameter("rodzaj", k.getRodzaj());
        query.executeUpdate();
        closeSessionWithTrans();
    };
   
    
    public Rodzaj_SprzetuDAO(){};
}

