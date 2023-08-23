package com.medeirosgabriel.security.repository;

import java.util.Optional;

import com.medeirosgabriel.security.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {

  Optional<User> findByEmail(String email);

}
