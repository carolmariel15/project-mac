package com.project.mac.service.impl;

import com.project.mac.configuration.ResourceNotFoundException;
import com.project.mac.model.entity.Receta;
import com.project.mac.repository.IRecetaRepository;
import com.project.mac.service.IRecetaService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class RecetaServiceImpl implements IRecetaService {

    private final IRecetaRepository repository;

    @Override
    public List<Receta> list() {
        return repository.findAll();
    }

    @Override
    public Optional<Receta> listById(int id) {
        return repository.findById(id);
    }

    @Override
    public Receta add(Receta entity) {
        return repository.save(entity);
    }

    @Override
    public Receta edit(Receta entity) {
        var bm = repository.findById(entity.getIdReceta());

        if(bm.isPresent()) {
            return repository.save(entity);
        } else {
            throw new ResourceNotFoundException("No existe la receta", HttpStatus.CONFLICT);
        }
    }

    @Override
    public void delete(int id) {
        var bm = repository.findById(id);

        if(bm.isPresent()) {
            repository.deleteById(id);
        } else {
            throw new ResourceNotFoundException("No existe la receta", HttpStatus.CONFLICT);
        }
    }
    
}
