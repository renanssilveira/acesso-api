package com.devrenan.acesso_api.adapter.dtos;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class UsuarioDto {
    private Long id;
    private String nome;
    private String email;
    private String senha;
    private Boolean administrator;

}
