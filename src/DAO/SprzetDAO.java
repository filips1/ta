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
import model.Sprzet;
import model.Region_Sprzetu;
import model.Producent_Sprzetu;
import model.Rodzaj_Sprzetu;
import DAO.HibernateUtil;
/**
 *
 * @author Arlen
 */
public class SprzetDAO extends HibernateUtil {

    public List<Sprzet> getAll() {
         openSessionWithTrans();
         List<Sprzet> list = new ArrayList<Sprzet>();
            getCurrentLocalSession().doWork((Connection connection) -> {
            CallableStatement statement = connection.prepareCall("{call GET_SPRZET(?)}");
            statement.registerOutParameter(1, oracle.jdbc.OracleTypes.CURSOR);
            statement.execute();
            ResultSet rs = (ResultSet)statement.getObject(1);
            while(rs.next()){
                Sprzet sprzet = new Sprzet();
                int id_sprzet = rs.getInt("id_sprzet");
                String nazwa = rs.getString("nazwa");
                int cena = rs.getInt("cena");
                String specyfikacja = rs.getString("specyfikacja");
                int generacja = rs.getInt("generacja");
                int rok_poczatku_produkcji = rs.getInt("rok_poczatku_produkcji");
                int rok_zakonczenia_produkcji = rs.getInt("rok_zakonczenia_produkcji");
                Region_Sprzetu res = new Region_Sprzetu();
                int id_regionsprzetu = rs.getInt("id_regionsprzetu");
                String region = rs.getString("region");
                res.setId_regionsprzetu(id_regionsprzetu);
                res.setRegion(region);
                
                Producent_Sprzetu ps = new Producent_Sprzetu();
                int id_prodsprzetu = rs.getInt("id_prodsprzetu");
                String nazwa_firmy = rs.getString("nazwa_firmy");
                ps.setId_prodsprzetu(id_prodsprzetu);
                ps.setNazwa_firmy(nazwa_firmy);
               
                Rodzaj_Sprzetu ros = new Rodzaj_Sprzetu();
                int id_rodzajsprzetu = rs.getInt("id_rodzajsprzetu");
                String rodzaj = rs.getString("rodzaj");
                ros.setId_rodzajsprzetu(id_rodzajsprzetu);
                ros.setRodzaj(rodzaj);
                
                sprzet.setId_sprzet(id_sprzet);
                sprzet.setId_regionsprzetu(res);
                sprzet.setId_prodsprzetu(ps);
                sprzet.setId_rodzajsprzetu(ros);
                sprzet.setNazwa(nazwa);
                sprzet.setCena(cena);
                sprzet.setSpecyfikacja(specyfikacja);
                sprzet.setGeneracja(generacja);
                sprzet.setRok_poczatku_produkcji(rok_poczatku_produkcji);
                sprzet.setRok_zakonczenia_produkcji(rok_zakonczenia_produkcji);
                list.add(sprzet);
                }
          }); 
         closeSessionWithTrans();
         return list;
    };
    
    public List<Sprzet> getAllbyId(Sprzet k) {
         openSessionWithTrans();
         List<Sprzet> list = new ArrayList<Sprzet>();
            getCurrentLocalSession().doWork((Connection connection) -> {
            CallableStatement statement = connection.prepareCall("{call GET_SPRZET_ID(?,?)}");
            statement.setInt(1, k.getId_sprzet());
            statement.registerOutParameter(2, oracle.jdbc.OracleTypes.CURSOR);
            statement.execute();
            ResultSet rs = (ResultSet)statement.getObject(2);
            while(rs.next()){
                Sprzet sprzet = new Sprzet();
                int id_sprzet = rs.getInt("id_sprzet");
                String nazwa = rs.getString("nazwa");
                int cena = rs.getInt("cena");
                String specyfikacja = rs.getString("specyfikacja");
                int generacja = rs.getInt("generacja");
                int rok_poczatku_produkcji = rs.getInt("rok_poczatku_produkcji");
                int rok_zakonczenia_produkcji = rs.getInt("rok_zakonczenia_produkcji");
                Region_Sprzetu res = new Region_Sprzetu();
                int id_regionsprzetu = rs.getInt("id_regionsprzetu");
                String region = rs.getString("region");
                res.setId_regionsprzetu(id_regionsprzetu);
                res.setRegion(region);
                
                Producent_Sprzetu ps = new Producent_Sprzetu();
                int id_prodsprzetu = rs.getInt("id_prodsprzetu");
                String nazwa_firmy = rs.getString("nazwa_firmy");
                ps.setId_prodsprzetu(id_prodsprzetu);
                ps.setNazwa_firmy(nazwa_firmy);
               
                Rodzaj_Sprzetu ros = new Rodzaj_Sprzetu();
                int id_rodzajsprzetu = rs.getInt("id_rodzajsprzetu");
                String rodzaj = rs.getString("rodzaj");
                ros.setId_rodzajsprzetu(id_rodzajsprzetu);
                ros.setRodzaj(rodzaj);
                
                sprzet.setId_sprzet(id_sprzet);
                sprzet.setId_regionsprzetu(res);
                sprzet.setId_prodsprzetu(ps);
                sprzet.setId_rodzajsprzetu(ros);
                sprzet.setNazwa(nazwa);
                sprzet.setCena(cena);
                sprzet.setSpecyfikacja(specyfikacja);
                sprzet.setGeneracja(generacja);
                sprzet.setRok_poczatku_produkcji(rok_poczatku_produkcji);
                sprzet.setRok_zakonczenia_produkcji(rok_zakonczenia_produkcji);
                list.add(sprzet);
                }
          }); 
         closeSessionWithTrans();
         return list;
    };
    
    public List<Sprzet> getAllbyName(Sprzet k) {
         openSessionWithTrans();
         List<Sprzet> list = new ArrayList<Sprzet>();
            getCurrentLocalSession().doWork((Connection connection) -> {
            CallableStatement statement = connection.prepareCall("{call GET_SPRZET_NAZWA(?,?)}");
            statement.setString(1, k.getNazwa());
            statement.registerOutParameter(2, oracle.jdbc.OracleTypes.CURSOR);
            statement.execute();
            ResultSet rs = (ResultSet)statement.getObject(2);
            while(rs.next()){
                Sprzet sprzet = new Sprzet();
                int id_sprzet = rs.getInt("id_sprzet");
                String nazwa = rs.getString("nazwa");
                int cena = rs.getInt("cena");
                String specyfikacja = rs.getString("specyfikacja");
                int generacja = rs.getInt("generacja");
                int rok_poczatku_produkcji = rs.getInt("rok_poczatku_produkcji");
                int rok_zakonczenia_produkcji = rs.getInt("rok_zakonczenia_produkcji");
                Region_Sprzetu res = new Region_Sprzetu();
                int id_regionsprzetu = rs.getInt("id_regionsprzetu");
                String region = rs.getString("region");
                res.setId_regionsprzetu(id_regionsprzetu);
                res.setRegion(region);
                
                Producent_Sprzetu ps = new Producent_Sprzetu();
                int id_prodsprzetu = rs.getInt("id_prodsprzetu");
                String nazwa_firmy = rs.getString("nazwa_firmy");
                ps.setId_prodsprzetu(id_prodsprzetu);
                ps.setNazwa_firmy(nazwa_firmy);
               
                Rodzaj_Sprzetu ros = new Rodzaj_Sprzetu();
                int id_rodzajsprzetu = rs.getInt("id_rodzajsprzetu");
                String rodzaj = rs.getString("rodzaj");
                ros.setId_rodzajsprzetu(id_rodzajsprzetu);
                ros.setRodzaj(rodzaj);
                
                sprzet.setId_sprzet(id_sprzet);
                sprzet.setId_regionsprzetu(res);
                sprzet.setId_prodsprzetu(ps);
                sprzet.setId_rodzajsprzetu(ros);
                sprzet.setNazwa(nazwa);
                sprzet.setCena(cena);
                sprzet.setSpecyfikacja(specyfikacja);
                sprzet.setGeneracja(generacja);
                sprzet.setRok_poczatku_produkcji(rok_poczatku_produkcji);
                sprzet.setRok_zakonczenia_produkcji(rok_zakonczenia_produkcji);
                list.add(sprzet);
                }
          }); 
         closeSessionWithTrans();
         return list;
    };
    
    public void update(Sprzet k){
        openSessionWithTrans();
        Query query = getCurrentLocalSession().createSQLQuery("call UPDATE_SPRZET(:id_sprzet,:id_regionsprzetu,:id_prodsprzetu,:id_rodzajsprzetu,:nazwa,:cena,:specyfikacja,:generacja,:rok_poczatku_produkcji,:rok_zakonczenia_produkcji)");
        query.setParameter("id_sprzet", k.getId_sprzet());
        query.setParameter("id_regionsprzetu", k.getId_regionsprzetu());
        query.setParameter("id_prodsprzetu", k.getId_prodsprzetu());
        query.setParameter("id_rodzajsprzetu", k.getId_rodzajsprzetu());
        query.setParameter("nazwa", k.getNazwa());
        query.setParameter("cena", k.getCena());
        query.setParameter("specyfikacja", k.getSpecyfikacja());
        query.setParameter("generacja", k.getGeneracja());
        query.setParameter("rok_poczatku_produkcji", k.getRok_poczatku_produkcji());
        query.setParameter("rok_zakonczenia_produkcji", k.getRok_zakonczenia_produkcji());
        query.executeUpdate();
        closeSessionWithTrans();
    };
    public void delete(Sprzet k){
        openSessionWithTrans();
        Query query = getCurrentLocalSession().createSQLQuery("call DELETE_SPRZET(:id_sprzet)").setParameter("id_sprzet", k.getId_sprzet());
        query.executeUpdate();
        closeSessionWithTrans();
    };
    public void create(Sprzet k){
        openSessionWithTrans();
        Query query = getCurrentLocalSession().createSQLQuery("call INSERT_SPRZET(:id_regionsprzetu,:id_prodsprzetu,:id_rodzajsprzetu,:nazwa,:cena,:specyfikacja,:generacja,:rok_poczatku_produkcji,:rok_zakonczenia_produkcji)");
        query.setParameter("id_regionsprzetu", k.getId_regionsprzetu());
        query.setParameter("id_prodsprzetu", k.getId_prodsprzetu());
        query.setParameter("id_rodzajsprzetu", k.getId_rodzajsprzetu());
        query.setParameter("nazwa", k.getNazwa());
        query.setParameter("cena", k.getCena());
        query.setParameter("specyfikacja", k.getSpecyfikacja());
        query.setParameter("generacja", k.getGeneracja());
        query.setParameter("rok_poczatku_produkcji", k.getRok_poczatku_produkcji());
        query.setParameter("rok_zakonczenia_produkcji", k.getRok_zakonczenia_produkcji());
        query.executeUpdate();
        closeSessionWithTrans();
    };

    public SprzetDAO(){};
}
