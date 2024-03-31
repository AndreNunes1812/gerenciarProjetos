package br.com.projetos.portifolio.Service.Impl;


import br.com.projetos.portifolio.Repository.MembroRepository;
import br.com.projetos.portifolio.Service.MembroService;
import br.com.projetos.portifolio.model.Membro;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MembroServiceImpl implements MembroService {

    @Autowired
    MembroRepository membroRepository;

    @Override
    public void save(Membro membro){
        membroRepository. save(membro);
    }
}
