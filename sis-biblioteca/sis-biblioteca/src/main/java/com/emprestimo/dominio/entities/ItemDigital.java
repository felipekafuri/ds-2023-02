package com.emprestimo.dominio.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
public class ItemDigital {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String titulo;
    private String tipo;

    // Getters, Setters, Construtores

    public ItemDigital() {
        id = null;
        titulo = "";
        tipo = "";
    }

    public ItemDigital(Long id, String titulo, String tipo) {
        this.id = id;
        this.titulo = titulo;
        this.tipo = tipo;
    }

    public Long getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "ItemDigital{" + "id=" + id + ", titulo=" + titulo + ", tipo=" + tipo + '}';
    }

}