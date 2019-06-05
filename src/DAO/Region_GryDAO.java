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
import model.Region_Gry;
import org.hibernate.Query;


public class Region_GryDAO extends HibernateUtil {
   
   
    public List<Region_Gry> getAll() {
        
         openSessionWithTrans();
         List<Region_Gry> list = new ArrayList<Region_Gry>();
            getCurrentLocalSession().doWork((Connection connection) -> {
            CallableStatement statement = null;
             try {
                 statement = connection.prepareCall("{call GET_REGION_GRY(?)}");
                  statement.registerOutParameter(1, oracle.jdbc.OracleTypes.CURSOR);
                    statement.execute();
                  ResultSet rs = (ResultSet)statement.getObject(1);
                   while(rs.next()){
                Region_Gry rg = new Region_Gry();
                int id_regiongry = rs.getInt("id_regiongry");
                String region = rs.getString("region");
                rg.setId_regiongry(id_regiongry);
                rg.setRegion(region);
                
                list.add(rg);
                }
             } catch (SQLException ex) {
                 Logger.getLogger(Region_GryDAO.class.getName()).log(Level.SEVERE, null, ex);
             }
          }); 
        closeSessionWithTrans();
        
        return list;
         
    };
    
    public void update(Region_Gry k, Region_Gry k2){
        openSessionWithTrans();
        Query query = getCurrentLocalSession().createSQLQuery("call UPDATE_REGION_GRY(:region,:regionnew)");
        query.setParameter("region", k.getRegion());
        query.setParameter("regionnew", k2.getRegion());
        query.executeUpdate();
        closeSessionWithTrans();
    };
    public void delete(Region_Gry k){
        openSessionWithTrans();
        Query query = getCurrentLocalSession().createSQLQuery("call DELETE_REGION_GRY(:region)").setParameter("region", k.getRegion());
        query.executeUpdate();
        closeSessionWithTrans();
    };
    public void create(Region_Gry k){
        openSessionWithTrans();
        Query query = getCurrentLocalSession().createSQLQuery("call INSERT_REGION_GRY(:region)").setParameter("region", k.getRegion());
        query.executeUpdate();
        closeSessionWithTrans();
    };
   
    
    public Region_GryDAO(){};
}

