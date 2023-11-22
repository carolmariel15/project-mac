package com.project.mac.model.entity;


import jakarta.persistence.*;

@Entity
@Table(name = "tb_insumos")

public class Insumos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idInsumo;

    @Column
    private String codigoInsumo;

    @Column
    private  String descripcionInsumo;

    @Column
    private String unidadInsumo;

    @Column
    private String precioInsumo;

    @Column
    private String flagPrioridadInsumo;

    @ManyToOne
    @JoinColumn(name="id_categoria_insumo")
    CategoriaInsumos categoriaInsumos;


    public int getId() {
        return idInsumo;
    }

    public void setId(int idInsumo) {
        this.idInsumo = idInsumo;
    }

    public String getCodInsumo() {
        return codigoInsumo;
    }

    public void setCodInsumo(String codInsumo) {
        this.codigoInsumo = codInsumo;
    }

    public String getDesInsumo() {
        return descripcionInsumo;
    }

    public void setDesInsumo(String descripcionInsumo) {
        this.descripcionInsumo = descripcionInsumo;
    }

    public String getUniInsumo() {
        return unidadInsumo;
    }

    public void setUniInsumo(String uniInsumo) {
        this.unidadInsumo = uniInsumo;
    }

    public String getPreInsumo() {
        return precioInsumo;
    }

    public void setPreInsumo(String preInsumo) {
        this.precioInsumo = preInsumo;
    }

    public String getPriInsumo() {
        return flagPrioridadInsumo;
    }

    public void setPriInsumo(String priInsumo) {
        this.flagPrioridadInsumo = priInsumo;
    }

    public CategoriaInsumos getCategoriaInsumos() {
        return categoriaInsumos;
    }

    public void setCategoriaInsumos(CategoriaInsumos categoriaInsumos) {
        this.categoriaInsumos = categoriaInsumos;
    }
}
