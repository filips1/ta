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
@Table(name = "Region_Gry")

public class Region_Gry implements Serializable {

    private static final long serialVersionUID = 5L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQUENCE_NAME")
    @SequenceGenerator(name = "SEQUENCE_NAME", sequenceName = "SEQUENCE_NAME", allocationSize = 1, initialValue = 1)
    @Column(name = "Id_RegionGry", unique = true)
    private int id_regiongry;


    @Column(name = "Region")
    private String region;


    public int getId_regiongry() {
        return id_regiongry;
    }

    public void setId_regiongry(int id_regiongry) {
        this.id_regiongry = id_regiongry;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

  

    public Region_Gry(int id_regiongry, String region) {
        this.id_regiongry = id_regiongry;
        this.region = region;
    }

    public Region_Gry() {
    }

}
