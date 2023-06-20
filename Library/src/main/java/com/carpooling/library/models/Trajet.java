package com.carpooling.library.models;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class)
public class Trajet {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name="trajetID")
    private  Integer trajetID;
    private Date trajetDepart;
    private Date trajetFin;
   private int nbrePlace;
    private Date date;
     private String localisation;
     private String pays;



     @ManyToOne
     @JoinColumn(name = "numPermis")
    private  Conducteur conducteur;
     private int numPermis;

    @ManyToOne
    @JoinColumn(name = "numPermis")
    private Vehicule vehicule;

    @ManyToOne
    @JoinColumn(name = "id")
    private  Passager passagerList;
    private Integer id;
    // private List<Passager>passagerList=new ArrayList<>();

}
