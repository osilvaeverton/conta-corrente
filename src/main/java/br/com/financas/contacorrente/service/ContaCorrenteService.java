package br.com.financas.contacorrente.service;

import br.com.financas.contacorrente.exception.ContaCorrenteNotFoundException;
import br.com.financas.contacorrente.model.ContaCorrente;
import br.com.financas.contacorrente.repository.ContaCorrenteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ContaCorrenteService {

    @Autowired
    private ContaCorrenteRepository contaCorrenteRepository;

    public List<ContaCorrente> list(){
        return contaCorrenteRepository.findAll();
    }

    public ContaCorrente findById(Long id) {
        return contaCorrenteRepository.findById(id)
                .orElseThrow(() -> new ContaCorrenteNotFoundException(id));
    }

    public ContaCorrente newContaCorrente(ContaCorrente newContaCorrente){
        return contaCorrenteRepository.save(newContaCorrente);
    }

    public ContaCorrente replaceContaCorrente(ContaCorrente newContaCorrente, Long id){
        return contaCorrenteRepository.findById(id)
                .map(contaCorrente -> {
                    contaCorrente.setDescricao(newContaCorrente.getDescricao());
                    return contaCorrenteRepository.save(newContaCorrente);
                })
                .orElseGet(() -> {
                    newContaCorrente.setId(id);
                    return contaCorrenteRepository.save(newContaCorrente);
                });
    }

    public void deleteById(Long id){
        this.contaCorrenteRepository.deleteById(id);
    }

}
