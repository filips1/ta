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
import model.Region_Sprzetu;
import org.hibernate.Query;


public class Region_SprzetuDAO extends HibernateUtil {
   
   
    public List<Region_Sprzetu> getAll() {
        
         openSessionWithTrans();
         List<Region_Sprzetu> list = new ArrayList<Region_Sprzetu>();
            getCurrentLocalSession().doWork((Connection connection) -> {
            CallableStatement statement = null;
             try {
                 statement = connection.prepareCall("{call GET_REGION_SPRZETU(?)}");
                  statement.registerOutParameter(1, oracle.jdbc.OracleTypes.CURSOR);
                    statement.execute();
                  ResultSet rs = (ResultSet)statement.getObject(1);
                   while(rs.next()){
                Region_Sprzetu res = new Region_Sprzetu();
                int id_regionsprzetu = rs.getInt("id_regionsprzetu");
                String region = rs.getString("region");
                res.setId_regionsprzetu(id_regionsprzetu);
                res.setRegion(region);
                
                list.add(res);
                }
             } catch (SQLException ex) {
                 Logger.getLogger(Region_SprzetuDAO.class.getName()).log(Level.SEVERE, null, ex);
             }
          }); 
        closeSessionWithTrans();
        
        return list;
         
    };
    
    public void update(Region_Sprzetu k,Region_Sprzetu k2){
        openSessionWithTrans();
        Query query = getCurrentLocalSession().createSQLQuery("call UPDATE_REGION_SPRZETU(:region,:regionnew)");
        query.setParameter("region", k.getRegion());
        query.setParameter("regionnew", k2.getRegion());
        query.executeUpdate();
        closeSessionWithTrans();
    };
    public void delete(Region_Sprzetu k){
        openSessionWithTrans();
        Query query = getCurrentLocalSession().createSQLQuery("call DELETE_REGION_SPRZETU(:region)").setParameter("region", k.getRegion());
        query.executeUpdate();
        closeSessionWithTrans();
    };
    public void create(Region_Sprzetu k){
        openSessionWithTrans();
        Query query = getCurrentLocalSession().createSQLQuery("call INSERT_REGION_SPRZETU(:region)").setParameter("region", k.getRegion());
        query.executeUpdate();
        closeSessionWithTrans();
    };
   
    
    public Region_SprzetuDAO(){};
}

