/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import model.Gra;
import model.Gatunek;
import model.Sprzet;
import model.Producent_Sprzetu;
import model.Producent_Gry;
import model.Region_Gry;
import model.Region_Sprzetu;
import model.Rodzaj_Sprzetu;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import static org.hibernate.boot.registry.StandardServiceRegistryBuilder.destroy;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class HibernateUtil {

    private static SessionFactory sessionFactory;
    private static Session session;
    private static ServiceRegistry registry;
    private static Transaction transact;
    private static Configuration config;
    
    public static void StartSessionFactory(){
       try {
            config = new Configuration().configure("/config/hibernate.cfg.xml");
                          config.addAnnotatedClass(Gra.class);
                          config.addAnnotatedClass(Gatunek.class);
                          config.addAnnotatedClass(Producent_Sprzetu.class);
                          config.addAnnotatedClass(Region_Gry.class);
                          config.addAnnotatedClass(Region_Sprzetu.class);
                          config.addAnnotatedClass(Rodzaj_Sprzetu.class);
                          config.addAnnotatedClass(Sprzet.class);
                          config.addAnnotatedClass(Producent_Gry.class);
                          


            registry = new StandardServiceRegistryBuilder().applySettings(config.getProperties()).build();

            sessionFactory = config.buildSessionFactory(registry);
        }   
        catch (HibernateException ex) {
            System.err.println("Blad podczas tworzenia sesji." + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }
    
    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
  
    public Session openSessionWithoutTrans(){
          session = getSessionFactory().openSession();
          return session;
    }
    
    public Session openSessionWithTrans(){
           session = getSessionFactory().openSession();
           transact = session.beginTransaction();
           return session;
    }
    
    public void closeSessionWithoutTrans(){
            getCurrentLocalSession().close();
    }
    
    public void closeSessionWithTrans(){
            getCurrentLocalTransac().commit();
            getCurrentLocalSession().close();
    }
    
    public Session getCurrentLocalSession(){
        return session;
    }
    
    public Transaction getCurrentLocalTransac(){
        return transact;
    }
    
    public static void CloseConnection(){
        sessionFactory.close();
        destroy(registry);
    }
    
    public static void OpenConnection(){
        StartSessionFactory();
    }
}