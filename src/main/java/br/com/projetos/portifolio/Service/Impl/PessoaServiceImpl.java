package br.com.projetos.portifolio.Service.Impl;

import br.com.projetos.portifolio.Repository.PessoaRepository;
import br.com.projetos.portifolio.Service.PessoaService;
import br.com.projetos.portifolio.model.Pessoa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PessoaServiceImpl implements PessoaService {

    @Autowired
    PessoaRepository pessoaRepository;
    @Override
    public void save(Pessoa pessoa) {
        pessoaRepository.save(pessoa);
    }

    @Override
    public List<Pessoa> findAll() {
        return pessoaRepository.findAll();
    }

    @Override
    public Optional<Pessoa> findById(Long id) {
        return pessoaRepository.findById(id);
    }

    @Override
    public void deletePessoa(Long pessoaId) {
     pessoaRepository.deleteById(pessoaId);
    }

}
