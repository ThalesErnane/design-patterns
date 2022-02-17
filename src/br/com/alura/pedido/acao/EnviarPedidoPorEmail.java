package br.com.alura.pedido.acao;

import br.com.alura.pedido.Pedido;

public class EnviarPedidoPorEmail implements AcaoAposGerarPedido{

	public void executarAcao(Pedido pedido) {
		System.out.println("Enviando email com dados: ");
	}
	
}
