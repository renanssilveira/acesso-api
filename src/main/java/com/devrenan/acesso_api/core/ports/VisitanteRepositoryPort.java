package com.devrenan.acesso_api.core.ports;

import com.devrenan.acesso_api.core.domain.Visitante;

public interface VisitanteRepositoryPort {

    public Visitante create(Visitante visitante);
    public Visitante obtianByRg(String rg);
}
