package controle;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import application.Main;
import modelo.Pedido;
import modelo.Venda;

public class BancoDadosVendas {
	
	BancoDadosFuncionario controleVendedor = Main.bdf;
	BancoDadosCliente controleCliente = Main.bdc;
	BancoDadosProdutos controleProduto = Main.controleProdutos;
	
	List<Venda> vendas = new ArrayList<>();
	
	public BancoDadosVendas() {
		SimpleDateFormat out = new SimpleDateFormat("dd/MM/yyyy");
		List<Pedido> pedidosVenda1 = new ArrayList<>();
		pedidosVenda1.add(new Pedido(controleProduto.pesquisarProdutoId(1), 2, controleProduto.pesquisarProdutoId(1).getPreco()*2));
		try {
			vendas.add(new Venda(1, out.parse("01/01/2020"), 8886.00, controleVendedor.pesquisarPorNome("Rafael"), 
					controleCliente.pesquisarCliente("043.547.991-11"), pedidosVenda1));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void todasVendas() {
		for(Venda v: vendas) {
			System.out.println(v);
		}
	}
	
	public void adicionarVenda(Venda venda) {
		vendas.add(venda);	
	}
	
	public Integer codigoUltimoVendaCadastrada() {
		return vendas.get((vendas.size() - 1)).getId();
	}
	
	public Double totalVenda(List<Pedido> pedidos) {
		Double total = 0.0;
		for(Pedido p: pedidos) {
			total += p.getPrecoTotal();
		}
		return total;
	}
	
	public List<Venda> consultarVenda(Date dataInicial, Date dataFinal){
		List<Venda> vendasConsultadas = new ArrayList<>();
		for(Venda v: vendas) {
			if(v.getDataVenda().after(dataInicial) && v.getDataVenda().before(dataFinal)) {
				vendasConsultadas.add(v);
			}
		}
		return vendasConsultadas;
	}
	
}