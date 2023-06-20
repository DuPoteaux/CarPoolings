package com.carpooling.library.models;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;


import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class)

public class Vehicule {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    private String name;


    private String vehicleNumber;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date registrationDate;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date acquisitionDate;
    private String description;

    private String power;
    private String fuelCapacity;
  private String netWeight;

    @ManyToOne
    @JoinColumn(name="conducteurID", insertable=false, updatable=false)
    private Conducteur conducteur;
    private Integer conducteurID;



    @ManyToOne
    @JoinColumn(name="locationid", insertable=false, updatable=false)
    private Location currentLocation;
    private Integer locationID;

    private String remarks;

}
