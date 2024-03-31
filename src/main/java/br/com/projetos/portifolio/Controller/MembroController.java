package br.com.projetos.portifolio.Controller;


import br.com.projetos.portifolio.Service.MembroService;
import br.com.projetos.portifolio.model.Membro;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/membros")
public class MembroController {

    @Autowired
    MembroService membroService;

    @PostMapping
    public void save(@RequestBody @Valid Membro membro) {

        membroService.save(membro);
    }



}
