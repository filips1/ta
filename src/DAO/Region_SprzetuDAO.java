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
    
    public void update(Region_Sprzetu k){
        openSessionWithTrans();
        Query query = getCurrentLocalSession().createSQLQuery("call UPDATE_REGION_SPRZETU(:id_regionsprzetu,:region)");
        query.setParameter("id_regionsprzetu", k.getId_regionsprzetu());
        query.setParameter("region", k.getRegion());
        query.executeUpdate();
        closeSessionWithTrans();
    };
    public void delete(Region_Sprzetu k){
        openSessionWithTrans();
        Query query = getCurrentLocalSession().createSQLQuery("call DELETE_REGION_SPRZETU(:regions)").setParameter("region", k.getRegion());
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

