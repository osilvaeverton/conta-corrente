package br.com.financas.contacorrente.repository;

import br.com.financas.contacorrente.model.ContaCorrente;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ContaCorrenteRepository extends CrudRepository<ContaCorrente, Long> {

    List<ContaCorrente> findAll();
}
