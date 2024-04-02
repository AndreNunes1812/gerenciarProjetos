package br.com.projetos.portifolio.Repository;

import br.com.projetos.portifolio.model.Projeto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjetoRepository extends JpaRepository<Projeto, Long> {}
