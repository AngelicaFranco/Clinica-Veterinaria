package com.example.clinica_veterinaria.services;

import com.example.clinica_veterinaria.modelo.HistoriaClinicaEntity;

import java.util.List;

public interface HistoriaClinicaService {

    List<HistoriaClinicaEntity> listarHistoriasClinicas();

    HistoriaClinicaEntity consultarPorId(String id);
}