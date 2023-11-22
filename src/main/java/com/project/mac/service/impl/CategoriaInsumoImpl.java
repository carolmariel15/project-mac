package com.project.mac.service.impl;

import com.project.mac.configuration.ResourceNotFoundException;
import com.project.mac.model.entity.CategoriaInsumo;
import com.project.mac.model.entity.CategoriaReceta;
import com.project.mac.repository.ICategoriaInsumoRepository;
import com.project.mac.repository.ICategoriaRecetaRepository;
import com.project.mac.service.ICategoriaInsumoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CategoriaInsumoImpl implements ICategoriaInsumoService {
    private final ICategoriaInsumoRepository repository;

    @Override
    public List<CategoriaInsumo> list() {
        return repository.findAll();
    }

    @Override
    public Optional<CategoriaInsumo> listById(int id) {
        return repository.findById(id);
    }

    @Override
    public CategoriaInsumo add(CategoriaInsumo entity) {
        return repository.save(entity);
    }

    @Override
    public CategoriaInsumo edit(CategoriaInsumo entity) {
        var bm = repository.findById(entity.getId_categoria_insumo());

        if(bm.isPresent()) {
            return repository.save(entity);
        } else {
            throw new ResourceNotFoundException("No existe la categoria del Insumo", HttpStatus.CONFLICT);
        }
    }

    @Override
    public void delete(int id) {
        var bm = repository.findById(id);

        if(bm.isPresent()) {
            repository.deleteById(id);
        } else {
            throw new ResourceNotFoundException("No existe la categoria del Insumo", HttpStatus.CONFLICT);
        }
    }
}
