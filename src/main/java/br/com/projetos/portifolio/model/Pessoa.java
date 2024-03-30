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
@Table(name="pessoa")
public class Pessoa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Column(length = 100)
    private String nome;

    @Temporal(TemporalType.DATE)
    @Column(name = "data_nascimento")
    private Date dataNascimento;

    @NotNull
    @Column(name="cpf", nullable = false, length = 14)
    private String cpf;

    @NotNull
    @Column(name="funcionario")
    private boolean funcionario;

    @NotNull
    @Column(name="gerente")
    private boolean gerente;

}
