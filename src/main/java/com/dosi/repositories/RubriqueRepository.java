package com.dosi.repositories;

import com.dosi.entities.Rubrique;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RubriqueRepository extends JpaRepository<Rubrique, Integer> {
}