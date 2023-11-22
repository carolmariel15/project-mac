package com.project.mac.service;

import com.project.mac.model.entity.CategoriaReceta;

import java.util.List;
import java.util.Optional;

public interface ICategoriaRecetaService {

    List<CategoriaReceta> list();
    Optional<CategoriaReceta> listById(int id);
    CategoriaReceta add(CategoriaReceta entity);
    CategoriaReceta edit(CategoriaReceta entity);
    void delete(int id);
    
}
