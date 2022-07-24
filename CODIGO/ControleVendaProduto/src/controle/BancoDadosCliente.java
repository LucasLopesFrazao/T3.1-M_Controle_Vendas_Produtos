package controle;

import java.util.ArrayList;
import java.util.List;

import modelo.Cliente;

public class BancoDadosCliente {

	private List<Cliente> clientes = new ArrayList<Cliente>();
	
	public BancoDadosCliente() {
		clientes.add(new Cliente(1, "Lucas", "lucas@emaio.com", "043.547.991-11", "73751-170",
				"Planaltina Goi�s", "Quadra 17", "2", "Setor Norte", "GO"));
	}
	
	// PESQUISAR SOMENTE 1 ITEM	
	public Cliente pesquisarCliente(Integer id) {
		return clientes.get(id);
	}
	
	public Integer ultimoCodigoCadastrado() {		
		return clientes.get((clientes.size() - 1)).getId();
	}
	
	public void adicionarCliente(Cliente cliente) {
		clientes.add(cliente);
	}
	
	public List<Cliente> obterTodosClientes(){
		return clientes;
	}
	
	
}