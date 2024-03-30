package br.com.projetos.portifolio.model;


import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name="projeto")
public class Projeto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private String nome;

    private Date dataInicio;

    private String gerenteResponsavel;

    private Date previsaoTermino;

    private Date dataRealTermino;

    private double orcamentoTotal;

    private String descricao;

    private String status;


}
