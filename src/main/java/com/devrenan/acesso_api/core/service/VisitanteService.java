package com.devrenan.acesso_api.core.service;

import com.devrenan.acesso_api.core.domain.Visitante;
import com.devrenan.acesso_api.core.ports.VisitanteRepositoryPort;
import com.devrenan.acesso_api.core.ports.VisitanteServicePort;
import org.springframework.stereotype.Service;

@Service
public class VisitanteService implements VisitanteServicePort {

  private final VisitanteRepositoryPort visitanteRepositoryPort;

    public VisitanteService(VisitanteRepositoryPort visitanteRepositoryPort) {
        this.visitanteRepositoryPort = visitanteRepositoryPort;
    }

    @Override
  public Visitante createVisitante(Visitante visitante) {
      Visitante visitanteExistente = visitanteRepositoryPort.obtianByRg(visitante.getRg());
      if(visitanteExistente != null) {
          throw new IllegalArgumentException("Visitante já cadastrado");
      }
      return visitanteRepositoryPort.create(visitante);
  }
}
