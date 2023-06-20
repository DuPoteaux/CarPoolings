package com.carpooling.library.repositories;


import com.carpooling.library.models.Passager;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PassagerRepository extends JpaRepository<Passager,Integer> {
}
