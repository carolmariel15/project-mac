package com.project.mac.controller;

import com.project.mac.model.entity.CategoriaReceta;
import com.project.mac.service.ICategoriaRecetaService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@RequestMapping("/categoria-receta")
@RestController
@RequiredArgsConstructor
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class CategoriaRecetaController {

    private final ICategoriaRecetaService service;

    @GetMapping
    ResponseEntity<List<CategoriaReceta>> list() {
        var result = service.list();
        if(result.isEmpty()) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(result);
    }

    @GetMapping("/{id}")
    ResponseEntity<CategoriaReceta> listById(@PathVariable int id) {
        var result = service.listById(id).get();

        return ResponseEntity.ok(result);
    }

    @PostMapping
    ResponseEntity<CategoriaReceta> add(@RequestBody CategoriaReceta entity) {
        var result = service.add(entity);
        return ResponseEntity.created(URI.create("/" + result.getIdCategoriaReceta())).body(result);
    }

    @PatchMapping
    ResponseEntity<CategoriaReceta> edit(@RequestBody CategoriaReceta entity) {
        var result = service.edit(entity);
        return ResponseEntity.ok(result);
    }

    @DeleteMapping("/{id}")
    ResponseEntity<Void> delete(@PathVariable int id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
    
}
