package com.project.mac.service.impl;


import com.project.mac.model.entity.Insumos;
import com.project.mac.repository.IInsumoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class InsumoService {

    @Autowired
    IInsumoRepository insumoRepository;

    public ArrayList<Insumos> getInsumos(){
        return (ArrayList<Insumos>) insumoRepository.findAll();
    }

    public Insumos saveInsumos(Insumos insumo){
        return insumoRepository.save(insumo);
    }

    public Optional<Insumos> getById(Long id){

        return insumoRepository.findById(id);
    }

    public Insumos updateById(Insumos request, Long id){
        Insumos insumos=insumoRepository.findById(id).get();

        insumos.setCodInsumo(request.getCodInsumo());
        insumos.setDesInsumo(request.getDesInsumo());
        insumos.setUniInsumo(request.getUniInsumo());
        insumos.setPreInsumo(request.getPreInsumo());
        insumos.setPriInsumo(request.getPriInsumo());

        return insumos;
    }


    public Boolean deleteInsumo(Long id){
        try{
            insumoRepository.deleteById(id);
            return true;
        }catch (Exception e){
            return false;
        }
    }
}
