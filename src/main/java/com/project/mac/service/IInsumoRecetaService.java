package com.project.mac.service;

import com.project.mac.model.entity.InsumoReceta;

import java.util.List;
import java.util.Optional;

public interface IInsumoRecetaService {

    List<InsumoReceta> list();
    Optional<InsumoReceta> listById(int id);
    InsumoReceta add(InsumoReceta entity);
    InsumoReceta edit(InsumoReceta entity);
    void delete(int id);


}
