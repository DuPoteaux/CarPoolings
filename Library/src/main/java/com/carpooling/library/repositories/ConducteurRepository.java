package com.dupoteaux.Repository;

import com.dupoteaux.Entity.Conducteur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryConducteur extends JpaRepository<Conducteur,String> {
}
