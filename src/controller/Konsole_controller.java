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

public class Konsole_controller {

    @FXML
    private TextField insert_nazwa;
    @FXML
    private ChoiceBox choose_producent;
    @FXML
    private TextField insert_rok_p;
    @FXML
    private TextField insert_rok_k;
    @FXML
    private TextField insert_spec;
    @FXML
    private TextField insert_cena;
    @FXML
    private ChoiceBox choose_rodzaj;
    @FXML
    private ChoiceBox choose_region;
    @FXML
    private TextField insert_generacja;
    @FXML
    private Button add_sprzet;
    @FXML
    private Button clear_sprzet_i;
    @FXML
    private TextField insert_rodzaj;
    @FXML
    private TextField insert_producent;
    @FXML
    private TextField insert_region;
    @FXML
    private Button add_rodzaj;
    @FXML
    private Button clear_rodzaj;
    @FXML
    private Button add_producent;
    @FXML
    private Button clear_producent;
    @FXML
    private Button add_region;
    @FXML
    private Button clear_region;
    @FXML
    private TextField search_id_s;
    @FXML
    private TextField search_nazwa_s;
    @FXML
    private TextField search_rok_p;
    @FXML
    private TextField search_rok_k;
    @FXML
    private ChoiceBox search_prod_s;
    @FXML
    private TextField search_spec;
    @FXML
    private TextField search_gen;
    @FXML
    private ChoiceBox search_rodzaj;
    @FXML
    private ChoiceBox search_region;
    @FXML
    private TextField search_cena;
    @FXML
    private Button search_btn_id_s;
    @FXML
    private Button search_btn_nazwa_s;
    @FXML
    private Button update_sprzet;
    @FXML
    private Button delete_sprzet;
    @FXML
    private Button search_all_sprzet;
    @FXML
    private Button clear_sprzet;
    @FXML
    private TextField update_rodzaj;
    @FXML
    private TextField update_producent;
    @FXML
    private TextField update_region;
    @FXML
    private ChoiceBox choice_rodzaj;
    @FXML
    private ChoiceBox choice_producent;
    @FXML
    private ChoiceBox choice_region;
    @FXML
    private Button update_btn_rodzaj;
    @FXML
    private Button delete_btn_rodzaj;
    @FXML
    private Button update_btn_producent;
    @FXML
    private Button delete_btn_producent;
    @FXML
    private Button update_btn_region;
    @FXML
    private Button delete_btn_region;
    @FXML
    private TableColumn<Sprzet, Integer> col_id_s;
    @FXML
    private TableColumn<Sprzet, String> col_nazwa_s;
    @FXML
    private TableColumn<Sprzet, Integer> col_rok_p;
    @FXML
    private TableColumn<Sprzet, Integer> col_rok_k;
    @FXML
    private TableColumn<Sprzet, String> col_prod;
    @FXML
    private TableColumn<Sprzet, String> col_spec;
    @FXML
    private TableColumn<Sprzet, Integer> col_gen;
    @FXML
    private TableColumn<Sprzet, Integer> col_cena;
    @FXML
    private TableColumn<Sprzet, String> col_rodzaj;
    @FXML
    private TableColumn<Sprzet, String> col_region;
    @FXML
    private TableView<Sprzet> KonsoleTable;
    @FXML
    private Button button1;
    @FXML
    private Button button2;
    @FXML
    private AnchorPane newPane;
    
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
                Parent tableViewParent = FXMLLoader.load(getClass().getResource("GryView.fxml"));
                Scene tableViewScene = new Scene(tableViewParent);
                
                Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
                
                window.setScene(tableViewScene);
                window.show();
            }catch(Exception e){System.out.println("Blad button1");}
        });
        button2.setOnAction((ActionEvent event)->{
            try{
                Parent tableViewParent = FXMLLoader.load(getClass().getResource("GrasprzetView.fxml"));
                Scene tableViewScene = new Scene(tableViewParent);
                
                Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
                
                window.setScene(tableViewScene);
                window.show();
            }catch(Exception e){System.out.println("Blad button2");}
        });
        
        add_sprzet.setOnAction((ActionEvent event)->{
            if(insert_nazwa.getText() != null && !insert_nazwa.getText().isEmpty()){
                Sprzet sprzet = new Sprzet();
                sprzet.setNazwa(insert_nazwa.getText());
                sprzet.setId_prodsprzetu((Producent_Sprzetu) choose_producent.getValue());
                sprzet.setRok_poczatku_produkcji(parseInt(insert_rok_p.getText()));
                sprzet.setRok_zakonczenia_produkcji(parseInt(insert_rok_k.getText()));
                sprzet.setSpecyfikacja(insert_spec.getText());
                sprzet.setCena(parseInt(insert_cena.getText()));
                sprzet.setId_rodzajsprzetu((Rodzaj_Sprzetu) choose_rodzaj.getValue());
                sprzet.setId_regionsprzetu((Region_Sprzetu) choose_region.getValue());
                sprzet.setGeneracja(parseInt(insert_generacja.getText()));
                sprzetDAO.create(sprzet);
                clearSprzetI();
                refresh();
            }
        });
        add_rodzaj.setOnAction((ActionEvent event)->{
            if(insert_rodzaj.getText() != null && !insert_rodzaj.getText().isEmpty()){
                Rodzaj_Sprzetu ros = new Rodzaj_Sprzetu();
                ros.setRodzaj(insert_rodzaj.getText());
                rodzaj_sprzetuDAO.create(ros);
                clearRodzajI();
                fillRodzajBox();
            }
        });
        add_producent.setOnAction((ActionEvent event)->{
            if(insert_producent.getText() != null && !insert_producent.getText().isEmpty()){
                Producent_Sprzetu ps = new Producent_Sprzetu();
                ps.setNazwa_firmy(insert_producent.getText());
                producent_sprzetuDAO.create(ps);
                clearProducentI();
                fillProducentBox();
            }
        });
        add_region.setOnAction((ActionEvent event)->{
            if(insert_region.getText() != null && !insert_region.getText().isEmpty()){
                Region_Sprzetu res = new Region_Sprzetu();
                res.setRegion(insert_region.getText());
                region_sprzetuDAO.create(res);
                clearRegionI();
                fillRegionBox();
            }
        });
        
        delete_sprzet.setOnAction((ActionEvent event)->{
            if(search_id_s.getText() != null && !search_id_s.getText().isEmpty()){
                Sprzet sprzet = new Sprzet();
                sprzet.setId_sprzet(parseInt(search_id_s.getText()));
                sprzetDAO.delete(sprzet);
                clearSprzet();
                refresh();
            }
        });
        delete_btn_rodzaj.setOnAction((ActionEvent event)->{
            if(choice_rodzaj.getValue() != null){
                Rodzaj_Sprzetu ros = new Rodzaj_Sprzetu();
                ros = (Rodzaj_Sprzetu) choice_rodzaj.getValue();
                rodzaj_sprzetuDAO.delete(ros);
                clearRodzaj();
                refresh();
            }
        });
        delete_btn_producent.setOnAction((ActionEvent event)->{
            if(choice_producent.getValue() != null){
                Producent_Sprzetu ps = new Producent_Sprzetu();
                ps = (Producent_Sprzetu) choice_producent.getValue();
                producent_sprzetuDAO.delete(ps);
                clearProducent();
                refresh();
            }
        });
        delete_btn_region.setOnAction((ActionEvent event)->{
            if(choice_region.getValue() != null){
                Region_Sprzetu res = new Region_Sprzetu();
                res = (Region_Sprzetu) choice_region.getValue();
                region_sprzetuDAO.delete(res);
                clearRegion();
                refresh();
            }
        });
        
        update_sprzet.setOnAction((ActionEvent event)->{
            if(search_id_s.getText() != null && !search_id_s.getText().isEmpty() && 
                    search_nazwa_s.getText() != null && !search_nazwa_s.getText().isEmpty() && 
                        search_rok_p.getText() != null && !search_rok_p.getText().isEmpty() && 
                            search_rok_k.getText() != null && !search_rok_k.getText().isEmpty() && 
                                search_prod_s.getValue() != null && 
                                    search_spec.getText() != null && !search_spec.getText().isEmpty() && 
                                        search_gen.getText() != null && !search_gen.getText().isEmpty() && 
                                            search_rodzaj.getValue() != null && 
                                                search_region.getValue() != null &&
                                                    search_cena.getText() != null && !search_cena.getText().isEmpty()){
                Sprzet sprzet = new Sprzet();
                sprzet.setId_sprzet(parseInt(search_id_s.getText()));
                sprzet.setNazwa(search_nazwa_s.getText());
                sprzet.setId_prodsprzetu((Producent_Sprzetu) search_prod_s.getValue());
                sprzet.setRok_poczatku_produkcji(parseInt(search_rok_p.getText()));
                sprzet.setRok_zakonczenia_produkcji(parseInt(search_rok_k.getText()));
                sprzet.setSpecyfikacja(search_spec.getText());
                sprzet.setId_rodzajsprzetu((Rodzaj_Sprzetu) search_rodzaj.getValue());
                sprzet.setId_regionsprzetu((Region_Sprzetu) search_region.getValue());
                sprzet.setGeneracja(parseInt(search_gen.getText()));
                sprzet.setCena(parseInt(search_cena.getText()));
                sprzetDAO.update(sprzet);
                clearSprzet();
                refresh();
            }
        });
        update_btn_rodzaj.setOnAction((ActionEvent event)->{
            if(choice_rodzaj.getValue() != null && 
                    update_rodzaj.getText() != null && !update_rodzaj.getText().isEmpty()){
                Rodzaj_Sprzetu ros = new Rodzaj_Sprzetu();
                Rodzaj_Sprzetu ros2 = new Rodzaj_Sprzetu();
                ros = (Rodzaj_Sprzetu) choice_rodzaj.getValue();
                ros2.setRodzaj(update_rodzaj.getText());
                rodzaj_sprzetuDAO.update(ros, ros2);
                clearRodzaj();
                refresh();
            }
        });
        update_btn_producent.setOnAction((ActionEvent event)->{
            if(choice_producent.getValue() != null && 
                    update_producent.getText() != null && !update_producent.getText().isEmpty()){
                Producent_Sprzetu ps = new Producent_Sprzetu();
                Producent_Sprzetu ps2 = new Producent_Sprzetu();
                ps = (Producent_Sprzetu) choice_producent.getValue();
                ps2.setNazwa_firmy(update_producent.getText());
                producent_sprzetuDAO.update(ps, ps2);
                clearProducent();
                refresh();
            }
        });
        update_btn_region.setOnAction((ActionEvent event)->{
            if(choice_region.getValue() != null && 
                    update_region.getText() != null && !update_region.getText().isEmpty()){
                Region_Sprzetu res = new Region_Sprzetu();
                Region_Sprzetu res2 = new Region_Sprzetu();
                res = (Region_Sprzetu) choice_region.getValue();
                res2.setRegion(update_region.getText());
                region_sprzetuDAO.update(res, res2);
                clearRegion();
                refresh();
            }
        });
        
        search_all_sprzet.setOnAction((ActionEvent event)->{
            KonsoleTable.setItems(FXCollections.observableList(sprzetDAO.getAll())); 
        });
        search_btn_id_s.setOnAction((ActionEvent event)->{
            if(search_id_s.getText() != null && !search_id_s.getText().isEmpty()){
                Sprzet sprzet = new Sprzet();
                sprzet.setId_sprzet(parseInt(search_id_s.getText()));
                KonsoleTable.setItems(FXCollections.observableList(sprzetDAO.getAllbyId(sprzet))); 
            }
        });
        search_btn_nazwa_s.setOnAction((ActionEvent event)->{
            if(search_nazwa_s.getText() != null && !search_nazwa_s.getText().isEmpty()){
                Sprzet sprzet = new Sprzet();
                sprzet.setNazwa(search_nazwa_s.getText());
                KonsoleTable.setItems(FXCollections.observableList(sprzetDAO.getAllbyName(sprzet))); 
            }
        });
    }

    @FXML
    private void populateTable() {
        col_id_s.setCellValueFactory(new PropertyValueFactory<>("id_sprzet"));
        col_nazwa_s.setCellValueFactory(new PropertyValueFactory<>("nazwa"));
        col_rok_p.setCellValueFactory(new PropertyValueFactory<>("rok_poczatku_produkcji"));
        col_rok_k.setCellValueFactory(new PropertyValueFactory<>("rok_zakonczenia_produkcji"));
        col_spec.setCellValueFactory(new PropertyValueFactory<>("specyfikacja"));
        col_gen.setCellValueFactory(new PropertyValueFactory<>("generacja"));
        col_cena.setCellValueFactory(new PropertyValueFactory<>("cena"));
        col_rodzaj.setCellValueFactory(column -> new SimpleStringProperty(column.getValue().getId_rodzajsprzetu().getRodzaj()));
        col_region.setCellValueFactory(column -> new SimpleStringProperty(column.getValue().getId_regionsprzetu().getRegion()));
        col_prod.setCellValueFactory(column -> new SimpleStringProperty(column.getValue().getId_prodsprzetu().getNazwa_firmy()));
        choice_rodzaj.setConverter(new StringConverter<Rodzaj_Sprzetu>(){
            @Override
            public String toString(Rodzaj_Sprzetu object){
                return object.getRodzaj();
            }
            @Override
            public Rodzaj_Sprzetu fromString(String string){
                return null;
            }
        });
        choose_rodzaj.setConverter(new StringConverter<Rodzaj_Sprzetu>(){
            @Override
            public String toString(Rodzaj_Sprzetu object){
                return object.getRodzaj();
            }
            @Override
            public Rodzaj_Sprzetu fromString(String string){
                return null;
            }
        });
        search_rodzaj.setConverter(new StringConverter<Rodzaj_Sprzetu>(){
            @Override
            public String toString(Rodzaj_Sprzetu object){
                return object.getRodzaj();
            }
            @Override
            public Rodzaj_Sprzetu fromString(String string){
                return null;
            }
        });
        choice_producent.setConverter(new StringConverter<Producent_Sprzetu>(){
            @Override
            public String toString(Producent_Sprzetu object){
                return object.getNazwa_firmy();
            }
            @Override
            public Producent_Sprzetu fromString(String string){
                return null;
            }
        });
        choose_producent.setConverter(new StringConverter<Producent_Sprzetu>(){
            @Override
            public String toString(Producent_Sprzetu object){
                return object.getNazwa_firmy();
            }
            @Override
            public Producent_Sprzetu fromString(String string){
                return null;
            }
        });
        search_prod_s.setConverter(new StringConverter<Producent_Sprzetu>(){
            @Override
            public String toString(Producent_Sprzetu object){
                return object.getNazwa_firmy();
            }
            @Override
            public Producent_Sprzetu fromString(String string){
                return null;
            }
        });
        choice_region.setConverter(new StringConverter<Region_Sprzetu>(){
            @Override
            public String toString(Region_Sprzetu object){
                return object.getRegion();
            }
            @Override
            public Region_Sprzetu fromString(String string){
                return null;
            }
        });
        choose_region.setConverter(new StringConverter<Region_Sprzetu>(){
            @Override
            public String toString(Region_Sprzetu object){
                return object.getRegion();
            }
            @Override
            public Region_Sprzetu fromString(String string){
                return null;
            }
        });
        search_region.setConverter(new StringConverter<Region_Sprzetu>(){
            @Override
            public String toString(Region_Sprzetu object){
                return object.getRegion();
            }
            @Override
            public Region_Sprzetu fromString(String string){
                return null;
            }
        });
        KonsoleTable.setItems(FXCollections.observableList(sprzetDAO.getAll())); 
    }
    @FXML
    private void refresh() {
        fillRodzajBox();
        fillProducentBox();
        fillRegionBox();
        KonsoleTable.setItems(FXCollections.observableList(sprzetDAO.getAll())); 
    }
    
    @FXML
    private void fillRodzajBox(){
        choice_rodzaj.setItems(FXCollections.observableArrayList(rodzaj_sprzetuDAO.getAll()));
        choose_rodzaj.setItems(FXCollections.observableArrayList(rodzaj_sprzetuDAO.getAll()));
        search_rodzaj.setItems(FXCollections.observableArrayList(rodzaj_sprzetuDAO.getAll()));
    }
    @FXML
    private void fillProducentBox(){
        choice_producent.setItems(FXCollections.observableArrayList(producent_sprzetuDAO.getAll()));
        choose_producent.setItems(FXCollections.observableArrayList(producent_sprzetuDAO.getAll()));
        search_prod_s.setItems(FXCollections.observableArrayList(producent_sprzetuDAO.getAll()));
    }
    @FXML
    private void fillRegionBox(){
        choice_region.setItems(FXCollections.observableArrayList(region_sprzetuDAO.getAll()));
        choose_region.setItems(FXCollections.observableArrayList(region_sprzetuDAO.getAll()));
        search_region.setItems(FXCollections.observableArrayList(region_sprzetuDAO.getAll()));
    }
    
    @FXML
    private void clearSprzetI(){
        insert_nazwa.clear();
        choose_producent.valueProperty().set(null);
        insert_rok_p.clear();
        insert_rok_k.clear();
        insert_spec.clear();
        insert_cena.clear();
        choose_rodzaj.valueProperty().set(null);
        choose_region.valueProperty().set(null);
        insert_generacja.clear();
    }
    @FXML
    private void clearRodzajI(){
        insert_rodzaj.clear();
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
    private void clearSprzet(){
        search_id_s.clear();
        search_nazwa_s.clear();
        search_rok_p.clear();
        search_rok_k.clear();
        search_prod_s.valueProperty().set(null);
        search_spec.clear();
        search_gen.clear();
        search_rodzaj.valueProperty().set(null);
        search_region.valueProperty().set(null);
        search_cena.clear();
    }
    @FXML
    private void clearRodzaj(){
        update_rodzaj.clear();
        choice_rodzaj.valueProperty().set(null);
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