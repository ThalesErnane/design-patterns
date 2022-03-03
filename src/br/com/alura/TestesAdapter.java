package br.com.alura;

import br.com.alura.http.JavaHttpClient;
import br.com.alura.orcamento.Orcamento;
import br.com.alura.orcamento.RegistroDeOrcamento;

public class TestesAdapter {

	public static void main(String[] args) {

		Orcamento orcamento = new Orcamento();
		orcamento.aprovar();
		orcamento.finalizar();
		
		RegistroDeOrcamento registro = new RegistroDeOrcamento(new JavaHttpClient());
		registro.registrar(orcamento);
		

	}

}
