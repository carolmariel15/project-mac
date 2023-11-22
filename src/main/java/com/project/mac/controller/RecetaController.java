package com.project.mac.controller;

import com.project.mac.model.entity.Receta;
import com.project.mac.service.IRecetaService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@RequestMapping("/receta")
@RestController
@RequiredArgsConstructor
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class RecetaController {

    private final IRecetaService service;

    @GetMapping
    ResponseEntity<List<Receta>> list() {
        var result = service.list();
        if(result.isEmpty()) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(result);
    }

    @GetMapping("/{id}")
    ResponseEntity<Receta> listById(@PathVariable int id) {
        var result = service.listById(id).get();

        return ResponseEntity.ok(result);
    }

    @PostMapping
    ResponseEntity<Receta> add(Receta entity) {
        var result = service.add(entity);
        return ResponseEntity.created(URI.create("/" + result.getIdReceta())).body(result);
    }

    @PatchMapping
    ResponseEntity<Receta> edit(Receta entity) {
        var result = service.edit(entity);
        return ResponseEntity.ok(result);
    }

    @DeleteMapping("/{id}")
    ResponseEntity<Void> delete(@PathVariable int id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
    
}
