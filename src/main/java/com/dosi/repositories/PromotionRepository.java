package com.dosi.repositories;

import com.dosi.entities.Promotion;
import com.dosi.entities.PromotionId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PromotionRepository extends JpaRepository<Promotion, PromotionId> {
}