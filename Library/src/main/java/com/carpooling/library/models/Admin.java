package com.carpooling.library.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Collection;


@NoArgsConstructor
@AllArgsConstructor
@Entity
@Data
@Table(name = "Admin")
public class Admin {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Admin_Id")
    private Long id;
    private String firstName;
    private String lastName;
    private String userName;
    private String passWord;

    @Lob
    @Column(columnDefinition = "MEDIUMLOB")
    private String image;

    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinTable(name = "Admins_role", joinColumns = @JoinColumn(name = "Admin_Id", referencedColumnName = "Admin_Id"), inverseJoinColumns = @JoinColumn(name = "Role_Id", referencedColumnName = "Role_Id"))

    private Collection<Role> roles;

}
