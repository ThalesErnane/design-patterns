package br.com.alura.pedido;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import br.com.alura.orcamento.ItemOrcamento;
import br.com.alura.orcamento.Orcamento;
import br.com.alura.pedido.acao.AcaoAposGerarPedido;

public class GeraPedidoHandler {

	private List<AcaoAposGerarPedido> acoesAposGerarPedido;
	
	public GeraPedidoHandler(List<AcaoAposGerarPedido> acoesAposGerarPedidos) {
		acoesAposGerarPedido = acoesAposGerarPedidos;
	}

	
	public void executa(GeraPedido dados) {
		Orcamento orcamento = new Orcamento();
		orcamento.adicionarItem(new ItemOrcamento(new BigDecimal("5000"))); // (dados.getValorOrcamento(), dados.getQuantidadeItens());
		Pedido pedido = new Pedido(dados.getCliente(), LocalDateTime.now(), orcamento);
		acoesAposGerarPedido.forEach(acao -> acao.executarAcao(pedido));

	}

}
