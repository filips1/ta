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
import model.Gatunek;
import org.hibernate.Query;


public class GatunekDAO extends HibernateUtil {
   
    
    public List<Gatunek> getAll() {
        
         openSessionWithTrans();
         List<Gatunek> list = new ArrayList<Gatunek>();
            getCurrentLocalSession().doWork((Connection connection) -> {
            CallableStatement statement = null;
             try {
                 statement = connection.prepareCall("{call GET_GATUNEK(?)}");
                  statement.registerOutParameter(1, oracle.jdbc.OracleTypes.CURSOR);
                    statement.execute();
                  ResultSet rs = (ResultSet)statement.getObject(1);
                   while(rs.next()){
                Gatunek gat = new Gatunek();
                int id_gatunku = rs.getInt("id_gatunek");
                String gatunek_gry = rs.getString("gatunek_gry");
                gat.setId_gatunek(id_gatunku);
                gat.setGatunek_gry(gatunek_gry);
                
                list.add(gat);
                }
             } catch (SQLException ex) {
                 Logger.getLogger(GatunekDAO.class.getName()).log(Level.SEVERE, null, ex);
             }
          }); 
        closeSessionWithTrans();
        
        return list;
         
    };
    
    public void update(Gatunek k, Gatunek k2){
        openSessionWithTrans();
        Query query = getCurrentLocalSession().createSQLQuery("call UPDATE_GATUNEK(:gatunek_gry,:gatunek_grynew)");
        query.setParameter("gatunek_gry", k.getGatunek_gry());
        query.setParameter("gatunek_grynew", k2.getGatunek_gry());
        query.executeUpdate();
        closeSessionWithTrans();
    };
    public void delete(Gatunek k){
        openSessionWithTrans();
        Query query = getCurrentLocalSession().createSQLQuery("call DELETE_GATUNEK(:gatunek_gry)").setParameter("gatunek_gry", k.getGatunek_gry());
        query.executeUpdate();
        closeSessionWithTrans();
    };
    public void create(Gatunek k){
        openSessionWithTrans();
        Query query = getCurrentLocalSession().createSQLQuery("call INSERT_GATUNEK(:gatunek_gry)").setParameter("gatunek_gry", k.getGatunek_gry());
        query.executeUpdate();
        closeSessionWithTrans();
    };
   
    
    public GatunekDAO(){};
}

