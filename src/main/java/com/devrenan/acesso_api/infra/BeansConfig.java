package com.devrenan.acesso_api.infra;

import com.devrenan.acesso_api.core.ports.*;
import com.devrenan.acesso_api.core.service.MoradorService;
import com.devrenan.acesso_api.core.service.UsuarioService;
import com.devrenan.acesso_api.core.service.VisitanteService;
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

    @Bean
    public VisitanteServicePort visitanteServicePort(VisitanteRepositoryPort visitanteRepositoryPort){
    return new VisitanteService(visitanteRepositoryPort);
    }

}
