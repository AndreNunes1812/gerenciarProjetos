package br.com.projetos.portifolio.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name="pessoa")
public class Pessoa implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Column(length = 100 , unique = true)
    private String nome;


    @JsonFormat(shape = JsonFormat.Shape.STRING,pattern = "dd/mm/yyyy")
    @Column(name = "datanascimento")
    private String dataNascimento;

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
