package com.devrenan.acesso_api.core.service;

import com.devrenan.acesso_api.core.domain.Morador;
import com.devrenan.acesso_api.core.ports.MoradorRepositoryPort;
import com.devrenan.acesso_api.core.ports.MoradorServicePort;
import org.springframework.stereotype.Service;

@Service
public class MoradorService implements MoradorServicePort {

  private final MoradorRepositoryPort moradorRepositoryPort;

  public MoradorService(MoradorRepositoryPort moradorRepositoryPort) {
    this.moradorRepositoryPort = moradorRepositoryPort;
  }

  @Override
  public Morador createMorador(Morador morador) {
    Morador moradorExistente = moradorRepositoryPort.obtianByCpf(morador.getCpf());
    if (moradorExistente != null) {
      throw new IllegalArgumentException("Morador já cadastrado");
    }
    return moradorRepositoryPort.create(morador);
  }
}
