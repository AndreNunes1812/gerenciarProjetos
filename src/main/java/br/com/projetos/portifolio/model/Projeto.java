package br.com.projetos.portifolio.model;


import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name="projeto")
public class Projeto implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Column(length = 200)
    private String nome;

    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private Date dataInicio;

    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private Date dataPrevisaoFim;

    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private Date dataFim;

    @NotNull
    @Column(length = 5000)
    private String descricao;

    @Column(length = 45)
    private String status;

    @NotNull
    private double orcamento;

    @NotNull
    @Column(length = 45)
    private String risco;

    @NotNull
    private Long idGerente;

}
