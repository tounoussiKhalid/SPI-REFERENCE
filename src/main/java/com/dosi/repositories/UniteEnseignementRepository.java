package com.dosi.repositories;

import com.dosi.entities.UniteEnseignement;
import com.dosi.entities.UniteEnseignementId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UniteEnseignementRepository extends JpaRepository<UniteEnseignement, UniteEnseignementId> {
}