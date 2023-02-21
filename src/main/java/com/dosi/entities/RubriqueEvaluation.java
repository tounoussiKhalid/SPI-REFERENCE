package com.dosi.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "RUBRIQUE_EVALUATION")
public class RubriqueEvaluation {
    @Id
    @Column(name = "ID_RUBRIQUE_EVALUATION", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ID_EVALUATION", nullable = false)
    private Evaluation idEvaluation;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_RUBRIQUE")
    private Rubrique idRubrique;

    @Column(name = "ORDRE", nullable = false)
    private Short ordre;

    @Column(name = "DESIGNATION", length = 64)
    private String designation;

}