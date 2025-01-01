package com.devrenan.acesso_api.adapter.repositories;

import com.devrenan.acesso_api.adapter.entities.VisitanteEntity;
import com.devrenan.acesso_api.core.domain.Visitante;
import com.devrenan.acesso_api.core.ports.VisitanteRepositoryPort;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class VisitanteRepositoryAdapter implements VisitanteRepositoryPort {

  private final ModelMapper modelMapper;
  private final VisitanteRepository visitanteRepository;
  private final PessoaRespositoryAdapter pessoaRepository;

  public VisitanteRepositoryAdapter(
      ModelMapper modelMapper,
      VisitanteRepository visitanteRepository,
      PessoaRespositoryAdapter pessoaRepository) {
    this.modelMapper = modelMapper;
    this.visitanteRepository = visitanteRepository;
    this.pessoaRepository = pessoaRepository;
  }

  @Override
  public Visitante create(Visitante visitante) {
    VisitanteEntity entity = modelMapper.map(visitante, VisitanteEntity.class);
    entity.setPessoa(pessoaRepository.createPessoa(visitante.getPessoa()));
    return modelMapper.map(visitanteRepository.save(entity), Visitante.class);
  }

  @Override
  public Visitante obtianByRg(String rg) {
    VisitanteEntity byRg = visitanteRepository.findByRg(rg);
    if (byRg != null) {
      return modelMapper.map(byRg, Visitante.class);
    }
    return null;
  }
}
