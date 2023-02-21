package com.dosi.repositories;

import com.dosi.entities.ReponseQuestion;
import com.dosi.entities.ReponseQuestionId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReponseQuestionRepository extends JpaRepository<ReponseQuestion, ReponseQuestionId> {
}