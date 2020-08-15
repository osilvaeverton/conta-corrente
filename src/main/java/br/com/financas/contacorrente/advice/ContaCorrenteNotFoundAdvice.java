package br.com.financas.contacorrente.advice;

import br.com.financas.contacorrente.exception.ContaCorrenteNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class ContaCorrenteNotFoundAdvice {

    @ResponseBody
    @ExceptionHandler(ContaCorrenteNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public String contaCorrenteNotFoundHandler(ContaCorrenteNotFoundException ex){
        return ex.getMessage();
    }
}
