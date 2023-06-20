package com.carpooling.library.repositories;


import com.carpooling.library.models.Notation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NotationRepository extends JpaRepository<Notation,Integer> {
}
