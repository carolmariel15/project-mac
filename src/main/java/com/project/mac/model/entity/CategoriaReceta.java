package com.project.mac.model.entity;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tb_categoriareceta")
public class CategoriaReceta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idCategoriaReceta;
    private String nombreCategoriaReceta;

}
