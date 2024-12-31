package com.devrenan.acesso_api.infra;

import com.devrenan.acesso_api.core.ports.MoradorRepositoryPort;
import com.devrenan.acesso_api.core.ports.MoradorServicePort;
import com.devrenan.acesso_api.core.ports.UsuarioRepositoryPort;
import com.devrenan.acesso_api.core.ports.UsuarioServicePort;
import com.devrenan.acesso_api.core.service.MoradorService;
import com.devrenan.acesso_api.core.service.UsuarioService;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class BeansConfig {

    @Bean
    public ModelMapper modelMapper(){
        return new ModelMapper();
    }


    @Bean
    @Primary
    public UsuarioServicePort usuarioServiceImpl(UsuarioRepositoryPort usuarioRepositoryPort){
        return new UsuarioService(usuarioRepositoryPort);
    }

    @Bean
    public MoradorServicePort moradorServicePort(MoradorRepositoryPort moradorRepositoryPort){
        return new MoradorService(moradorRepositoryPort);
    }

}
