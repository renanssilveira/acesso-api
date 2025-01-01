package com.devrenan.acesso_api.adapter.dtos;

public class VisitanteDto {
  private Long id;
  private String nome;
  private String rg;

  public VisitanteDto(Long id, String nome, String rg) {
    this.id = id;
    this.nome = nome;
    this.rg = rg;
  }

  public VisitanteDto() {
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
}
