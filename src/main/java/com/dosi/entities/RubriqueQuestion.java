package com.dosi.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "RUBRIQUE_QUESTION")
public class RubriqueQuestion {
    @EmbeddedId
    private RubriqueQuestionId id;

    @MapsId("idRubrique")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ID_RUBRIQUE", nullable = false)
    private Rubrique idRubrique;

    @MapsId("idQuestion")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ID_QUESTION", nullable = false)
    private Question idQuestion;

    @Column(name = "ORDRE", nullable = false)
    private Long ordre;

}