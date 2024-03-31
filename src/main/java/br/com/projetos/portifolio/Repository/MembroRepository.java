package br.com.projetos.portifolio.Repository;

import br.com.projetos.portifolio.model.Membro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MembroRepository  extends JpaRepository<Membro, Long> {}
