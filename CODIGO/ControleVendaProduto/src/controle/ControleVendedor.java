package controle;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import modelo.Vendedor;

/**
 * A classe <b>ControleVendedor</b> define uma rela��o com a classe Vendedor (model) com a TelaVendedor (view). 
 * <p>
 * Essa classe � respons�vel por gerenciar a lista de vendedor junto com os m�todos necess�rios
 * </p>
 * @version 1.0
 */
public class ControleVendedor {
	
	private List<Vendedor> vendedores = new ArrayList<Vendedor>();
	
	/**
	 * O construtor default da classe
	 */
	public ControleVendedor() {
		vendedores.add(new Vendedor(1, "Vicente Paulo Tom�s Nunes", "marcelo78@hersa.com.br", "Celulares"));
		vendedores.add(new Vendedor(2, "Rafael Augusto Baptista", "rafael_augusto_baptista@callan.com.br", "M�veis"));
		vendedores.add(new Vendedor(3, "Carla Gabrielly Vera Ramos", "carla_gabi@yahoo.com.br", "Eletrodom�sticos"));
		vendedores.add(new Vendedor(4, "Giovana Mirella Priscila", "giovana_mirella@grupompe.com.br", "Jardinagem"));
		vendedores.add(new Vendedor(5, "T�nia Bruna Malu Carvalho", "tania_carvalho@casaarte.com.br", "Automotivo"));		
	}
	
	/**
	 * Esse m�todo retorna o ultimo id do cliente adicionado na lista
	 * @return Ultimo id do cliente da lista
	 */
	public Integer ultimoCodigoCadastrado() {
		return vendedores.get((vendedores.size() - 1)).getId();
	}
	
	/**
	 * Esse m�todo adiociona um vendedor na lista
	 * @param vendedor Vendedor a ser adicionado 
	 */
	public void adicionarVendedor(Vendedor vendedor) {
		vendedores.add(vendedor);
	}
	
	/**
	 * Esse m�todo obt�m a lista de vendedores
	 * @return Retorna uma Lista de Vendedor
	 */
	public List<Vendedor> obterTodosVendedores(){
		return vendedores;
	}

	/**
	 * Esse m�todo pesquisa um vendedor na lista
	 * @param nome Nome a ser procurado na lista 
	 * @return Retorna um Vendedor
	 */
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
	
	/**
	 * Esse m�todo checa se um determinado id existe na lista 
	 * @param id Id a ser checado
	 * @return Retorna um boolean informando se o id existe ou n�o na lista
	 */
	public boolean checarId(Integer id) {
		for(Vendedor v: vendedores) {
			if(v.getId() == id) {
				return true;
			}
		}
		return false;
	}
	
	/**
	 * Este m�todo recebe um vendedor e reescreve os dados de um j� existente
	 * @param vendedor Novo vendedor com os dados a serem reescritos
	 */
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
	
	/**
	 * Esse m�todo exclui um vendedor
	 * @param id Id do vendedor a ser excluido 
	 */
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
	
	/**
	 * Este m�todo v�lida um e-mail por meio do regex
	 * @param email E-mail a ser v�lido
	 * @return Retorna um boolean informando se o e-mail � v�lio ou n�o
	 */
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
