package com.carpooling.library.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
@Repository
public interface HoraireRepository extends JpaRepository<com.dupoteaux.Entity.Horaire, Date> {
}
