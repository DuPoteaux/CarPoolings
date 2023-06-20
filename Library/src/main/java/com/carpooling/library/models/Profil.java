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
public class Profil {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name="userID")
    private  Integer userID;
    //informations sur l'utilisateur a relier
}
