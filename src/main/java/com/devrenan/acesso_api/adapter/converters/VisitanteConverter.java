package com.devrenan.acesso_api.adapter.converters;

import com.devrenan.acesso_api.adapter.dtos.VisitanteDto;
import com.devrenan.acesso_api.core.domain.Pessoa;
import com.devrenan.acesso_api.core.domain.Visitante;
import org.springframework.stereotype.Component;

@Component
public class VisitanteConverter {

  public Visitante toDomain(VisitanteDto visitanteDto) {
    return new Visitante(
        visitanteDto.getId(),
        visitanteDto.getNome(),
        visitanteDto.getRg(),
        new Pessoa(null, visitanteDto.getNome()));
  }

  public VisitanteDto toDTO(Visitante visitante) {
    return new VisitanteDto(
        visitante.getId(),
        visitante.getNome(),
            visitante.getRg());
  }
}
