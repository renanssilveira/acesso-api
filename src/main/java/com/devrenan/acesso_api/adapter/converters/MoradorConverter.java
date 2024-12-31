package com.devrenan.acesso_api.adapter.converters;

import com.devrenan.acesso_api.adapter.dtos.MoradorDto;
import com.devrenan.acesso_api.adapter.dtos.UsuarioDto;
import com.devrenan.acesso_api.core.domain.Morador;
import com.devrenan.acesso_api.core.domain.Pessoa;
import com.devrenan.acesso_api.core.domain.Usuario;
import org.springframework.stereotype.Component;

@Component
public class MoradorConverter {

  public Morador toDomain(MoradorDto moradorDto) {
    return new Morador(moradorDto.getId(),
            moradorDto.getCpf(),
        moradorDto.getEndereco(), moradorDto.getCelular(),
            new Pessoa(null, moradorDto.getPessoa()));
  }

  public UsuarioDto toDTO(Usuario usuario) {
    return new UsuarioDto(
        usuario.getId(), null, usuario.getEmail(), usuario.getSenha(), usuario.getAdministrator());
  }
}
