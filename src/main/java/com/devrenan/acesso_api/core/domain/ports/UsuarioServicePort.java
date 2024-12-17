package com.devrenan.acesso_api.core.domain.ports;

import com.devrenan.acesso_api.core.domain.Usuario;
import org.springframework.stereotype.Service;

@Service
public interface UsuarioServicePort {
    Usuario createUsuario(Usuario usuario);
}
