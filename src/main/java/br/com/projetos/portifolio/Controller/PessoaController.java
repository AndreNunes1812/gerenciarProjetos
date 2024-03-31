package br.com.projetos.portifolio.Controller;

import br.com.projetos.portifolio.Service.PessoaService;
import br.com.projetos.portifolio.model.Pessoa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/pessoas")
public class PessoaController {

    @Autowired
    PessoaService pessoaService;

    @PostMapping
    public void cadastrarPessoa(@RequestBody Pessoa pessoa) {

        pessoaService.save(pessoa);
    }


}
