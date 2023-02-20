package com.dosi.entities;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "DROIT")
public class Droit {
    @EmbeddedId
    private DroitId id;

    @Column(name = "CONSULTATION", nullable = false)
    private Boolean consultation = false;

    @Column(name = "DUPLICATION", nullable = false)
    private Boolean duplication = false;

}