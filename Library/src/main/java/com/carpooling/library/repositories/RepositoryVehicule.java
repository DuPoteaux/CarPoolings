package com.carpooling.library.repositories;

import com.carpooling.library.models.Vehicule;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryVehicule extends JpaRepository<Vehicule,String> {
}
