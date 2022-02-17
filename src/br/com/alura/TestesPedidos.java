package br.com.alura;

import java.math.BigDecimal;
import java.util.Arrays;

import br.com.alura.pedido.GeraPedido;
import br.com.alura.pedido.GeraPedidoHandler;
import br.com.alura.pedido.acao.CriarPedidoNoBanco;
import br.com.alura.pedido.acao.EnviarPedidoPorEmail;

public class TestesPedidos {

	public static void main(String[] args) {

		String cliente = "Thales Ernane";
		BigDecimal valorOrcamento = new BigDecimal("300");
		int quantidadeItens = Integer.parseInt("2");
		
		GeraPedido gerador = new GeraPedido(cliente, valorOrcamento, quantidadeItens);
		GeraPedidoHandler handler = new GeraPedidoHandler(Arrays.asList(
				new EnviarPedidoPorEmail(),
				new CriarPedidoNoBanco()));
		handler.executa(gerador);
	
	}

}
