package com.project.mac.controller;

import com.project.mac.model.entity.CategoriaInsumo;
import com.project.mac.service.ICategoriaInsumoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@RequestMapping("/categoriainsumo")
@RestController
@RequiredArgsConstructor
@CrossOrigin(origins = "*", allowedHeaders = "*")

public class CategoriaInsumoController {

    private final ICategoriaInsumoService service;

    @GetMapping
    ResponseEntity<List<CategoriaInsumo>> list() {
        var result = service.list();
        if(result.isEmpty()) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(result);
    }

    @GetMapping("/{id}")
    ResponseEntity<CategoriaInsumo> listById(@PathVariable int id) {
        var result = service.listById(id).get();

        return ResponseEntity.ok(result);
    }

    @PostMapping
    ResponseEntity<CategoriaInsumo> add(CategoriaInsumo entity) {
        var result = service.add(entity);
        return ResponseEntity.created(URI.create("/" + result.getId_categoria_insumo())).body(result);
    }

    @PatchMapping
    ResponseEntity<CategoriaInsumo> edit(CategoriaInsumo entity) {
        var result = service.edit(entity);
        return ResponseEntity.ok(result);
    }

    @DeleteMapping("/{id}")
    ResponseEntity<Void> delete(@PathVariable int id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }



}
