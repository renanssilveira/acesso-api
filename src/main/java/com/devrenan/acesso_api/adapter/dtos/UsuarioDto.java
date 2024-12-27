package com.devrenan.acesso_api.adapter.dtos;



public class UsuarioDto {
    private Long id;
    private String nome;
    private String email;
    private String senha;
    private Boolean administrator;

    public UsuarioDto(Long id, String nome, String email, String senha, Boolean administrator) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.administrator = administrator;
    }

    public UsuarioDto() {
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
