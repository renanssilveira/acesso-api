package com.devrenan.acesso_api.core.domain;

public class Visitante {
    private Long id;
    private String rg;
    private Long idPessoa;

    public Visitante(Long id, String rg, Long idPessoa) {
        this.id = id;
        this.rg = rg;
        this.idPessoa = idPessoa;
    }

    public Visitante() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public Long getIdPessoa() {
        return idPessoa;
    }

    public void setIdPessoa(Long idPessoa) {
        this.idPessoa = idPessoa;
    }
}
