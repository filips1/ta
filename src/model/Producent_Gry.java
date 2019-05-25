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
@Table(name = "Producent_Gry")

public class Producent_Gry implements Serializable {

    private static final long serialVersionUID = 3L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQUENCE_NAME")
    @SequenceGenerator(name = "SEQUENCE_NAME", sequenceName = "SEQUENCE_NAME", allocationSize = 1, initialValue = 1)
    @Column(name = "Id_ProdGry", unique = true)
    private int id_prodgry;


    @Column(name = "Nazwa_Firmy")
    private String nazwa_firmy;


    public int getId_prodgry() {
        return id_prodgry;
    }

    public void setId_prodgry(int id_prodgry) {
        this.id_prodgry = id_prodgry;
    }

    public String getNazwa_firmy() {
        return nazwa_firmy;
    }

    public void setNazwa_firmy(String nazwa_firmy) {
        this.nazwa_firmy = nazwa_firmy;
    }

  

    public Producent_Gry(int id_prodgry, String nazwa_firmy) {
        this.id_prodgry = id_prodgry;
        this.nazwa_firmy = nazwa_firmy;
    }

    public Producent_Gry() {
    }

}
