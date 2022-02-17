package br.com.alura.pedido.acao;

import br.com.alura.pedido.Pedido;

public class CriarPedidoNoBanco implements AcaoAposGerarPedido{

	public void executarAcao(Pedido pedido) {
		System.out.println("Salvando pedido no banco de dados: ");
	}
	
}
