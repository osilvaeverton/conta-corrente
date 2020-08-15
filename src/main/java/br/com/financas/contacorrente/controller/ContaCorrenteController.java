package br.com.financas.contacorrente.controller;

import br.com.financas.contacorrente.model.ContaCorrente;
import br.com.financas.contacorrente.service.ContaCorrenteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("conta-corrente")
public class ContaCorrenteController {

    @Autowired
    private ContaCorrenteService contaCorrenteService;

    @GetMapping
    public List<ContaCorrente> all(){
        return contaCorrenteService.list();
    }

    @GetMapping("{id}")
    public ContaCorrente one(@PathVariable Long id){
        return contaCorrenteService.findById(id);
    }

    @PostMapping("{id}")
    public void update(@RequestBody ContaCorrente contaCorrente){
        this.contaCorrenteService.newContaCorrente(contaCorrente);
    }

    @PutMapping("{id}")
    public void save(@RequestBody ContaCorrente contaCorrente, @PathVariable Long id) {
        contaCorrenteService.replaceContaCorrente(contaCorrente, id);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable Long id) {
        contaCorrenteService.deleteById(id);
    }

}
