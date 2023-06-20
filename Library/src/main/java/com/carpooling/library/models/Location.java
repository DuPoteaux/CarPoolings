package com.carpooling.library.models;

import jakarta.persistence.*;

@Entity
public class Location {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Integer id;
 private String description;
 private String details;

    @ManyToOne
    @JoinColumn(name="countryid", insertable=false, updatable=false)
    private Country country;
    private Integer countryid;

    @ManyToOne
    @JoinColumn(name="stateid", insertable=false, updatable=false)
    private State state;
    private Integer stateid;

    private String city;
    private String address;
}
