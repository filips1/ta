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
@Table(name = "Rodzaj_Sprzetu")

public class Rodzaj_Sprzetu implements Serializable {

    private static final long serialVersionUID = 7L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQUENCE_NAME")
    @SequenceGenerator(name = "SEQUENCE_NAME", sequenceName = "SEQUENCE_NAME", allocationSize = 1, initialValue = 1)
    @Column(name = "Id_RodzajSprzetu", unique = true)
    private int id_rodzajsprzetu;


    @Column(name = "Region")
    private String rodzaj;


    public int getId_rodzajsprzetu() {
        return id_rodzajsprzetu;
    }

    public void setId_rodzajsprzetu(int id_rodzajsprzetu) {
        this.id_rodzajsprzetu = id_rodzajsprzetu;
    }

    public String getRodzaj() {
        return rodzaj;
    }

    public void setRodzaj(String rodzaj) {
        this.rodzaj = rodzaj;
    }

  

    public Rodzaj_Sprzetu(int id_rodzajsprzetu, String rodzaj) {
        this.id_rodzajsprzetu = id_rodzajsprzetu;
        this.rodzaj = rodzaj;
    }

    public Rodzaj_Sprzetu() {
    }

}
