package br.com.alunoonline.api.dtos;


import lombok.Data;

import java.util.List;

@Data
public class HistoricoAlunoResponse {

    private String nameStundent;
    private String emailStundent;
    private List<DisciplinasAlunoResponse> stundentSubjectsReponseList;
}
