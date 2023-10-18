package com.example.clinica_veterinaria.services;

import com.example.clinica_veterinaria.modelo.entities.CitaMedicaEntity;

import java.util.List;

public interface CitaMedicaService {

    List<CitaMedicaEntity> listarCitasMedicas();

    CitaMedicaEntity consultarPorId(String id);
}
