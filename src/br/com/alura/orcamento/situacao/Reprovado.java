package br.com.alura.orcamento.situacao;

import br.com.alura.orcamento.Orcamento;

public class Reprovado extends SituacaoOrcamento {

	public void finalizar(Orcamento orcamento) {
		orcamento.setSituacao(new Finalizado());
	}
}
