package com.facens.ac1.Model;

import jakarta.persistence.*;

@Entity
public class Produtos {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_produtos;


    @Column(columnDefinition = "TINYTEXT")
    private String prod_nome;

    private Integer prod_qtd;

    @ManyToOne
    private Categorias categorias;

    public Integer getId_produtos() {
        return id_produtos;
    }

    public void setId_produtos(Integer id_produtos) {
        this.id_produtos = id_produtos;
    }

    public String getProd_nome() {
        return prod_nome;
    }

    public void setProd_nome(String prod_nome) {
        this.prod_nome = prod_nome;
    }

    public Integer getProd_qtd() {
        return prod_qtd;
    }

    public void setProd_qtd(Integer prod_qtd) {
        this.prod_qtd = prod_qtd;
    }

    public Categorias getCategorias() {
        return categorias;
    }

    public void setCategorias(Categorias categorias) {
        this.categorias = categorias;
    }

    public Produtos(String  prod_nome, Integer prod_qtd, Categorias categorias){
        this.prod_nome = prod_nome;
        this.prod_qtd = prod_qtd;
        this.categorias = categorias;
    }

    public Produtos() {
    }
}
