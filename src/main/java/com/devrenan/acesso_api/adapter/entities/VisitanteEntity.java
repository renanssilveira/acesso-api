package com.devrenan.acesso_api.adapter.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "tb_visitante")
public class VisitanteEntity {

  @Id
  @GeneratedValue
  private Long id;
  private String nome;
  private String rg;
  @OneToOne
  @JoinColumn(name = "id_pessoa")
  private PessoaEntity pessoa;

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

  public PessoaEntity getPessoa() {
    return pessoa;
  }

  public void setPessoa(PessoaEntity pessoa) {
    this.pessoa = pessoa;
  }
}
