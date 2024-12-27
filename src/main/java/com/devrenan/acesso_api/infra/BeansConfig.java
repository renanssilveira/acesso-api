package com.devrenan.acesso_api.infra;

import com.devrenan.acesso_api.core.ports.UsuarioServicePort;
import com.devrenan.acesso_api.core.service.UsuarioService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class BeansConfig {


    @Bean
    @Primary
    public UsuarioServicePort usuarioServiceImpl(){
        return new UsuarioService();
    }
}
