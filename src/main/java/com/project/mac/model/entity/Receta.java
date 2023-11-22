package com.project.mac.model.entity;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tb_recetas")
public class Receta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idReceta;
    private String codigoReceta;
    private String nombreReceta;
    @ManyToOne
    @JoinColumn(name = "id_categoria_receta", nullable = false, foreignKey = @ForeignKey(name = "tb_recetas_ibfk_1"))
    private CategoriaReceta categoriaReceta;


}
