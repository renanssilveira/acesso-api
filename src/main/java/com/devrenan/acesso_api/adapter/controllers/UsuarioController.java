package com.devrenan.acesso_api.adapter.controllers;

import com.devrenan.acesso_api.adapter.converters.UsuarioConverter;
import com.devrenan.acesso_api.adapter.dtos.UsuarioDto;
import com.devrenan.acesso_api.core.ports.UsuarioServicePort;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/usuarios")

public class UsuarioController {

  private final UsuarioServicePort usuarioServicePort;
  private final UsuarioConverter usuarioConverter;

    public UsuarioController(UsuarioServicePort usuarioServicePort, UsuarioConverter usuarioConverter) {
        this.usuarioServicePort = usuarioServicePort;
        this.usuarioConverter = usuarioConverter;
    }

    @PostMapping
  @ResponseStatus(HttpStatus.CREATED)
  public UsuarioDto criaUsuario(@RequestBody UsuarioDto usuarioDto) {
    return usuarioConverter.toDTO(
        usuarioServicePort.createUsuario(usuarioConverter.toDomain(usuarioDto)));
  }
}
