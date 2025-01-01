package com.devrenan.acesso_api.adapter.repositories;

import com.devrenan.acesso_api.adapter.entities.VisitanteEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VisitanteRepository extends JpaRepository<VisitanteEntity, Long> {
    VisitanteEntity findByRg(String rg);
}
