package com.devrenan.acesso_api.adapter.controllers;

import com.devrenan.acesso_api.adapter.converters.UsuarioConverter;
import com.devrenan.acesso_api.adapter.dtos.UsuarioDto;
import com.devrenan.acesso_api.core.domain.Usuario;
import com.devrenan.acesso_api.core.domain.ports.UsuarioServicePort;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/usuarios")
@RequiredArgsConstructor
public class UsuarioController {

  private final UsuarioServicePort usuarioServicePort;
  private final UsuarioConverter usuarioConverter;

  @PostMapping
  @ResponseStatus(HttpStatus.CREATED)
  public UsuarioDto criaUsuario(@RequestBody UsuarioDto usuarioDto) {
    return usuarioConverter.toDTO(
        usuarioServicePort.createUsuario(usuarioConverter.toDomain(usuarioDto)));
  }
}
