package com.devrenan.acesso_api.adapter.repositories;

import com.devrenan.acesso_api.adapter.entities.MoradorEntity;
import com.devrenan.acesso_api.adapter.entities.PessoaEntity;
import com.devrenan.acesso_api.core.domain.Morador;
import com.devrenan.acesso_api.core.domain.Pessoa;
import com.devrenan.acesso_api.core.domain.Usuario;
import com.devrenan.acesso_api.core.ports.MoradorRepositoryPort;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class MoradorRepositoryAdapter implements MoradorRepositoryPort {

  private final ModelMapper modelMapper;
  private final MoradorRepository moradorRepository;
  private final PessoaRespositoryAdapter pessoaRepository;

  public MoradorRepositoryAdapter(
      ModelMapper modelMapper,
      MoradorRepository moradorRepository,
      PessoaRespositoryAdapter pessoaRepository) {
    this.modelMapper = modelMapper;
    this.moradorRepository = moradorRepository;
    this.pessoaRepository = pessoaRepository;
  }

  @Override
  public Morador create(Morador morador) {

    MoradorEntity entity = modelMapper.map(morador, MoradorEntity.class);
    entity.setPessoa(pessoaRepository.createPessoa(morador.getPessoa()));
    MoradorEntity moradorEntity = moradorRepository.save(entity);
    return modelMapper.map(moradorEntity, Morador.class);
  }

  @Override
  public Morador obtianByCpf(String cpf) {
    MoradorEntity byCpf = moradorRepository.findByCpf(cpf) ;
    if (byCpf != null) {
      return modelMapper.map(byCpf, Morador.class);
    }
    return null;
  }
}
