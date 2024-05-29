package br.com.alunoonline.api.service;

import br.com.alunoonline.api.enums.MatriculaAlunoStatusEnum;
import br.com.alunoonline.api.model.MatriculaAluno;
import br.com.alunoonline.api.repository.MatriculaAlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MatriculaAlunoService {

    @Autowired
    MatriculaAlunoRepository matriculaalunoRepository;

    public void create(MatriculaAluno matriculaaluno){
        matriculaaluno.setStatus(MatriculaAlunoStatusEnum.MATRICULADO);
        matriculaalunoRepository.save(matriculaaluno);
    }
}
