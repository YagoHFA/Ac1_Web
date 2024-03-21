package com.facens.ac1.Model;

import jakarta.persistence.*;

@Entity
public class Categorias {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_categorias;

    @Column(columnDefinition = "TINYTEXT")
    private String cat_nome;

    @Column(columnDefinition = "TINYTEXT")
    private String cat_descricao;

    public Integer getId_categorias() {
        return id_categorias;
    }

    public void setId_categorias(Integer id_categorias) {
        this.id_categorias = id_categorias;
    }

    public String getCat_nome() {
        return cat_nome;
    }

    public void setCat_nome(String cat_nome) {
        this.cat_nome = cat_nome;
    }

    public String getCat_descricao() {
        return cat_descricao;
    }

    public void setCat_descricao(String cat_descricao) {
        this.cat_descricao = cat_descricao;
    }

    public Categorias(String cat_nome, String cat_descricao) {
        this.cat_nome = cat_nome;
        this.cat_descricao = cat_descricao;
    }

    public Categorias(Integer id_categorias, String cat_nome, String cat_descricao) {
        this.id_categorias = id_categorias;
        this.cat_nome = cat_nome;
        this.cat_descricao = cat_descricao;
    }

    public Categorias() {
    }
}
