package com.saito.school.repository;

import com.saito.school.entity.EstudanteEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EstudanteRepository extends JpaRepository<EstudanteEntity, Long> {
}
