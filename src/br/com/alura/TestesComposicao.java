package br.com.alura;

import java.math.BigDecimal;

import br.com.alura.orcamento.ItemOrcamento;
import br.com.alura.orcamento.Orcamento;
import br.com.alura.orcamento.OrcamentoProxy;

public class TestesComposicao {

	public static void main(String[] args) {
		Orcamento antigo = new Orcamento();
		antigo.adicionarItem(new ItemOrcamento(new BigDecimal("200")));
		antigo.reprovar();
		
		Orcamento novo = new Orcamento();
		novo.adicionarItem(new ItemOrcamento(new BigDecimal("500")));
		novo.adicionarItem(antigo); // 
		
		OrcamentoProxy proxy = new OrcamentoProxy(novo);
		
		System.out.println(proxy.getValor()); // 700 
	}
}
