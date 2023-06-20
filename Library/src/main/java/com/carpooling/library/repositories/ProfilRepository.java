package com.carpooling.library.repositories;

import com.carpooling.library.models.Profil;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfilRepository extends JpaRepository<Profil,String> {
}
