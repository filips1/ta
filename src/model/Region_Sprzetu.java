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
@Table(name = "Region_Sprzetu")

public class Region_Sprzetu implements Serializable {

    private static final long serialVersionUID = 6L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQUENCE_NAME")
    @SequenceGenerator(name = "SEQUENCE_NAME", sequenceName = "SEQUENCE_NAME", allocationSize = 1, initialValue = 1)
    @Column(name = "Id_RegionSprzetu", unique = true)
    private int id_regionsprzetu;


    @Column(name = "Region")
    private String region;


    public int getId_regionsprzetu() {
        return id_regionsprzetu;
    }

    public void setId_regionsprzetu(int id_regionsprzetu) {
        this.id_regionsprzetu = id_regionsprzetu;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

  

    public Region_Sprzetu(int id_regionsprzetu, String region) {
        this.id_regionsprzetu = id_regionsprzetu;
        this.region = region;
    }

    public Region_Sprzetu() {
    }

}
