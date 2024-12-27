package com.devrenan.acesso_api.core.ports;

import com.devrenan.acesso_api.core.domain.Usuario;

public interface UsuarioRepositoryPort {

    public Usuario create(Usuario usuario);
}
