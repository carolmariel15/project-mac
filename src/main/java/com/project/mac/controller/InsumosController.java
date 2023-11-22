package com.project.mac.controller;


import com.project.mac.model.entity.Insumos;
import com.project.mac.service.impl.InsumoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("/insumos")
public class InsumosController {

    @Autowired
    private InsumoService insumoService;

    @GetMapping
    public ArrayList<Insumos> getInsumos(){
        return this.insumoService.getInsumos();
    }

    @PostMapping
    public Insumos saveInsumos(@RequestBody Insumos insumos){
        return this.insumoService.saveInsumos(insumos);
    }

    @GetMapping(path = "/{id}")
    public Optional<Insumos> getInsumosById(@PathVariable("id") int id){
        return this.insumoService.getById(id);
    }

    @PutMapping(path = "/{id}")
    public Insumos updateInsumosById(@RequestBody Insumos request,@PathVariable("id") int id){
        return this.insumoService.updateById(request, id);
    }

    @DeleteMapping(path = "/{id}")
    public String deleteById(@PathVariable("id") int id){
        boolean correcto = this.insumoService.deleteInsumo(id);

        if (correcto){
            return "El insumo con " + id + " a sido eliminado correctamente";
        }else {
            return "Se a producido un error al eliminar el insumo con id "+ id;
        }
    }

}
