package com.devrenan.acesso_api.core.domain;

public class Morador {
  private Long id;
  private String cpf;
  private String endereco;
  private String celular;


  public Morador(Long id, String cpf, String endereco, String celular, String nome) {
    this.id = id;
    this.cpf = cpf;
    this.endereco = endereco;
    this.celular = celular;
    this.nome = nome;
  }

  public Morador() {

  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getCpf() {
    return cpf;
  }

  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

  public String getEndereco() {
    return endereco;
  }

  public void setEndereco(String endereco) {
    this.endereco = endereco;
  }

  public String getCelular() {
    return celular;
  }

  public void setCelular(String celular) {
    this.celular = celular;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }
}
