package com.devrenan.acesso_api.adapter.converters;

import com.devrenan.acesso_api.adapter.dtos.UsuarioDto;
import com.devrenan.acesso_api.core.domain.Usuario;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Component
public class UsuarioConverter {

  public Usuario toDomain(UsuarioDto usuarioDto) {
    return new Usuario(
        usuarioDto.getId(),
        usuarioDto.getEmail(),
        usuarioDto.getSenha(),
        usuarioDto.getAdministrator());
  }

  public UsuarioDto toDTO(Usuario usuario) {
    return new UsuarioDto(
        usuario.getId(), null, usuario.getEmail(), usuario.getSenha(), usuario.getAdministrator());
  }
}
