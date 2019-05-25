/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

@Entity
@Table(name = "Sprzet")

public class Sprzet implements Serializable {

    private static final long serialVersionUID = 8L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQUENCE_NAME")
    @SequenceGenerator(name = "SEQUENCE_NAME", sequenceName = "SEQUENCE_NAME", allocationSize = 1, initialValue = 1)
    @Column(name = "id_sprzet", unique = true)
    private int id_sprzet;

    @ManyToOne
    @OnDelete(action = OnDeleteAction.CASCADE)
    private Gra gra;

    @Column(name = "Nazwa")
    private String nazwa;

    @Column(name = "Cena")
    private int cena;

    @Column(name = "Rok_Poczatku_Produkcji")
    private int rok_poczatku_produkcji;

    @Column(name = "Rok_Zakonczenia_Produkcji")
    private int rok_zakonczenia_produkcji;

    @Column(name = "Generacja")
    private int generacja;

    @Column(name = "Specyfikacja")
    private String specyfikacja;

    public int getId_sprzet() {
        return id_sprzet;
    }

    public void setId_sprzet(int id_sprzet) {
        this.id_sprzet = id_sprzet;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public int getCena() {
        return cena;
    }

    public void setCena(int cena) {
        this.cena = cena;
    }

    public int getRok_poczatku_produkcji() {
        return rok_poczatku_produkcji;
    }

    public void setRok_poczatku_produkcji(int rok_poczatku_produkcji) {
        this.rok_poczatku_produkcji = rok_poczatku_produkcji;
    }

    public int getRok_zakonczenia_produkcji() {
        return rok_zakonczenia_produkcji;
    }

    public void setRok_zakonczenia_produkcji(int rok_zakonczenia_produkcji) {
        this.rok_zakonczenia_produkcji = rok_zakonczenia_produkcji;
    }

    public int getGeneracja() {
        return generacja;
    }

    public void setGeneracja(int generacja) {
        this.generacja = generacja;
    }

    public void setSpecyfikacja(String specyfikacja) {
        this.specyfikacja = specyfikacja;
    }

    public String getSpecyfikacja() {
        return specyfikacja;
    }

    public Sprzet(int id_sprzetu, String nazwa, int cena, int rok_poczatku_produkcji, int rok_zakonczenia_produkcji, int generacja, String specyfikacja) {
        this.id_sprzet = id_sprzet;
        this.nazwa = nazwa;
        this.cena = cena;
        this.rok_poczatku_produkcji = rok_poczatku_produkcji;
        this.rok_zakonczenia_produkcji = rok_zakonczenia_produkcji;
        this.generacja = generacja;
        this.specyfikacja = specyfikacja;
    }

    public Sprzet() {
    }

}
