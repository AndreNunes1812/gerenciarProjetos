package br.com.projetos.portifolio.Service;

import br.com.projetos.portifolio.model.Membro;
import org.springframework.web.bind.annotation.RequestBody;

public interface MembroService {

     public void save(Membro membro);
}
