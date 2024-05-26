package br.com.alunoonline.api.service;

import br.com.alunoonline.api.model.Matricula_Aluno;
import br.com.alunoonline.api.repository.MatriculaAlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Matricula_AlunoService {

    @Autowired
    MatriculaAlunoRepository matricula_alunoRepository;

    public void create(Matricula_Aluno matricula_aluno){
        matricula_alunoRepository.save(matricula_aluno);
    }
}
