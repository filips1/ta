/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import DAO.*;
import java.io.PrintWriter;
import static java.lang.Integer.parseInt;
import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;
import static javafx.application.ConditionalFeature.FXML;
import javafx.beans.property.ReadOnlyObjectWrapper;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.util.StringConverter;
import model.*;
import javafx.stage.Stage;

public class Grasprzet_controller {

    @FXML
    private ChoiceBox choice_sprzet;
    @FXML
    private ChoiceBox choice_gra;
    @FXML
    private Button add_sprzetgra;
    @FXML
    private Button del_sprzetgra;
    @FXML
    private Button update_sprzetgra;
    @FXML
    private Button update_sprzetgra2;
    @FXML
    private TableColumn<Sprzetgra, Integer> col_id_s;
    @FXML
    private TableColumn<Sprzetgra, Integer> col_id_g;
    @FXML
    private Button button1;
    @FXML
    private Button button2;
    @FXML
    private TableView<Sprzetgra> SprzetgraTable;
    @FXML
    private AnchorPane newPane;
    
    private final SprzetgraDAO sprzetgraDAO = new SprzetgraDAO();

    @FXML
    private void initialize() throws Exception {
        refresh();
        populateTable();
        
        button1.setOnAction((ActionEvent event)->{
            try{
                Parent tableViewParent = FXMLLoader.load(getClass().getResource("KonsoleView.fxml"));
                Scene tableViewScene = new Scene(tableViewParent);
                
                Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
                
                window.setScene(tableViewScene);
                window.show();
            }catch(Exception e){System.out.println("Blad button1");}
        });
        button2.setOnAction((ActionEvent event)->{
            try{
                Parent tableViewParent = FXMLLoader.load(getClass().getResource("GryView.fxml"));
                Scene tableViewScene = new Scene(tableViewParent);
                
                Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
                
                window.setScene(tableViewScene);
                window.show();
            }catch(Exception e){System.out.println("Blad button2");}
        });
        
        add_sprzetgra.setOnAction((ActionEvent event)->{
            if(choice_sprzet.getValue() != null && choice_gra.getValue() != null){
                Sprzetgra sprzetgra = new Sprzetgra();
                Sprzetgra sprzetgra2 = new Sprzetgra();
                sprzetgra = (Sprzetgra) choice_sprzet.getValue();
                sprzetgra2 = (Sprzetgra) choice_gra.getValue();
                sprzetgraDAO.create(sprzetgra, sprzetgra2);
                clear();
                refresh();
            }
        });
        
        del_sprzetgra.setOnAction((ActionEvent event)->{
            if(choice_sprzet.getValue() != null && choice_gra.getValue() != null){
                Sprzetgra sprzetgra = new Sprzetgra();
                Sprzetgra sprzetgra2 = new Sprzetgra();
                sprzetgra = (Sprzetgra) choice_sprzet.getValue();
                sprzetgra2 = (Sprzetgra) choice_gra.getValue();
                sprzetgraDAO.delete(sprzetgra, sprzetgra2);
                clear();
                refresh();
            }
        });

        update_sprzetgra.setOnAction((ActionEvent event)->{
            if(choice_sprzet.getValue() != null && choice_gra.getValue() != null){
                Sprzetgra sprzetgra = new Sprzetgra();
                Sprzetgra sprzetgra2 = new Sprzetgra();
                sprzetgra = (Sprzetgra) choice_sprzet.getValue();
                sprzetgra2 = (Sprzetgra) choice_gra.getValue();
                sprzetgraDAO.update(sprzetgra, sprzetgra2);
                clear();
                refresh();
            }
        });
        update_sprzetgra2.setOnAction((ActionEvent event)->{
            if(choice_sprzet.getValue() != null && choice_gra.getValue() != null){
                Sprzetgra sprzetgra = new Sprzetgra();
                Sprzetgra sprzetgra2 = new Sprzetgra();
                sprzetgra = (Sprzetgra) choice_sprzet.getValue();
                sprzetgra2 = (Sprzetgra) choice_gra.getValue();
                sprzetgraDAO.update2(sprzetgra, sprzetgra2);
                clear();
                refresh();
            }
        });
    }

    @FXML
    private void populateTable() {
        col_id_g.setCellValueFactory(new PropertyValueFactory<>("id_gry"));
        col_id_s.setCellValueFactory(new PropertyValueFactory<>("id_sprzetu"));
        SprzetgraTable.setItems(FXCollections.observableList(sprzetgraDAO.getAll())); 
    }
    @FXML
    private void refresh() {
        fillSprzetBox();
        fillProducentBox();
        SprzetgraTable.setItems(FXCollections.observableList(sprzetgraDAO.getAll())); 
    }
    
    @FXML
    private void fillSprzetBox(){
        choice_sprzet.setItems(FXCollections.observableArrayList(sprzetgraDAO.getAll()));
    }
    @FXML
    private void fillProducentBox(){
        choice_gra.setItems(FXCollections.observableArrayList(sprzetgraDAO.getAll()));
    }
    
    @FXML
    private void clear(){
        choice_sprzet.valueProperty().set(null);
        choice_gra.valueProperty().set(null);
    }

}