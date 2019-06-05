/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import DAO.HibernateUtil;
import controller.*;
import main.*;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author ACER
 */
public class MainApplication extends Application{

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    @Override
    public void start(Stage primaryStage)throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("/controller/GrasprzetView.fxml"));
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public static void main(String[] args) {
        HibernateUtil.OpenConnection();
        launch(args);
        HibernateUtil.CloseConnection();
    }
    
}
