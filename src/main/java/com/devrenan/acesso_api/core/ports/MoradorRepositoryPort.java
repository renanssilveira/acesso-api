package com.devrenan.acesso_api.core.ports;

import com.devrenan.acesso_api.core.domain.Morador;

public interface MoradorRepositoryPort {

    public Morador create(Morador morador);
    public Morador obtianByCpf(String cpf);
}
