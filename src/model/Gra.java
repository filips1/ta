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
@Table(name = "Gra")

public class Gra implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQUENCE_NAME")
    @SequenceGenerator(name = "SEQUENCE_NAME", sequenceName = "SEQUENCE_NAME", allocationSize = 1, initialValue = 1)
    @Column(name = "Id_Gra", unique = true)
    private int id_gra;
    
    @ManyToOne
    @OnDelete(action = OnDeleteAction.CASCADE)
    private Region_Gry id_regiongry;
    
    @ManyToOne
    @OnDelete(action = OnDeleteAction.CASCADE)
    private Producent_Gry id_prodgry;
    
    @ManyToOne
    @OnDelete(action = OnDeleteAction.CASCADE)
    private Gatunek id_gatunek;

    @Column(name = "Nazwa_Gry")
    private String nazwa_gry;

    @Column(name = "Cena_Nowej_Gry")
    private int cena_nowej_gry;

    @Column(name = "Rok_Produkcji")
    private int rok_produkcji;

    @Column(name = "cena_pelna")
    private int cena_pelna;

    @Column(name = "Cena_Samej_Gry")
    private int cena_samej_gry;

    @Column(name = "Opis")
    private String opis;

    public int getId_gra() {
        return id_gra;
    }

    public void setId_gra(int id_gra) {
        this.id_gra = id_gra;
    }

    public Region_Gry getId_regiongry() {
        return id_regiongry;
    }

    public void setId_regiongry(Region_Gry id_regiongry) {
        this.id_regiongry = id_regiongry;
    }

    public Producent_Gry getId_prodgry() {
        return id_prodgry;
    }

    public void setId_prodgry(Producent_Gry id_prodgry) {
        this.id_prodgry = id_prodgry;
    }

    public Gatunek getId_gatunek() {
        return id_gatunek;
    }

    public void setId_gatunek(Gatunek id_gatunek) {
        this.id_gatunek = id_gatunek;
    }

    public String getNazwa_gry() {
        return nazwa_gry;
    }

    public void setNazwa_gry(String nazwa_gry) {
        this.nazwa_gry = nazwa_gry;
    }

    public int getCena_nowej_gry() {
        return cena_nowej_gry;
    }

    public void setCena_nowej_gry(int cena_nowej_gry) {
        this.cena_nowej_gry = cena_nowej_gry;
    }

    public int getRok_produkcji() {
        return rok_produkcji;
    }

    public void setRok_produkcji(int rok_produkcji) {
        this.rok_produkcji = rok_produkcji;
    }

    public int getCena_pelna() {
        return cena_pelna;
    }

    public void setCena_pelna(int cena_pelna) {
        this.cena_pelna = cena_pelna;
    }

    public int getCena_samej_gry() {
        return cena_samej_gry;
    }

    public void setCena_samej_gry(int cena_samej_gry) {
        this.cena_samej_gry = cena_samej_gry;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }

    public String getOpis() {
        return opis;
    }

    public Gra(int id_gra, Region_Gry id_regiongry, Producent_Gry id_prodgry, Gatunek id_gatunek, String nazwa_gry, int cena_nowej_gry, int rok_produkcji, int cena_pelna, int cena_samej_gry, String opis) {
        this.id_gra = id_gra;
        this.id_regiongry = id_regiongry;
        this.id_prodgry = id_prodgry;
        this.id_gatunek = id_gatunek;
        this.nazwa_gry = nazwa_gry;
        this.cena_nowej_gry = cena_nowej_gry;
        this.rok_produkcji = rok_produkcji;
        this.cena_pelna = cena_pelna;
        this.cena_samej_gry = cena_samej_gry;
        this.opis = opis;
    }

    public Gra() {
    }

}
