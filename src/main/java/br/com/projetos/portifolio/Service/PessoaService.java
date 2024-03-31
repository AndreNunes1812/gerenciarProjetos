package br.com.projetos.portifolio.Service;

import br.com.projetos.portifolio.model.Pessoa;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

public interface PessoaService{

     public void cadastrar(@RequestBody Pessoa pessoa);
}
