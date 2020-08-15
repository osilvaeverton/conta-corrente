package br.com.financas.contacorrente.exception;

public class ContaCorrenteNotFoundException extends RuntimeException{

    public ContaCorrenteNotFoundException(Long id){
        super("Conta Corrente " + id + " não existe.");
    }
}
