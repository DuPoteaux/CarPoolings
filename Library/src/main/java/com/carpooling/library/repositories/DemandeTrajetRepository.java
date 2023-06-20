package com.dupoteaux.Repository;

import com.dupoteaux.Entity.DemandeTrajet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryDemandeTrajet  extends JpaRepository<DemandeTrajet,String> {
}
