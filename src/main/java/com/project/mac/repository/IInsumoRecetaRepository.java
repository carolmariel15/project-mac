package com.project.mac.repository;

import com.project.mac.model.entity.InsumoReceta;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IInsumoRecetaRepository extends JpaRepository<InsumoReceta, Integer> {
}
