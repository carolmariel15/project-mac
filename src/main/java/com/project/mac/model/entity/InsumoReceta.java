package com.project.mac.model.entity;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tb_insumo_receta")
public class InsumoReceta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idRecetaInsumo;
    @ManyToOne
    @JoinColumn(name = "id_insumo", nullable = false, foreignKey = @ForeignKey(name = "tb_insumo_receta_ibfk_1"))
    private Insumos insumos;
    @ManyToOne
    @JoinColumn(name = "id_receta", nullable = false, foreignKey = @ForeignKey(name = "tb_insumo_receta_ibfk_2"))
    private Receta receta;

}
