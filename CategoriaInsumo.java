package com.project.mac.model.entity;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tb_categoriainsumo")
public class CategoriaInsumo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_categoria_insumo;
    private String nombre_categoria_insumo;
}
