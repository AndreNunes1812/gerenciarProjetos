package br.com.projetos.portifolio.Service;

import br.com.projetos.portifolio.model.Projeto;

import java.util.List;
import java.util.Optional;

public interface ProjetoService {

     public void save(Projeto projeto);

     public List<Projeto> findAll();

     Optional<Projeto> findById(Long id);

     public void deleteProjeto(Long projetoId);
}
