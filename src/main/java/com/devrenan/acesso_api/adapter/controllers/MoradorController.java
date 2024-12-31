package com.devrenan.acesso_api.adapter.controllers;

import com.devrenan.acesso_api.adapter.dtos.MoradorDto;
import com.devrenan.acesso_api.core.ports.MoradorServicePort;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/moradores")
public class MoradorController {

    private final MoradorServicePort moradorServicePort;

    public MoradorController(MoradorServicePort moradorServicePort) {
        this.moradorServicePort = moradorServicePort;
    }

    public MoradorDto criaMorador(@RequestBody MoradorDto moradorDto) {
        return moradorConverter.toDTO(
            moradorServicePort.createMorador(moradorConverter.toDomain(moradorDto)));
    }

}
