package com.saito.school.service;

import com.saito.school.entity.EstudanteEntity;
import com.saito.school.repository.EstudanteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EstudanteService {

     @Autowired
    private EstudanteRepository estudanteRepository;

    public EstudanteEntity criarEstudante(EstudanteEntity estudanteEntity){
        return estudanteRepository.save(estudanteEntity);
    }

public List<EstudanteEntity> buscarEstudante(){
        return estudanteRepository.findAll();
}

public void deletarEstudante(Long id){
estudanteRepository.deleteById(id);
}

}
