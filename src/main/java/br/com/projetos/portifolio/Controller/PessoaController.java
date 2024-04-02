package br.com.projetos.portifolio.Controller;

import br.com.projetos.portifolio.Service.PessoaService;
import br.com.projetos.portifolio.model.Pessoa;
import jakarta.validation.Valid;
import org.hibernate.query.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.awt.print.Pageable;
import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/pessoas")
public class PessoaController {

    @Autowired
    PessoaService pessoaService;

    @GetMapping
    public ResponseEntity<List<Pessoa>> getAllPessoas() {
        List<Pessoa> pessoa = pessoaService.findAll();
        return ResponseEntity.status(HttpStatus.OK).body(pessoa);
    }

    @GetMapping("/{pessoaId}")
    public ResponseEntity<Object> getOnePessoa(@PathVariable(value = "pessoaId") Long pessoaId) {
        Optional<Pessoa> pessoaOptional = pessoaService.findById(pessoaId);
        if(!pessoaOptional.isPresent()){
            return  ResponseEntity.status(HttpStatus.NOT_FOUND).body("Pessoa não encontrada.");
        } else{
            return  ResponseEntity.status(HttpStatus.OK).body(pessoaOptional.get());
        }
    }

    @PostMapping
    public void save(@RequestBody Pessoa pessoa) {
        System.out.println(pessoa);
        pessoaService.save(pessoa);
    }

    @PutMapping("/{pessoaId}")
    public ResponseEntity<Object> updatePessoa(@PathVariable(value="pessoaId") Long pessoaId,
                                               @RequestBody @Valid Pessoa pessoa){

        Optional<Pessoa> pessoaOptional = pessoaService.findById(pessoaId);
        if(!pessoaOptional.isPresent()){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Pessoa não encontrada.");
        }
        var pessoaPut = pessoaOptional.get();

        pessoaPut.setId(pessoaId);
        pessoaPut.setNome(pessoa.getNome());
        pessoaPut.setCpf(pessoa.getCpf());
        pessoaPut.setFuncionario(pessoa.isFuncionario());
        pessoaPut.setGerente(pessoa.isGerente());
        pessoaPut.setDataNascimento(pessoa.getDataNascimento());
        pessoaService.save(pessoaPut);
        return ResponseEntity.status(HttpStatus.OK).body(pessoaPut);
    }


    @DeleteMapping("/{pessoaId}")
    public ResponseEntity<Object> deletePessoa(@PathVariable(value = "pessoaId") Long pessoaId) {
        Optional<Pessoa> pessoaOptional = pessoaService.findById(pessoaId);
        if(!pessoaOptional.isPresent()){
            return  ResponseEntity.status(HttpStatus.NOT_FOUND).body("Pessoa não encontrada.");
        } else{
            pessoaService.deletePessoa(pessoaId);
            return  ResponseEntity.status(HttpStatus.ACCEPTED).body("Pessoa excluida com sucesso!");
        }
    }

}

