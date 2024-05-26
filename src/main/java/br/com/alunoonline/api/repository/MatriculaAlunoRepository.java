package br.com.alunoonline.api.repository;

import br.com.alunoonline.api.model.Matricula_Aluno;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MatriculaAlunoRepository extends JpaRepository<Matricula_Aluno, Long> {
}
