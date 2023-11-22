package com.project.mac.service.impl;

import com.project.mac.configuration.ResourceNotFoundException;
import com.project.mac.model.entity.InsumoReceta;
import com.project.mac.repository.IInsumoRecetaRepository;
import com.project.mac.service.IInsumoRecetaService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class InsumoRecetaImpl implements IInsumoRecetaService {

    private final IInsumoRecetaRepository repository;

    @Override
    public List<InsumoReceta> list() {
        return repository.findAll();
    }

    @Override
    public Optional<InsumoReceta> listById(int id) {
        return repository.findById(id);
    }

    @Override
    public InsumoReceta add(InsumoReceta entity) {
        return repository.save(entity);
    }

    @Override
    public InsumoReceta edit(InsumoReceta entity) {
        var bm = repository.findById(entity.getIdRecetaInsumo());

        if(bm.isPresent()) {
            return repository.save(entity);
        } else {
            throw new ResourceNotFoundException("No existe el insumo en la receta", HttpStatus.CONFLICT);
        }
    }

    @Override
    public void delete(int id) {
        var bm = repository.findById(id);

        if(bm.isPresent()) {
            repository.deleteById(id);
        } else {
            throw new ResourceNotFoundException("No existe el insumo en la receta", HttpStatus.CONFLICT);
        }
    }
    
}
