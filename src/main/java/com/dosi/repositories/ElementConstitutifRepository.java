package com.dosi.repositories;

import com.dosi.entities.ElementConstitutif;
import com.dosi.entities.ElementConstitutifId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ElementConstitutifRepository extends JpaRepository<ElementConstitutif, ElementConstitutifId> {
}