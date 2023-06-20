package com.carpooling.library.models;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class)
public class Experience {


    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name="id")
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "id")
    private Trajet trajet;
//    private List<Trajet> trajetList= new ArrayList<>();

    @ManyToOne
    @JoinColumn(name = "note")
    private  Conducteur conducteur ;

    @ManyToOne
    @JoinColumn(name = "note")
    private Notation notation;
    private Integer note;







}
