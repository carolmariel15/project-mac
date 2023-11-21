package com.project.mac.repository;


import com.project.mac.model.entity.Insumos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IInsumoRepository extends JpaRepository <Insumos, Long> {


}
