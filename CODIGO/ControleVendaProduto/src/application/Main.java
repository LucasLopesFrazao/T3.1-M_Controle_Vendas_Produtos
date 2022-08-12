package application;

import controle.ControleVenda;
import controle.ControleCliente;
import controle.ControleProduto;
import controle.ControleVendedor;
import view.TelaPrincipal;

/**
 * Classe Main do programa, respons�vel por iniciar a tela principal e tamb�m iniciar uma instancia��o de cada controle
 * @version 1.0
 */
public class Main {

	public static void main(String[] args) {
		TelaPrincipal.main(args); // INICIANDO TELA PRINCIPAL
	}
	
	// INSTANCIA��ES DOS BANCOS DE DADOS
	public static ControleCliente controleCliente = new ControleCliente();
	public static ControleVendedor controleVendedor = new ControleVendedor();
	public static ControleProduto controleProduto = new ControleProduto();
	public static ControleVenda controleVenda = new ControleVenda();
}
