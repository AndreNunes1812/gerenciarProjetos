package br.com.projetos.portifolio.Service;

import br.com.projetos.portifolio.model.Pessoa;
import org.hibernate.query.Page;

import java.util.List;
import java.util.Optional;

public interface PessoaService {

     public void save(Pessoa pessoa);

     public List<Pessoa> findAll();

     Optional<Pessoa> findById(Long id);

     public void deletePessoa(Long pessoaId);
}
