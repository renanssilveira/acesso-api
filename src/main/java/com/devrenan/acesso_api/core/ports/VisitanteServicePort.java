package com.devrenan.acesso_api.core.ports;

import com.devrenan.acesso_api.core.domain.Visitante;
import org.springframework.stereotype.Service;

@Service
public interface VisitanteServicePort {
    Visitante createVisitante(Visitante visitante);
}
