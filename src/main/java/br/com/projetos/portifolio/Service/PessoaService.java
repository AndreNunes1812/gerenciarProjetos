package br.com.projetos.portifolio.Service;

import br.com.projetos.portifolio.model.Pessoa;
import org.springframework.web.bind.annotation.RequestBody;

public interface PessoaService {

     public void save(Pessoa pessoa);
}
