package br.com.projetos.portifolio.Controller.Impl;

import br.com.projetos.portifolio.Repository.PessoaRepository;
import br.com.projetos.portifolio.Service.PessoaService;
import br.com.projetos.portifolio.model.Pessoa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PessoaControllerImpl implements PessoaService {

    @Autowired
    PessoaRepository pessoaRepository;
    @Override
    public void cadastrar(Pessoa pessoa) {
        pessoaRepository.save(pessoa);
    }
}
