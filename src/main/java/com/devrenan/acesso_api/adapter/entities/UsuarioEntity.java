package com.devrenan.acesso_api.adapter.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "tb_usuario")
public class UsuarioEntity {

  @Id
  @GeneratedValue
  private Long id;
  private String email;
  private String senha;
  private Boolean administrator;
  @OneToOne
  @JoinColumn(name = "id_pessoa")
  private PessoaEntity pessoa;

  public PessoaEntity getPessoa() {
    return pessoa;
  }

  public void setPessoa(PessoaEntity pessoa) {
    this.pessoa = pessoa;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getSenha() {
    return senha;
  }

  public void setSenha(String senha) {
    this.senha = senha;
  }

  public Boolean getAdministrator() {
    return administrator;
  }

  public void setAdministrator(Boolean administrator) {
    this.administrator = administrator;
  }
}
