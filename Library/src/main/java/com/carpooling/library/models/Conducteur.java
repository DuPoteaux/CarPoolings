package com.carpooling.library.models;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class)

public class Conducteur extends  User {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name="numPermis")
private Integer numPermis;
private int nbreTrajet;


    @ManyToOne
    @JoinColumn(name = "note")
    private  Notation notation;
    private Integer note;

    @ManyToOne
    @JoinColumn(name = "id")
    private Experience experience;
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "RefID")
    private Localisation localisation;
    private Integer RefID;



}
