package com.devrenan.acesso_api.core.ports;

import com.devrenan.acesso_api.core.domain.Morador;
import com.devrenan.acesso_api.core.domain.Usuario;
import org.springframework.stereotype.Service;

@Service
public interface MoradorServicePort {
    Morador createMorador(Morador morador);
}
