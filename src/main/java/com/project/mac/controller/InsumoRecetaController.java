package com.project.mac.controller;

import com.project.mac.model.entity.InsumoReceta;
import com.project.mac.service.IInsumoRecetaService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@RequestMapping("/insumo-receta")
@RestController
@RequiredArgsConstructor
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class InsumoRecetaController {

    private final IInsumoRecetaService service;

    @GetMapping
    ResponseEntity<List<InsumoReceta>> list() {
        var result = service.list();
        if(result.isEmpty()) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(result);
    }

    @GetMapping("/{id}")
    ResponseEntity<InsumoReceta> listById(@PathVariable int id) {
        var result = service.listById(id).get();

        return ResponseEntity.ok(result);
    }

    @PostMapping
    ResponseEntity<InsumoReceta> add(@RequestBody InsumoReceta entity) {
        var result = service.add(entity);
        return ResponseEntity.created(URI.create("/" + result.getIdRecetaInsumo())).body(result);
    }

    @PatchMapping
    ResponseEntity<InsumoReceta> edit(@RequestBody InsumoReceta entity) {
        var result = service.edit(entity);
        return ResponseEntity.ok(result);
    }

    @DeleteMapping("/{id}")
    ResponseEntity<Void> delete(@PathVariable int id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
    
}
