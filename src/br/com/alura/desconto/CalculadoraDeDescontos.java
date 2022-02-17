package br.com.alura.desconto;

import java.math.BigDecimal;

import br.com.alura.Desconto;
import br.com.alura.orcamento.Orcamento;

public class CalculadoraDeDescontos {

	public BigDecimal calcular(Orcamento orcamento) {
		Desconto cadeiaDeDescontos = new DescontoParaOrcamentoComMaisDeCincoItens(
				new DescontoParaOrcamentoComValorMaiorDoQueQuinhentos( 
						new SemDescontos()));
		
		return cadeiaDeDescontos.calcular(orcamento);
	}

}
