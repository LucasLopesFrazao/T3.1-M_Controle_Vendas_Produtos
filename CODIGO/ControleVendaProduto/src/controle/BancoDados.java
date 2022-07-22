package controle;

import java.util.ArrayList;
import java.util.List;

import modelo.Cliente;
import modelo.Produto;
import modelo.Venda;
import modelo.Vendedor;

public class BancoDados {

	private List<Cliente> clientes = new ArrayList<Cliente>();
	private List<Vendedor> vendedores = new ArrayList<Vendedor>();
	private List<Venda> vendas = new ArrayList<Venda>();
	private List<Produto> produtos = new ArrayList<Produto>();
	
	public Cliente pesquisarCliente(Integer id) {
		return new Cliente();
	}
	
	public Vendedor pesquisarVendedor(Integer id) {
		return new Vendedor();
	}
	
	public Venda pesquisarVenda(Integer id) {
		return new Venda();
	}
	
	public Produto pesquisarProduto(Integer id) {
		return new Produto();
	}
	
	public List<Cliente> listarClientes(){
		return clientes;
	}
	
	public List<Vendedor> listarVendedores(){
		return vendedores;
	}
	
	public List<Venda> listarVendas(){
		return vendas;
	}
	
	public List<Produto> listarProdutos(){
		return produtos;
	}
	
	public void adicionarProduto(Produto produto) {
		produtos.add(produto);
	}
	
	public void realizarVenda(Venda venda) {
		vendas.add(venda);
	}
}
