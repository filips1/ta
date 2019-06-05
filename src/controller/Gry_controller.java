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

public class Gry_controller {

    @FXML
    private TextField insert_nazwa;
    @FXML
    private ChoiceBox choose_producent;
    @FXML
    private TextField insert_rok_p;
    @FXML
    private TextField insert_opis;
    @FXML
    private TextField insert_cena_n;
    @FXML
    private TextField insert_cena_p;
    @FXML
    private ChoiceBox choose_gatunek;
    @FXML
    private ChoiceBox choose_region;
    @FXML
    private TextField insert_cena_s;
    @FXML
    private Button add_gra;
    @FXML
    private Button clear_gra_i;
    @FXML
    private TextField insert_gatunek;
    @FXML
    private TextField insert_producent;
    @FXML
    private TextField insert_region;
    @FXML
    private Button add_gatunek;
    @FXML
    private Button clear_gatunek;
    @FXML
    private Button add_producent;
    @FXML
    private Button clear_producent;
    @FXML
    private Button add_region;
    @FXML
    private Button clear_region;
    @FXML
    private TextField search_id_g;
    @FXML
    private TextField search_nazwa_g;
    @FXML
    private TextField search_rok_p;
    @FXML
    private TextField search_opis;
    @FXML
    private ChoiceBox search_prod_g;
    @FXML
    private TextField search_cena_n;
    @FXML
    private TextField search_cena_p;
    @FXML
    private ChoiceBox search_gatunek;
    @FXML
    private ChoiceBox search_region;
    @FXML
    private TextField search_cena_s;
    @FXML
    private Button search_btn_id_g;
    @FXML
    private Button search_btn_nazwa_g;
    @FXML
    private Button update_gra;
    @FXML
    private Button delete_gra;
    @FXML
    private Button search_all_gra;
    @FXML
    private Button clear_gra;
    @FXML
    private TextField update_gatunek;
    @FXML
    private TextField update_producent;
    @FXML
    private TextField update_region;
    @FXML
    private ChoiceBox choice_gatunek;
    @FXML
    private ChoiceBox choice_producent;
    @FXML
    private ChoiceBox choice_region;
    @FXML
    private Button update_btn_gatunek;
    @FXML
    private Button delete_btn_gatunek;
    @FXML
    private Button update_btn_producent;
    @FXML
    private Button delete_btn_producent;
    @FXML
    private Button update_btn_region;
    @FXML
    private Button delete_btn_region;
    @FXML
    private TableColumn<Gra, Integer> col_id_g;
    @FXML
    private TableColumn<Gra, String> col_nazwa_g;
    @FXML
    private TableColumn<Gra, Integer> col_rok_p;
    @FXML
    private TableColumn<Gra, String> col_opis;
    @FXML
    private TableColumn<Gra, String> col_prod;
    @FXML
    private TableColumn<Gra, Integer> col_cena_n;
    @FXML
    private TableColumn<Gra, Integer> col_cena_p;
    @FXML
    private TableColumn<Gra, Integer> col_cena_s;
    @FXML
    private TableColumn<Gra, String> col_gatunek;
    @FXML
    private TableColumn<Gra, String> col_region;
    @FXML
    private TableView<Gra> GraTable;
    @FXML
    private Button button1;
    @FXML
    private Button button2;
    
    private final GraDAO graDAO = new GraDAO();
    private final SprzetDAO sprzetDAO = new SprzetDAO();
    private final GatunekDAO gatunekDAO = new GatunekDAO();
    private final Producent_GryDAO producent_gryDAO = new Producent_GryDAO();
    private final Producent_SprzetuDAO producent_sprzetuDAO = new Producent_SprzetuDAO();
    private final Region_GryDAO region_gryDAO = new Region_GryDAO();
    private final Region_SprzetuDAO region_sprzetuDAO = new Region_SprzetuDAO();
    private final Rodzaj_SprzetuDAO rodzaj_sprzetuDAO = new Rodzaj_SprzetuDAO();

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
                Parent tableViewParent = FXMLLoader.load(getClass().getResource("SprzetgraView.fxml"));
                Scene tableViewScene = new Scene(tableViewParent);
                
                Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
                
                window.setScene(tableViewScene);
                window.show();
            }catch(Exception e){System.out.println("Blad button2");}
        });
        
        add_gra.setOnAction((ActionEvent event)->{
            if(insert_nazwa.getText() != null && !insert_nazwa.getText().isEmpty()){
                Gra gra = new Gra();
                gra.setNazwa_gry(insert_nazwa.getText());
                gra.setId_prodgry((Producent_Gry) choose_producent.getValue());
                gra.setRok_produkcji(parseInt(insert_rok_p.getText()));
                gra.setOpis(insert_opis.getText());
                gra.setCena_nowej_gry(parseInt(insert_cena_n.getText()));
                gra.setCena_pelna(parseInt(insert_cena_p.getText()));
                gra.setId_gatunek((Gatunek) choose_gatunek.getValue());
                gra.setId_regiongry((Region_Gry) choose_region.getValue());
                gra.setCena_samej_gry(parseInt(insert_cena_s.getText()));
                graDAO.create(gra);
                clearGraI();
                refresh();
            }
        });
        add_gatunek.setOnAction((ActionEvent event)->{
            if(insert_gatunek.getText() != null && !insert_gatunek.getText().isEmpty()){
                Gatunek ga = new Gatunek();
                ga.setGatunek_gry(insert_gatunek.getText());
                gatunekDAO.create(ga);
                clearGatunekjI();
                fillGatunekBox();
            }
        });
        add_producent.setOnAction((ActionEvent event)->{
            if(insert_producent.getText() != null && !insert_producent.getText().isEmpty()){
                Producent_Gry pg = new Producent_Gry();
                pg.setNazwa_firmy(insert_producent.getText());
                producent_gryDAO.create(pg);
                clearProducentI();
                fillProducentBox();
            }
        });
        add_region.setOnAction((ActionEvent event)->{
            if(insert_region.getText() != null && !insert_region.getText().isEmpty()){
                Region_Gry rg = new Region_Gry();
                rg.setRegion(insert_region.getText());
                region_gryDAO.create(rg);
                clearRegionI();
                fillRegionBox();
            }
        });
        
        delete_gra.setOnAction((ActionEvent event)->{
            if(search_id_g.getText() != null && !search_id_g.getText().isEmpty()){
                Gra gra = new Gra();
                gra.setId_gra(parseInt(search_id_g.getText()));
                graDAO.delete(gra);
                clearGra();
                refresh();
            }
        });
        delete_btn_gatunek.setOnAction((ActionEvent event)->{
            if(choice_gatunek.getValue() != null){
                Gatunek ga = new Gatunek();
                ga = (Gatunek) choice_gatunek.getValue();
                gatunekDAO.delete(ga);
                clearGatunek();
                refresh();
            }
        });
        delete_btn_producent.setOnAction((ActionEvent event)->{
            if(choice_producent.getValue() != null){
                Producent_Gry pg = new Producent_Gry();
                pg = (Producent_Gry) choice_producent.getValue();
                producent_gryDAO.delete(pg);
                clearProducent();
                refresh();
            }
        });
        delete_btn_region.setOnAction((ActionEvent event)->{
            if(choice_region.getValue() != null){
                Region_Gry rg = new Region_Gry();
                rg = (Region_Gry) choice_region.getValue();
                region_gryDAO.delete(rg);
                clearRegion();
                refresh();
            }
        });
        
        update_gra.setOnAction((ActionEvent event)->{
            if(search_id_g.getText() != null && !search_id_g.getText().isEmpty() && 
                    search_nazwa_g.getText() != null && !search_nazwa_g.getText().isEmpty() && 
                        search_rok_p.getText() != null && !search_rok_p.getText().isEmpty() && 
                            search_opis.getText() != null && !search_opis.getText().isEmpty() && 
                                search_prod_g.getValue() != null && 
                                    search_cena_n.getText() != null && !search_cena_n.getText().isEmpty() && 
                                        search_cena_p.getText() != null && !search_cena_p.getText().isEmpty() && 
                                            search_gatunek.getValue() != null && 
                                                search_region.getValue() != null &&
                                                    search_cena_s.getText() != null && !search_cena_s.getText().isEmpty()){
                Gra gra = new Gra();
                gra.setId_gra(parseInt(search_id_g.getText()));
                gra.setNazwa_gry(search_nazwa_g.getText());
                gra.setId_prodgry((Producent_Gry) search_prod_g.getValue());
                gra.setRok_produkcji(parseInt(search_rok_p.getText()));
                gra.setOpis(search_opis.getText());
                gra.setCena_nowej_gry(parseInt(search_cena_n.getText()));
                gra.setId_gatunek((Gatunek) search_gatunek.getValue());
                gra.setId_regiongry((Region_Gry) search_region.getValue());
                gra.setCena_pelna(parseInt(search_cena_p.getText()));
                gra.setCena_samej_gry(parseInt(search_cena_s.getText()));
                graDAO.update(gra);
                clearGra();
                refresh();
            }
        });
        update_btn_gatunek.setOnAction((ActionEvent event)->{
            if(choice_gatunek.getValue() != null && 
                    update_gatunek.getText() != null && !update_gatunek.getText().isEmpty()){
                Gatunek ga = new Gatunek();
                Gatunek ga2 = new Gatunek();
                ga = (Gatunek) choice_gatunek.getValue();
                ga2.setGatunek_gry(update_gatunek.getText());
                gatunekDAO.update(ga, ga2);
                clearGatunek();
                refresh();
            }
        });
        update_btn_producent.setOnAction((ActionEvent event)->{
            if(choice_producent.getValue() != null && 
                    update_producent.getText() != null && !update_producent.getText().isEmpty()){
                Producent_Gry pg = new Producent_Gry();
                Producent_Gry pg2 = new Producent_Gry();
                pg = (Producent_Gry) choice_producent.getValue();
                pg2.setNazwa_firmy(update_producent.getText());
                producent_gryDAO.update(pg, pg2);
                clearProducent();
                refresh();
            }
        });
        update_btn_region.setOnAction((ActionEvent event)->{
            if(choice_region.getValue() != null && 
                    update_region.getText() != null && !update_region.getText().isEmpty()){
                Region_Gry rg = new Region_Gry();
                Region_Gry rg2 = new Region_Gry();
                rg = (Region_Gry) choice_region.getValue();
                rg2.setRegion(update_region.getText());
                region_gryDAO.update(rg, rg2);
                clearRegion();
                refresh();
            }
        });
        
        search_all_gra.setOnAction((ActionEvent event)->{
            GraTable.setItems(FXCollections.observableList(graDAO.getAll())); 
        });
//        search_btn_id_g.setOnAction((ActionEvent event)->{
//            if(search_id_g.getText() != null && !search_id_g.getText().isEmpty()){
//                Gra gra = new Gra();
//                gra.setId_gra(parseInt(search_id_g.getText()));
//                GraTable.setItems(FXCollections.observableList(graDAO.getAllbyId(gra))); 
//            }
//        });
//        search_btn_nazwa_g.setOnAction((ActionEvent event)->{
//            if(search_nazwa_g.getText() != null && !search_nazwa_g.getText().isEmpty()){
//                Gra gra = new Gra();
//                gra.setNazwa_gry(search_nazwa_g.getText());
//                GraTable.setItems(FXCollections.observableList(graDAO.getAllbyName(gra))); 
//            }
//        });
    }

    @FXML
    private void populateTable() {
        col_id_g.setCellValueFactory(new PropertyValueFactory<>("id_gra"));
        col_nazwa_g.setCellValueFactory(new PropertyValueFactory<>("nazwa_gry"));
        col_rok_p.setCellValueFactory(new PropertyValueFactory<>("rok_produkcji"));
        col_opis.setCellValueFactory(new PropertyValueFactory<>("opis"));
        col_cena_n.setCellValueFactory(new PropertyValueFactory<>("cena_nowej_gry"));
        col_cena_p.setCellValueFactory(new PropertyValueFactory<>("cena_pelna"));
        col_cena_s.setCellValueFactory(new PropertyValueFactory<>("cena_samej_gry"));
        col_gatunek.setCellValueFactory(column -> new SimpleStringProperty(column.getValue().getId_gatunek().getGatunek_gry()));
        col_region.setCellValueFactory(column -> new SimpleStringProperty(column.getValue().getId_regiongry().getRegion()));
        col_prod.setCellValueFactory(column -> new SimpleStringProperty(column.getValue().getId_prodgry().getNazwa_firmy()));
        choice_gatunek.setConverter(new StringConverter<Gatunek>(){
            @Override
            public String toString(Gatunek object){
                return object.getGatunek_gry();
            }
            @Override
            public Gatunek fromString(String string){
                return null;
            }
        });
        choose_gatunek.setConverter(new StringConverter<Gatunek>(){
            @Override
            public String toString(Gatunek object){
                return object.getGatunek_gry();
            }
            @Override
            public Gatunek fromString(String string){
                return null;
            }
        });
        search_gatunek.setConverter(new StringConverter<Gatunek>(){
            @Override
            public String toString(Gatunek object){
                return object.getGatunek_gry();
            }
            @Override
            public Gatunek fromString(String string){
                return null;
            }
        });
        choice_producent.setConverter(new StringConverter<Producent_Gry>(){
            @Override
            public String toString(Producent_Gry object){
                return object.getNazwa_firmy();
            }
            @Override
            public Producent_Gry fromString(String string){
                return null;
            }
        });
        choose_producent.setConverter(new StringConverter<Producent_Gry>(){
            @Override
            public String toString(Producent_Gry object){
                return object.getNazwa_firmy();
            }
            @Override
            public Producent_Gry fromString(String string){
                return null;
            }
        });
        search_prod_g.setConverter(new StringConverter<Producent_Gry>(){
            @Override
            public String toString(Producent_Gry object){
                return object.getNazwa_firmy();
            }
            @Override
            public Producent_Gry fromString(String string){
                return null;
            }
        });
        choice_region.setConverter(new StringConverter<Region_Gry>(){
            @Override
            public String toString(Region_Gry object){
                return object.getRegion();
            }
            @Override
            public Region_Gry fromString(String string){
                return null;
            }
        });
        choose_region.setConverter(new StringConverter<Region_Gry>(){
            @Override
            public String toString(Region_Gry object){
                return object.getRegion();
            }
            @Override
            public Region_Gry fromString(String string){
                return null;
            }
        });
        search_region.setConverter(new StringConverter<Region_Gry>(){
            @Override
            public String toString(Region_Gry object){
                return object.getRegion();
            }
            @Override
            public Region_Gry fromString(String string){
                return null;
            }
        });
        GraTable.setItems(FXCollections.observableList(graDAO.getAll())); 
    }
    
    @FXML
    private void refresh() {
        fillGatunekBox();
        fillProducentBox();
        fillRegionBox();
        GraTable.setItems(FXCollections.observableList(graDAO.getAll())); 
    }
    
    @FXML
    private void fillGatunekBox(){
        choice_gatunek.setItems(FXCollections.observableArrayList(gatunekDAO.getAll()));
        choose_gatunek.setItems(FXCollections.observableArrayList(gatunekDAO.getAll()));
        search_gatunek.setItems(FXCollections.observableArrayList(gatunekDAO.getAll()));
    }
    @FXML
    private void fillProducentBox(){
        choice_producent.setItems(FXCollections.observableArrayList(producent_gryDAO.getAll()));
        choose_producent.setItems(FXCollections.observableArrayList(producent_gryDAO.getAll()));
        search_prod_g.setItems(FXCollections.observableArrayList(producent_gryDAO.getAll()));
    }
    @FXML
    private void fillRegionBox(){
        choice_region.setItems(FXCollections.observableArrayList(region_gryDAO.getAll()));
        choose_region.setItems(FXCollections.observableArrayList(region_gryDAO.getAll()));
        search_region.setItems(FXCollections.observableArrayList(region_gryDAO.getAll()));
    }
    
    @FXML
    private void clearGraI(){
        insert_nazwa.clear();
        choose_producent.valueProperty().set(null);
        insert_rok_p.clear();
        insert_opis.clear();
        insert_cena_n.clear();
        insert_cena_p.clear();
        choose_gatunek.valueProperty().set(null);
        choose_region.valueProperty().set(null);
        insert_cena_s.clear();
    }
    @FXML
    private void clearGatunekjI(){
        insert_gatunek.clear();
    }
    @FXML
    private void clearProducentI(){
        insert_producent.clear();
    }
    @FXML
    private void clearRegionI(){
        insert_region.clear();
    }
    @FXML
    private void clearGra(){
        search_id_g.clear();
        search_nazwa_g.clear();
        search_rok_p.clear();
        search_opis.clear();
        search_prod_g.valueProperty().set(null);
        search_cena_n.clear();
        search_cena_p.clear();
        search_gatunek.valueProperty().set(null);
        search_region.valueProperty().set(null);
        search_cena_s.clear();
    }
    @FXML
    private void clearGatunek(){
        update_gatunek.clear();
        choice_gatunek.valueProperty().set(null);
    }
    @FXML
    private void clearProducent(){
        update_producent.clear();
        choice_producent.valueProperty().set(null);
    }
    @FXML
    private void clearRegion(){
        update_region.clear();
        choice_region.valueProperty().set(null);
    }

}