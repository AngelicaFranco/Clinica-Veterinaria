package com.example.clinica_veterinaria.modelo.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "tratamiento")

public class TratamientoEntity {

    @Id
    private Integer id;

    @Column(name = "procedimiento")
    private String procedimiento;
}
