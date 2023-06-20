package com.dupoteaux.Entity;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class)


public class DemandeTrajet {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name="numDemande")
    private Integer numDemande;
  private enum DemandeStatut{accepte,refuse};
    private Date demandedate;
    private  Date demandeDelai;
    private int nbrePlaces;
    private enum trajetStatut{accepté,refusé};
    @ManyToOne
    @JoinColumn(name = "postTrajetID")
    private Trajet trajet;
    private Integer postTrajetID;






}
