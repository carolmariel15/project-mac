package com.project.mac.service;

import com.project.mac.model.entity.CategoriaInsumo;
import com.project.mac.model.entity.CategoriaReceta;

import java.util.List;
import java.util.Optional;

public interface ICategoriaInsumoService {
    List<CategoriaInsumo> list();
    Optional<CategoriaInsumo> listById(int id);
    CategoriaInsumo add(CategoriaInsumo entity);
    CategoriaInsumo edit(CategoriaInsumo entity);
    void delete(int id);
}
