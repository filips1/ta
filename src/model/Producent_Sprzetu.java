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
@Table(name = "Producent_Sprzetu")

public class Producent_Sprzetu implements Serializable {

    private static final long serialVersionUID = 4L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQUENCE_NAME")
    @SequenceGenerator(name = "SEQUENCE_NAME", sequenceName = "SEQUENCE_NAME", allocationSize = 1, initialValue = 1)
    @Column(name = "Id_ProdSprzetu", unique = true)
    private int id_prodsprzetu;

    @Column(name = "Nazwa_Firmy")
    private String nazwa_firmy;


    public int getId_prodsprzetu() {
        return id_prodsprzetu;
    }

    public void setId_prodsprzetu(int id_prodsprzetu) {
        this.id_prodsprzetu = id_prodsprzetu;
    }

    public String getNazwa_firmy() {
        return nazwa_firmy;
    }

    public void setNazwa_firmy(String nazwa_firmy) {
        this.nazwa_firmy = nazwa_firmy;
    }

  

    public Producent_Sprzetu(int id_prodsprzetu, String nazwa_firmy) {
        this.id_prodsprzetu = id_prodsprzetu;
        this.nazwa_firmy = nazwa_firmy;
    }

    public Producent_Sprzetu() {
    }

}
