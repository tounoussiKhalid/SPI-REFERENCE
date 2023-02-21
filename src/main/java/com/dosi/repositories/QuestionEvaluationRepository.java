package com.dosi.repositories;

import com.dosi.entities.QuestionEvaluation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuestionEvaluationRepository extends JpaRepository<QuestionEvaluation, Integer> {
}