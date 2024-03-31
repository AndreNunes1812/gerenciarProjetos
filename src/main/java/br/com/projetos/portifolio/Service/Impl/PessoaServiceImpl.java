package br.com.projetos.portifolio.Service.Impl;

import br.com.projetos.portifolio.Repository.PessoaRepository;
import br.com.projetos.portifolio.Service.PessoaService;
import br.com.projetos.portifolio.model.Pessoa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PessoaServiceImpl implements PessoaService {

    @Autowired
    PessoaRepository pessoaRepository;
    @Override
    public void save(Pessoa pessoa) {
        pessoaRepository.save(pessoa);
    }
}
