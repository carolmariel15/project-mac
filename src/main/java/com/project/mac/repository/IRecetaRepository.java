package com.project.mac.repository;

import com.project.mac.model.entity.Receta;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IRecetaRepository extends JpaRepository<Receta, Integer> {

}
