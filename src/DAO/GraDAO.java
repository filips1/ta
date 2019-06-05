/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Query;
import model.Gra;
import model.Region_Gry;
import model.Producent_Gry;
import model.Gatunek;
import model.Sprzet;
import DAO.HibernateUtil;
/**
 *
 * @author Arlen
 */
public class GraDAO extends HibernateUtil {
        
    public List<Gra> getAll() {
         openSessionWithTrans();
         List<Gra> list = new ArrayList<Gra>();
            getCurrentLocalSession().doWork((Connection connection) -> {
            CallableStatement statement = connection.prepareCall("{call GET_GRA(?)}");
            statement.registerOutParameter(1, oracle.jdbc.OracleTypes.CURSOR);
            statement.execute();
            ResultSet rs = (ResultSet)statement.getObject(1);
            
            while(rs.next()){
                Gra gra = new Gra();
                int id_gra = rs.getInt("id_gra");
                String nazwa_gry = rs.getString("nazwa_gry");
                String opis = rs.getString("opis");
                int rok_produkcji = rs.getInt("rok_produkcji");
                int cena_nowej_gry = rs.getInt("cena_nowej_gry");
                int cena_pelna = rs.getInt("cena_pelna");
                int cena_samej_gry = rs.getInt("cena_samej_gry");
                
                
                Region_Gry rg = new Region_Gry();
                int id_regiongry = rs.getInt("id_regiongry");
                String region = rs.getString("region");
                rg.setId_regiongry(id_regiongry);
                rg.setRegion(region);
                
                
                Producent_Gry pg = new Producent_Gry();
                int id_prodgry = rs.getInt("id_prodgry");
                String nazwa_firmy = rs.getString("nazwa_firmy");
                pg.setId_prodgry(id_prodgry);
                pg.setNazwa_firmy(nazwa_firmy);
                
               
                Gatunek gat = new Gatunek();
                int id_gatunek = rs.getInt("id_gatunek");
                String gatunek_gry = rs.getString("gatunek_gry");
                gat.setId_gatunek(id_gatunek);
                gat.setGatunek_gry(gatunek_gry);
                
                gra.setId_gra(id_gra);
                gra.setId_regiongry(rg);
                gra.setId_prodgry(pg);
                gra.setId_gatunek(gat);
                gra.setNazwa_gry(nazwa_gry);
                gra.setOpis(opis);
                gra.setRok_produkcji(rok_produkcji);
                gra.setCena_nowej_gry(cena_nowej_gry);
                gra.setCena_pelna(cena_pelna);
                gra.setCena_samej_gry(cena_samej_gry);
                list.add(gra);
                }
          }); 
         closeSessionWithTrans();
         return list;
    };
    
    public List<Gra> getAllById(Gra k) {
         openSessionWithTrans();
         List<Gra> list = new ArrayList<Gra>();
            getCurrentLocalSession().doWork((Connection connection) -> {
            CallableStatement statement = connection.prepareCall("{call GET_GRA_ID(?,?)}");
            statement.setInt(1, k.getId_gra());
            statement.registerOutParameter(2, oracle.jdbc.OracleTypes.CURSOR);
            statement.execute();
            ResultSet rs = (ResultSet)statement.getObject(1);
            
            while(rs.next()){
                Gra gra = new Gra();
                int id_gra = rs.getInt("id_gra");
                String nazwa_gry = rs.getString("nazwa_gry");
                String opis = rs.getString("opis");
                int rok_produkcji = rs.getInt("rok_produkcji");
                int cena_nowej_gry = rs.getInt("cena_nowej_gry");
                int cena_pelna = rs.getInt("cena_pelna");
                int cena_samej_gry = rs.getInt("cena_samej_gry");
                
                
                Region_Gry rg = new Region_Gry();
                int id_regiongry = rs.getInt("id_regiongry");
                String region = rs.getString("region");
                rg.setId_regiongry(id_regiongry);
                rg.setRegion(region);
                
                
                Producent_Gry pg = new Producent_Gry();
                int id_prodgry = rs.getInt("id_prodgry");
                String nazwa_firmy = rs.getString("nazwa_firmy");
                pg.setId_prodgry(id_prodgry);
                pg.setNazwa_firmy(nazwa_firmy);
                
               
                Gatunek gat = new Gatunek();
                int id_gatunek = rs.getInt("id_gatunek");
                String gatunek_gry = rs.getString("gatunek_gry");
                gat.setId_gatunek(id_gatunek);
                gat.setGatunek_gry(gatunek_gry);
                
                gra.setId_gra(id_gra);
                gra.setId_regiongry(rg);
                gra.setId_prodgry(pg);
                gra.setId_gatunek(gat);
                gra.setNazwa_gry(nazwa_gry);
                gra.setOpis(opis);
                gra.setRok_produkcji(rok_produkcji);
                gra.setCena_nowej_gry(cena_nowej_gry);
                gra.setCena_pelna(cena_pelna);
                gra.setCena_samej_gry(cena_samej_gry);
                list.add(gra);
                }
          }); 
         closeSessionWithTrans();
         return list;
    };
    
    public List<Gra> getAllByName(Gra k) {
         openSessionWithTrans();
         List<Gra> list = new ArrayList<Gra>();
            getCurrentLocalSession().doWork((Connection connection) -> {
            CallableStatement statement = connection.prepareCall("{call GET_GRA_NAZWA(?,?)}");
            statement.setString(1, k.getNazwa_gry());
            statement.registerOutParameter(2, oracle.jdbc.OracleTypes.CURSOR);
            statement.execute();
            ResultSet rs = (ResultSet)statement.getObject(1);
            
            while(rs.next()){
                Gra gra = new Gra();
                int id_gra = rs.getInt("id_gra");
                String nazwa_gry = rs.getString("nazwa_gry");
                String opis = rs.getString("opis");
                int rok_produkcji = rs.getInt("rok_produkcji");
                int cena_nowej_gry = rs.getInt("cena_nowej_gry");
                int cena_pelna = rs.getInt("cena_pelna");
                int cena_samej_gry = rs.getInt("cena_samej_gry");
                
                
                Region_Gry rg = new Region_Gry();
                int id_regiongry = rs.getInt("id_regiongry");
                String region = rs.getString("region");
                rg.setId_regiongry(id_regiongry);
                rg.setRegion(region);
                
                
                Producent_Gry pg = new Producent_Gry();
                int id_prodgry = rs.getInt("id_prodgry");
                String nazwa_firmy = rs.getString("nazwa_firmy");
                pg.setId_prodgry(id_prodgry);
                pg.setNazwa_firmy(nazwa_firmy);
                
               
                Gatunek gat = new Gatunek();
                int id_gatunek = rs.getInt("id_gatunek");
                String gatunek_gry = rs.getString("gatunek_gry");
                gat.setId_gatunek(id_gatunek);
                gat.setGatunek_gry(gatunek_gry);
                
                gra.setId_gra(id_gra);
                gra.setId_regiongry(rg);
                gra.setId_prodgry(pg);
                gra.setId_gatunek(gat);
                gra.setNazwa_gry(nazwa_gry);
                gra.setOpis(opis);
                gra.setRok_produkcji(rok_produkcji);
                gra.setCena_nowej_gry(cena_nowej_gry);
                gra.setCena_pelna(cena_pelna);
                gra.setCena_samej_gry(cena_samej_gry);
                list.add(gra);
                }
          }); 
         closeSessionWithTrans();
         return list;
    };
    
    public void update(Gra k){
        openSessionWithTrans();
        Query query = getCurrentLocalSession().createSQLQuery("call UPDATE_GRA(:id_gra,:id_regiongry,:id_prodgry,:id_gatunek,:nazwa_gry,:opis,:rok_produkcji,:cena_nowej_gry,:cena_pelna,:cena_samej_gry)");
        query.setParameter("id_gra", k.getId_gra());
        query.setParameter("id_regiongry", k.getId_regiongry());
        query.setParameter("id_prodgry", k.getId_prodgry());
        query.setParameter("id_gatunek", k.getId_gatunek());
        query.setParameter("nazwa_gry", k.getNazwa_gry());
        query.setParameter("opis", k.getOpis());
        query.setParameter("rok_produkcji", k.getRok_produkcji());
        query.setParameter("cena_nowej_gry", k.getCena_nowej_gry());
        query.setParameter("cena_pelna", k.getCena_pelna());
        query.setParameter("cena_samej_gry", k.getCena_samej_gry());
        query.executeUpdate();
        closeSessionWithTrans();
    };
    public void delete(Gra k){
        openSessionWithTrans();
        Query query = getCurrentLocalSession().createSQLQuery("call DELETE_GRA(:id_gra)").setParameter("id_gra", k.getId_gra());
        query.executeUpdate();
        closeSessionWithTrans();
    };
    public void create(Gra k){
        openSessionWithTrans();
        Query query = getCurrentLocalSession().createSQLQuery("call INSERT_GRA(:id_regiongry,:id_prodgry,:id_gatunek,:nazwa_gry,:opis,:rok_produkcji,:cena_nowej_gry,:cena_pelna,:cena_samej_gry)");
        query.setParameter("id_regiongry", k.getId_regiongry());
        query.setParameter("id_prodgry", k.getId_prodgry());
        query.setParameter("id_gatunek", k.getId_gatunek());
        query.setParameter("nazwa_gry", k.getNazwa_gry());
        query.setParameter("opis", k.getOpis());
        query.setParameter("rok_produkcji", k.getRok_produkcji());
        query.setParameter("cena_nowej_gry", k.getCena_nowej_gry());
        query.setParameter("cena_pelna", k.getCena_pelna());
        query.setParameter("cena_samej_gry", k.getCena_samej_gry());
        query.executeUpdate();
        closeSessionWithTrans();
};

    public GraDAO(){};
}
