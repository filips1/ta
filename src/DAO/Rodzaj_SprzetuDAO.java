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
   
   /* 
    public List<Gatunek> getAll() {
        
         openSessionWithTrans();
         List<Gatunek> list = new ArrayList<Gatunek>();
            getCurrentLocalSession().doWork((Connection connection) -> {
            CallableStatement statement = null;
             try {
                 statement = connection.prepareCall("{call GETCAT(?)}");
                  statement.registerOutParameter(1, oracle.jdbc.OracleTypes.CURSOR);
                    statement.execute();
                  ResultSet rs = (ResultSet)statement.getObject(1);
                   while(rs.next()){
                Gatunek cat = new Gatunek();
                int id_gatunku = rs.getInt("id_gatunek");
                String gatunek_gry = rs.getString("gatunek_gry");
                cat.setId_gatunek(id_gatunku);
                cat.setGatunek_gry(gatunek_gry);
                
                list.add(cat);
                }
             } catch (SQLException ex) {
                 Logger.getLogger(GatunekDAO.class.getName()).log(Level.SEVERE, null, ex);
             }
           

            

          }); 
        closeSessionWithTrans();
        
        return list;
         
    };*/
    
    public void update(Rodzaj_Sprzetu k){
        openSessionWithTrans();
        Query query = getCurrentLocalSession().createSQLQuery("call UPDATE_RODZAJ_SPRZETU(:id_rodzajsprzetu,:rodzaj)");
        query.setParameter("id_rodzajsprzetu", k.getId_rodzajsprzetu());
        query.setParameter("rodzaj", k.getRodzaj());
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

