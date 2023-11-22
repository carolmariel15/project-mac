package com.project.mac.service.impl;

import com.project.mac.configuration.ResourceNotFoundException;
import com.project.mac.model.entity.CategoriaReceta;
import com.project.mac.repository.ICategoriaRecetaRepository;
import com.project.mac.service.ICategoriaRecetaService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
@RequiredArgsConstructor
public class CategoriaRecetaServiceImpl implements ICategoriaRecetaService {

    private final ICategoriaRecetaRepository repository;

    @Override
    public List<CategoriaReceta> list() {
        return repository.findAll();
    }

    @Override
    public Optional<CategoriaReceta> listById(int id) {
        return repository.findById(id);
    }

    @Override
    public CategoriaReceta add(CategoriaReceta entity) {
        return repository.save(entity);
    }

    @Override
    public CategoriaReceta edit(CategoriaReceta entity) {
        var bm = repository.findById(entity.getIdCategoriaReceta());

        if(bm.isPresent()) {
            return repository.save(entity);
        } else {
            throw new ResourceNotFoundException("No existe la categoria de la receta", HttpStatus.CONFLICT);
        }
    }

    @Override
    public void delete(int id) {
        var bm = repository.findById(id);

        if(bm.isPresent()) {
            repository.deleteById(id);
        } else {
            throw new ResourceNotFoundException("No existe la categoria de la receta", HttpStatus.CONFLICT);
        }
    }
    
}
