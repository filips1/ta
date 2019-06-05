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
import model.Sprzetgra;
import org.hibernate.Query;


public class SprzetgraDAO extends HibernateUtil {
   
    
    public List<Sprzetgra> getAll() {
        
         openSessionWithTrans();
         List<Sprzetgra> list = new ArrayList<Sprzetgra>();
            getCurrentLocalSession().doWork((Connection connection) -> {
            CallableStatement statement = null;
             try {
                 statement = connection.prepareCall("{call GET_SPRZETGRA(?)}");
                  statement.registerOutParameter(1, oracle.jdbc.OracleTypes.CURSOR);
                    statement.execute();
                  ResultSet rs = (ResultSet)statement.getObject(1);
                   while(rs.next()){
                Sprzetgra sg = new Sprzetgra();
                int id_gry = rs.getInt("id_gry");
                int id_sprzetu = rs.getInt("id_sprzetu");
                sg.setId_gry(id_gry);
                sg.setId_sprzetu(id_sprzetu);
                
                list.add(sg);
                }
             } catch (SQLException ex) {
                 Logger.getLogger(SprzetgraDAO.class.getName()).log(Level.SEVERE, null, ex);
             }
          }); 
        closeSessionWithTrans();
        
        return list;
         
    };
    
    public void update(Sprzetgra k, Sprzetgra k2){
        openSessionWithTrans();
        Query query = getCurrentLocalSession().createSQLQuery("call UPDATE_SPRZETGRA(:id_gry,:id_sprzetu)");
        query.setParameter("id_gry", k2.getId_gry());
        query.setParameter("id_sprzetu", k.getId_sprzetu());
        query.executeUpdate();
        closeSessionWithTrans();
    };
    public void update2(Sprzetgra k, Sprzetgra k2){
        openSessionWithTrans();
        Query query = getCurrentLocalSession().createSQLQuery("call UPDATE_SPRZETGRA2(:id_gry,:id_sprzetu)");
        query.setParameter("id_gry", k2.getId_gry());
        query.setParameter("id_sprzetu", k.getId_sprzetu());
        query.executeUpdate();
        closeSessionWithTrans();
    };
    public void delete(Sprzetgra k, Sprzetgra k2){
        openSessionWithTrans();
        Query query = getCurrentLocalSession().createSQLQuery("call DELETE_SPRZETGRA(:id_gry, id_sprzetu)");
        query.setParameter("id_gry", k2.getId_gry());
        query.setParameter("id_sprzetu", k.getId_sprzetu());
        query.executeUpdate();
        closeSessionWithTrans();
    };
    public void create(Sprzetgra k, Sprzetgra k2){
        openSessionWithTrans();
        Query query = getCurrentLocalSession().createSQLQuery("call INSERT_SPRZETGRA(:id_gry, id_sprzetu)");
        query.setParameter("id_gry", k2.getId_gry());
        query.setParameter("id_sprzetu", k.getId_sprzetu());
        query.executeUpdate();
        closeSessionWithTrans();
    };
   
    public SprzetgraDAO(){};
}

