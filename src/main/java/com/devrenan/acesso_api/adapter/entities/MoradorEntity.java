package com.devrenan.acesso_api.adapter.entities;

import com.devrenan.acesso_api.core.domain.Pessoa;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "tb_morador")
public class MoradorEntity {

  @Id
  @GeneratedValue
  private Long id;
  private String cpf;
  private String endereco;
  private String celular;
  @OneToOne
  @JoinColumn(name = "id_pessoa")
  private PessoaEntity pessoa;

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

  public PessoaEntity getPessoa() {
    return pessoa;
  }

  public void setPessoa(PessoaEntity pessoa) {
    this.pessoa = pessoa;
  }
}
