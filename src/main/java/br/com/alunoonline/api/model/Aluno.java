package br.com.alunoonline.api.model;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;


@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Aluno implements Serializable {

    private Long id;

    private String name;

}
