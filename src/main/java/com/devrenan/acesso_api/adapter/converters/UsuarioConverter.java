package com.devrenan.acesso_api.adapter.converters;

import com.devrenan.acesso_api.adapter.dtos.UsuarioDto;
import com.devrenan.acesso_api.core.domain.Pessoa;
import com.devrenan.acesso_api.core.domain.Usuario;

import org.springframework.stereotype.Component;


@Component
public class UsuarioConverter {

  public Usuario toDomain(UsuarioDto usuarioDto) {
    return new Usuario(
        usuarioDto.getId(),
        usuarioDto.getEmail(),
        usuarioDto.getSenha(),
        usuarioDto.getAdministrator(),
        new Pessoa(null, usuarioDto.getNome()));
  }

  public UsuarioDto toDTO(Usuario usuario) {
    return new UsuarioDto(
        usuario.getId(), null, usuario.getEmail(), usuario.getSenha(), usuario.getAdministrator());
  }
}
