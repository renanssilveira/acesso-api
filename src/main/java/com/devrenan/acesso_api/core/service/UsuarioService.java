package com.devrenan.acesso_api.core.service;

import com.devrenan.acesso_api.core.domain.Usuario;
import com.devrenan.acesso_api.core.ports.UsuarioServicePort;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService implements UsuarioServicePort {
    @Override
    public Usuario createUsuario(Usuario usuario) {
          return usuario;
    }
}
