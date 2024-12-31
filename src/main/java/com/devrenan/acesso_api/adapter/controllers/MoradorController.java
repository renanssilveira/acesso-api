package com.devrenan.acesso_api.adapter.controllers;

import com.devrenan.acesso_api.adapter.converters.MoradorConverter;
import com.devrenan.acesso_api.adapter.dtos.MoradorDto;
import com.devrenan.acesso_api.core.ports.MoradorServicePort;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/moradores")
public class MoradorController {

  private final MoradorServicePort moradorServicePort;
  private final MoradorConverter moradorConverter;

  public MoradorController(
      MoradorServicePort moradorServicePort, MoradorConverter moradorConverter) {
    this.moradorServicePort = moradorServicePort;
    this.moradorConverter = moradorConverter;
  }

  @PostMapping
  @ResponseStatus(HttpStatus.CREATED)
  public MoradorDto criaMorador(@RequestBody MoradorDto moradorDto) {
    return moradorConverter.toDTO(
        moradorServicePort.createMorador(moradorConverter.toDomain(moradorDto)));
  }
}
