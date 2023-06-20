package com.carpooling.library.repositories;


import com.carpooling.library.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryUser extends JpaRepository<User,Integer> {
}
