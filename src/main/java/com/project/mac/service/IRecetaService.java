package com.project.mac.service;

import com.project.mac.model.entity.Receta;

import java.util.List;
import java.util.Optional;

public interface IRecetaService {

    List<Receta> list();
    Optional<Receta> listById(int id);
    Receta add(Receta entity);
    Receta edit(Receta entity);
    void delete(int id);

}
