package com.carpooling.library.repositories;

import com.carpooling.library.models.PublicationTrajet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PublicationTrajetRepository extends JpaRepository<PublicationTrajet,Integer> {
}
