package com.devrenan.acesso_api.core.domain;


public class Usuario {
  private Long id;
  private String email;
  private String senha;
  private Boolean administrator;
  private Pessoa pessoa;


    public Usuario(Long id, String email, String senha, Boolean administrator, Pessoa pessoa) {
        this.id = id;
        this.email = email;
        this.senha = senha;
        this.administrator = administrator;
        this.pessoa = pessoa;
    }

    public Usuario() {

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

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }
}
