package br.com.projetos.portifolio.Controller;

import br.com.projetos.portifolio.Service.ProjetoService;
import br.com.projetos.portifolio.model.Pessoa;
import br.com.projetos.portifolio.model.Projeto;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/projetos")
public class ProjetoController {

    @Autowired
    ProjetoService projetoService;

    @PostMapping
    public void save(@RequestBody Projeto projeto) {

        projetoService.save(projeto);
    }

    @GetMapping
    public ResponseEntity<List<Projeto>> getAllProjetos() {
        List<Projeto> projeto = projetoService.findAll();
        return ResponseEntity.status(HttpStatus.OK).body(projeto);
    }

    @GetMapping("/{projetoId}")
    public ResponseEntity<Object> getOneProjeto(@PathVariable(value = "projetoId") Long projetoId) {
        Optional<Projeto> projetoOptional = projetoService.findById(projetoId);
        if(!projetoOptional.isPresent()){
            return  ResponseEntity.status(HttpStatus.NOT_FOUND).body("Projeto não encontrado.");
        } else{
            return  ResponseEntity.status(HttpStatus.OK).body(projetoOptional.get());
        }
    }

    @PutMapping("/{projetoId}")
    public ResponseEntity<Object> updateProjeto(@PathVariable(value="projetoId") Long projetoId,
                                               @RequestBody @Valid Projeto projeto){

        Optional<Projeto> projetoOptional = projetoService.findById(projetoId);
        if(!projetoOptional.isPresent()){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Projeto não encontrado.");
        }
        var projetoPut = projetoOptional.get();

        projetoPut.setId(projetoId);
        projetoPut.setNome(projeto.getNome());
        projetoPut.setDescricao(projeto.getDescricao());
        projetoPut.setDataFim(projeto.getDataFim());
        projetoPut.setDataInicio(projeto.getDataInicio());
        projetoPut.setOrcamento(projeto.getOrcamento());
        projetoPut.setRisco(projeto.getRisco());
        projetoPut.setStatus(projeto.getStatus());
        projetoPut.setDataPrevisaoFim(projeto.getDataPrevisaoFim());
        projetoPut.setIdGerente(projeto.getIdGerente());
        projetoService.save(projetoPut);
        return ResponseEntity.status(HttpStatus.OK).body(projetoPut);
    }


    @DeleteMapping("/{projetoId}")
    public ResponseEntity<Object> deleteProjeto(@PathVariable(value = "projetoId") Long projetoId) {
        Optional<Projeto> projetoOptional = projetoService.findById(projetoId);
        if(!projetoOptional.isPresent()){
            return  ResponseEntity.status(HttpStatus.NOT_FOUND).body("Projeto não encontrado.");
        } else{
            projetoService.deleteProjeto(projetoId);
            return  ResponseEntity.status(HttpStatus.ACCEPTED).body("Projeto excluido com sucesso!");
        }
    }


}
