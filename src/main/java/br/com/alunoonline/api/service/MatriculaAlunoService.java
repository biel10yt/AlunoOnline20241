package br.com.alunoonline.api.service;

import br.com.alunoonline.api.dtos.AtualizarNotasRequest;
import br.com.alunoonline.api.enums.MatriculaAlunoStatusEnum;
import br.com.alunoonline.api.model.MatriculaAluno;
import br.com.alunoonline.api.repository.MatriculaAlunoRepository;
import org.antlr.v4.runtime.misc.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
public class MatriculaAlunoService {

    public static final double GRADE_AVG_TO_APPROVE = 7.0;

    @Autowired
    MatriculaAlunoRepository matriculaalunoRepository;

    public void create(MatriculaAluno matriculaaluno) {
        matriculaaluno.setStatus(MatriculaAlunoStatusEnum.MATRICULADO);
        matriculaalunoRepository.save(matriculaaluno);
    }

    public void updateGrades(Long matriculaAlunoId, AtualizarNotasRequest atualizarNotasRequest) {
        MatriculaAluno matriculaAluno = matriculaalunoRepository.findById(matriculaAlunoId)
                .orElseThrow(() ->
                        new ResponseStatusException(HttpStatus.NOT_FOUND, "Matricula não encontrou"));
    }


    public void updateStudentGrades(MatriculaAluno matriculaAluno, AtualizarNotasRequest atualizarNotasRequest) {
        if (atualizarNotasRequest.getNota1() != null) {
            matriculaAluno.setNota1(atualizarNotasRequest.getNota1());
        }

        if (atualizarNotasRequest.getNota2() != null) {
            matriculaAluno.setNota2(atualizarNotasRequest.getNota2());
        }
    }

    public void updateStudentStatus(MatriculaAluno matriculaAluno) {
        Double nota1 = matriculaAluno.getNota1();
        Double nota2 = matriculaAluno.getNota2();

        if (nota1 != null  && nota2 != null){
            double average = (nota1 + nota2) /2;
            matriculaAluno.setStatus(average >= GRADE_AVG_TO_APPROVE ? MatriculaAlunoStatusEnum.APROVADO : MatriculaAlunoStatusEnum.REPROVADO);

        }
    }

}
