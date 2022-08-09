package application;

import controle.ControleVenda;
import controle.ControleCliente;
import controle.ControleProduto;
import controle.ControleVendedor;
import view.TelaPrincipal;

public class Main {

	public static void main(String[] args) {
		//CHAMANDO TELA INICIAL
		TelaPrincipal.main(args);
	}
	
	// INSTANCIAÇÃO DOS "BANCOS DE DADOS" 
	public static ControleCliente controleCliente = new ControleCliente();
	
	public static ControleVendedor controleVendedor = new ControleVendedor();

	public static ControleProduto controleProduto = new ControleProduto();
	
	public static ControleVenda controleVenda = new ControleVenda();
}
