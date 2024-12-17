package com.devrenan.acesso_api.adapter.controllers;

import com.devrenan.acesso_api.adapter.converters.UsuarioConverter;
import com.devrenan.acesso_api.adapter.dtos.UsuarioDto;
import com.devrenan.acesso_api.core.domain.ports.UsuarioServicePort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/usuarios")
public class UsuarioController {


    private final UsuarioServicePort usuarioServicePort;
    private final UsuarioConverter usuarioConverter;


    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public UsuarioDto criaUsuario(@RequestBody UsuarioDto usuarioDto){
        System.out.println(usuarioDto);
        usuarioServicePort.createUsuario()
        return usuarioDto;
    }
}
