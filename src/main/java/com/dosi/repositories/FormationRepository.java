package com.dosi.repositories;

import com.dosi.entities.Formation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FormationRepository extends JpaRepository<Formation, String> {
}