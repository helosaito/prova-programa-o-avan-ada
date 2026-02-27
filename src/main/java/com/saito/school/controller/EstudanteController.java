package com.saito.school.controller;


import com.saito.school.entity.EstudanteEntity;
import com.saito.school.service.EstudanteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping (path = "/estudantes")
public class EstudanteController {

    @Autowired
    private EstudanteService estudanteService;

    @PatchMapping
    public EstudanteEntity criarEstudante(@RequestBody EstudanteEntity estudanteEntity){
        return estudanteService.criarEstudante(estudanteEntity);
    }

    @GetMapping
    public List<EstudanteEntity> buscarEstudante(){
        return estudanteService.buscarEstudante();
}

    @DeleteMapping ("/{id}")
    public void deletarEstudante( @PathVariable Long id){
        estudanteService.deletarEstudante(id);
}

}
