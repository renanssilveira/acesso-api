package com.devrenan.acesso_api.adapter.repositories;

import com.devrenan.acesso_api.adapter.entities.UsuarioEntity;
import com.devrenan.acesso_api.core.domain.Usuario;
import com.devrenan.acesso_api.core.ports.UsuarioRepositoryPort;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component

public class UsuarioRepositoryAdapter implements UsuarioRepositoryPort {

  private final UsuarioRepository usuarioRepository;
  private final ModelMapper modelMapper;

    public UsuarioRepositoryAdapter(UsuarioRepository usuarioRepository, ModelMapper modelMapper) {
        this.usuarioRepository = usuarioRepository;
        this.modelMapper = modelMapper;
    }


    @Override
  public Usuario create(Usuario usuario) {
        UsuarioEntity usuarioEntity = modelMapper.map(usuario, UsuarioEntity.class);
        return modelMapper.map(
        usuarioRepository.save(usuarioEntity), Usuario.class);
  }
}
