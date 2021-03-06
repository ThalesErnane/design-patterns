package br.com.alura.desconto;

import java.math.BigDecimal;

import br.com.alura.Desconto;
import br.com.alura.orcamento.Orcamento;

public class DescontoParaOrcamentoComValorMaiorDoQueQuinhentos extends Desconto {

	public DescontoParaOrcamentoComValorMaiorDoQueQuinhentos(Desconto proximo) {
		super(proximo);
	}

	public BigDecimal efetuarCalculo(Orcamento orcamento) {
		return orcamento.getValor().multiply(new BigDecimal("0.05"));
	}

	@Override
	public boolean deveAplicar(Orcamento orcamento) {
		return orcamento.getValor().compareTo(new BigDecimal("500")) > 0;
	}
	
}
