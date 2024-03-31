package br.com.projetos.portifolio.Repository;

import br.com.projetos.portifolio.model.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PessoaRepository extends JpaRepository<Pessoa, Long> {

}
