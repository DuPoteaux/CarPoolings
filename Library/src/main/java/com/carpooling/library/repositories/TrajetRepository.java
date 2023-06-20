package com.carpooling.library.repositories;

import com.carpooling.library.models.Trajet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TrajetRepository extends JpaRepository<Trajet,Integer> {
}
