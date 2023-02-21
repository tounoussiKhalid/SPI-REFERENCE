package com.dosi.repositories;

import com.dosi.entities.Authentification;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthentificationRepository extends JpaRepository<Authentification, Long> {
}