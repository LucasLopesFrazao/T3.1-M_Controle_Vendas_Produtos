package controle;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import modelo.Vendedor;

public class ControleVendedor {
	
	//ATRIBUTOS
	private List<Vendedor> vendedores = new ArrayList<Vendedor>();
	
	//CONSTRUTOR COM SEMEAÇÃO DO "BANCO DE DADOS".
	public ControleVendedor() {
		vendedores.add(new Vendedor(1, "Vicente Paulo Tomás Nunes", "marcelo78@hersa.com.br", "Celulares"));
		vendedores.add(new Vendedor(2, "Rafael Augusto Baptista", "rafael_augusto_baptista@callan.com.br", "Móveis"));
		vendedores.add(new Vendedor(3, "Carla Gabrielly Vera Ramos", "carla_gabi@yahoo.com.br", "Eletrodomésticos"));
		vendedores.add(new Vendedor(4, "Giovana Mirella Priscila", "giovana_mirella@grupompe.com.br", "Limpeza"));
		vendedores.add(new Vendedor(5, "Tânia Bruna Malu Carvalho", "tania_carvalho@casaarte.com.br", "Alimentício"));
	}
	
	//METODOS
	public Integer ultimoCodigoCadastrado() {
		return vendedores.get((vendedores.size() - 1)).getId();
	}
	
	public void adicionarVendedor(Vendedor vendedor) {
		vendedores.add(vendedor);
	}
	
	public List<Vendedor> obterTodosVendedores(){
		return vendedores;
	}
	
	public Vendedor pesquisarPorNome(String nome) {
		if(nome.equals("")) {
			return new Vendedor();			
		}
		for(Vendedor v: vendedores) {
			if(v.getNome().toUpperCase().contains(nome.toUpperCase())) {
				return v;
			}
		}
		return new Vendedor();
	}
	
	public boolean checarId(Integer id) {
		for(Vendedor v: vendedores) {
			if(v.getId() == id) {
				return true;
			}
		}
		return false;
	}
	
	public void editarVendedor(Vendedor vendedor) {
		for(Vendedor v: vendedores) {
			if(v.getId() == vendedor.getId()) {
				v.setId(vendedor.getId());
				v.setNome(vendedor.getNome());
				v.setEmail(vendedor.getEmail());
				v.setDepartamento(vendedor.getDepartamento());
			}
		}
	}
	
	public void apagarVendedor(Integer id) {
		int loop = 0;
		for(Vendedor v: vendedores) {
			if(v.getId() == id) {
				vendedores.remove(loop);
				break;
			}
			loop += 1;
		}
	}
	
	public boolean validarEmail(String email) {
	    boolean isEmailIdValid = false;
	    if (email != null && email.length() > 0) {
	        String expression = "^[\\w\\.-]+@([\\w\\-]+\\.)+[A-Z]{2,4}$";
	        Pattern pattern = Pattern.compile(expression, Pattern.CASE_INSENSITIVE);
	        Matcher matcher = pattern.matcher(email);
	        if (matcher.matches()) {
	            isEmailIdValid = true;
	        }
	    }
	    return isEmailIdValid;
	}
}
