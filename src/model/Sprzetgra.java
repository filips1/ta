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
@Table(name = "Sprzetgra")

public class Sprzetgra implements Serializable {

    private static final long serialVersionUID = 7L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQUENCE_NAME")
    @SequenceGenerator(name = "SEQUENCE_NAME", sequenceName = "SEQUENCE_NAME", allocationSize = 1, initialValue = 1)
    @Column(name = "Id_gry")
    private int id_gry;
    
    @Column(name = "Id_sprzetu")
    private int id_sprzetu;

    public int getId_gry() {
        return id_gry;
    }

    public void setId_gry(int id_gry) {
        this.id_gry = id_gry;
    }

    public int getId_sprzetu() {
        return id_sprzetu;
    }

    public void setId_sprzetu(int id_sprzetu) {
        this.id_sprzetu = id_sprzetu;
    }

    public Sprzetgra(int id_gry, int id_sprzetu) {
        this.id_gry = id_gry;
        this.id_sprzetu = id_sprzetu;
    }

    public Sprzetgra() {
    }

}
