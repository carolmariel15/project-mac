package com.project.mac.model.entity;


import jakarta.persistence.*;
import org.hibernate.annotations.CollectionId;

@Entity
@Table(name = "insumos")

public class Insumos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String codInsumo;

    @Column
    private  String desInsumo;

    @Column
    private String uniInsumo;

    @Column
    private String preInsumo;

    @Column
    private String priInsumo;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCodInsumo() {
        return codInsumo;
    }

    public void setCodInsumo(String codInsumo) {
        this.codInsumo = codInsumo;
    }

    public String getDesInsumo() {
        return desInsumo;
    }

    public void setDesInsumo(String desInsumo) {
        this.desInsumo = desInsumo;
    }

    public String getUniInsumo() {
        return uniInsumo;
    }

    public void setUniInsumo(String uniInsumo) {
        this.uniInsumo = uniInsumo;
    }

    public String getPreInsumo() {
        return preInsumo;
    }

    public void setPreInsumo(String preInsumo) {
        this.preInsumo = preInsumo;
    }

    public String getPriInsumo() {
        return priInsumo;
    }

    public void setPriInsumo(String priInsumo) {
        this.priInsumo = priInsumo;
    }
}
