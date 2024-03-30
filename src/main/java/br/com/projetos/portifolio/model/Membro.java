package br.com.projetos.portifolio.model;


import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name="membros")
public class Membro implements Serializable {

    private static final long serialVersionUID = 1L;

    @NotNull
    private Long idProjeto;

    @NotNull
    private Long idPessoa;

}
