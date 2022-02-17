package br.com.alura.desconto;

import java.math.BigDecimal;

import br.com.alura.Desconto;
import br.com.alura.orcamento.Orcamento;

public class SemDescontos extends Desconto {

	public SemDescontos() {
		super(null);
	}

	public BigDecimal efetuarCalculo(Orcamento orcamento) {
		return BigDecimal.ZERO;
	}

	@Override
	public boolean deveAplicar(Orcamento orcamento) {
		return true;
	}
	
}
