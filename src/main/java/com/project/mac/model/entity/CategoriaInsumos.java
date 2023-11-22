package com.project.mac.model.entity;


import jakarta.persistence.*;

@Entity
@Table(name="tb_categoriainsumo")

public class CategoriaInsumos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int id_categoria_insumo;

    @Column
    private String nombre_categoria_insumo;

    public int getId_categoria_insumo() {
        return id_categoria_insumo;
    }

    public void setId_categoria_insumo(int id_categoria_insumo) {
        this.id_categoria_insumo = id_categoria_insumo;
    }

    public String getNombre_categoria_insumo() {
        return nombre_categoria_insumo;
    }

    public void setNombre_categoria_insumo(String nombre_categoria_insumo) {
        this.nombre_categoria_insumo = nombre_categoria_insumo;
    }
}
