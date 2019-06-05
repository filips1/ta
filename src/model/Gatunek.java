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
@Table(name = "Gatunek")

public class Gatunek implements Serializable {

    private static final long serialVersionUID = 2L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQUENCE_NAME")
    @SequenceGenerator(name = "SEQUENCE_NAME", sequenceName = "SEQUENCE_NAME", allocationSize = 1, initialValue = 1)
    @Column(name = "Id_gatunek", unique = true)
    private int id_gatunek;


    @Column(name = "Region")
    private String gatunek_gry;


    public int getId_gatunek() {
        return id_gatunek;
    }

    public void setId_gatunek(int id_gatunek) {
        this.id_gatunek = id_gatunek;
    }

    public String getGatunek_gry() {
        return gatunek_gry;
    }

    public void setGatunek_gry(String gatunek_gry) {
        this.gatunek_gry = gatunek_gry;
    }

    public Gatunek(int id_gatunek, String gatunek_gry) {
        this.id_gatunek = id_gatunek;
        this.gatunek_gry = gatunek_gry;
    }

    public Gatunek() {
    }

}
