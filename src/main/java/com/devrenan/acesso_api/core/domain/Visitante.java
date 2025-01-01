package com.devrenan.acesso_api.core.domain;

public class Visitante {
    private Long id;
    private String nome;
    private String rg;
    private Pessoa pessoa;

    public Visitante(Long id, String nome, String rg, Pessoa pessoa) {
        this.id = id;
        this.nome = nome;
        this.rg = rg;
        this.pessoa = pessoa;
    }

    public Visitante() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }
}
