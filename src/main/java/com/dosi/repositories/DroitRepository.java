package com.dosi.repositories;

import com.dosi.entities.Droit;
import com.dosi.entities.DroitId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DroitRepository extends JpaRepository<Droit, DroitId> {
}