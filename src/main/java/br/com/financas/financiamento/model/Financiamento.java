package br.com.financas.financiamento.model;

import lombok.Data;

import javax.persistence.Entity;
import java.math.BigDecimal;

@Data
@Entity
public class Financiamento {

    private Long id;

    private String descricao;
    private BigDecimal valorTotal;
    private BigDecimal valorParcela;
    private int parcelas;
    private int taxaDeJuros;

}
