package com.devrenan.acesso_api.adapter.repositories;

import com.devrenan.acesso_api.adapter.entities.PessoaEntity;
import com.devrenan.acesso_api.adapter.entities.UsuarioEntity;
import com.devrenan.acesso_api.core.domain.Pessoa;
import com.devrenan.acesso_api.core.domain.Usuario;
import com.devrenan.acesso_api.core.ports.UsuarioRepositoryPort;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class UsuarioRepositoryAdapter implements UsuarioRepositoryPort {

  private final UsuarioRepository usuarioRepository;
  private final PessoaRepository pessoaRepository;
  private final ModelMapper modelMapper;

    public UsuarioRepositoryAdapter(UsuarioRepository usuarioRepository, PessoaRepository pessoaRepository, ModelMapper modelMapper) {
        this.usuarioRepository = usuarioRepository;
        this.pessoaRepository = pessoaRepository;
        this.modelMapper = modelMapper;
    }


    @Override
  public Usuario create(Usuario usuario) {
        PessoaEntity pessoaEntityMap = modelMapper.map(usuario.getPessoa(), PessoaEntity.class);
        PessoaEntity pessoaEntity = pessoaRepository.save(pessoaEntityMap);
        UsuarioEntity usuarioEntity = modelMapper.map(usuario, UsuarioEntity.class);
        usuarioEntity.setPessoa(pessoaEntity);
        UsuarioEntity novoUsuarioEntity = usuarioRepository.save(usuarioEntity);
        return modelMapper.map(novoUsuarioEntity, Usuario.class);
  }
}
