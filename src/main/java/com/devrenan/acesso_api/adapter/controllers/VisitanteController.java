package com.devrenan.acesso_api.adapter.controllers;

import com.devrenan.acesso_api.adapter.converters.VisitanteConverter;
import com.devrenan.acesso_api.adapter.dtos.VisitanteDto;
import com.devrenan.acesso_api.core.ports.VisitanteServicePort;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/visitante")
public class VisitanteController {

    private final VisitanteConverter visitanteConverter;
    private final VisitanteServicePort visitanteServicePort;

    public VisitanteController(VisitanteConverter visitanteConverter, VisitanteServicePort visitanteServicePort) {
        this.visitanteConverter = visitanteConverter;
        this.visitanteServicePort = visitanteServicePort;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public VisitanteDto create(@RequestBody VisitanteDto visitanteDto) {
        return visitanteConverter.toDTO(
            visitanteServicePort.createVisitante(visitanteConverter.toDomain(visitanteDto)));
    }


}
