package br.com.alunoonline.api.controller;


import br.com.alunoonline.api.model.Matricula_Aluno;
import br.com.alunoonline.api.service.Matricula_AlunoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/matricula_aluno")
public class Matricula_alunoController {

    @Autowired
    Matricula_AlunoService matricula_alunoService;

    public void create(@RequestBody Matricula_Aluno matricula_aluno){
         matricula_alunoService.create(matricula_aluno);
    }
}
