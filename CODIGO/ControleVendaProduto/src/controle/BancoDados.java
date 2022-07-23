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
	
	// PESQUISAR SOMENTE 1 ITEM	
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
	
	// LISTAR BANCO DE DADOS
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
	
	// ADICIONAR AO BANCO DE DADOS
	
	public void adicionarCliente(Cliente cliente) {
		clientes.add(cliente);
	}
	
	public void adicionarVendedor(Vendedor vendedor) {
		vendedores.add(vendedor);
	}
	
	public void adicionarVenda(Venda venda) {
		vendas.add(venda);
	}
	
	public void adicionarProduto(Produto produto) {
		produtos.add(produto);
	}
	
	// EXCLUIR DO BANCO DE DADOS
	public void excluirCliente(Cliente cliente) {
		clientes.remove(cliente.getId());
	}
	
	public void excluirVendedor(Vendedor vendedor) {
		vendedores.remove(vendedor.getId());
	}
	
	public void excluirProduto(Produto produto) {
		produtos.remove(produto.getId());
	}
	
	// EDITAR NO BANCO DE DADOS
	public void editarCliente(Cliente cliente) {
		// TODO 
		clientes.add(cliente);
	}
	public void editarVendedor(Vendedor vendedor) {
		// TODO 
		vendedores.add(vendedor);
	}
	public void editarProduto(Produto produto) {
		// TODO 
		produtos.add(produto);
	}
}
