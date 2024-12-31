package com.devrenan.acesso_api.adapter.repositories;

import com.devrenan.acesso_api.adapter.entities.PessoaEntity;
import com.devrenan.acesso_api.core.domain.Pessoa;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class PessoaRespositoryAdapter {

    private final ModelMapper modelMapper;
    private final PessoaRepository pessoaRepository;

    public PessoaRespositoryAdapter(ModelMapper modelMapper, PessoaRepository pessoaRepository) {
        this.modelMapper = modelMapper;
        this.pessoaRepository = pessoaRepository;
    }

    public PessoaEntity createPessoa(Pessoa pessoa) {
        return pessoaRepository.save(modelMapper.map(pessoa, PessoaEntity.class));
    }
}
