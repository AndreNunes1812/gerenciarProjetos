package br.com.projetos.portifolio.Service.Impl;

import br.com.projetos.portifolio.Repository.ProjetoRepository;
import br.com.projetos.portifolio.Service.ProjetoService;
import br.com.projetos.portifolio.model.Projeto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProjetoServiceImpl implements ProjetoService {

    @Autowired
    ProjetoRepository projetoRepository;

    @Override
    public void save(Projeto projeto) {
        projetoRepository.save(projeto);
    }

    @Override
    public List<Projeto> findAll() {
        return projetoRepository.findAll();
    }

    @Override
    public Optional<Projeto> findById(Long id) {
        return projetoRepository.findById(id);
    }

    @Override
    public void deleteProjeto(Long projetoId) {
        projetoRepository.deleteById(projetoId);
    }
}
