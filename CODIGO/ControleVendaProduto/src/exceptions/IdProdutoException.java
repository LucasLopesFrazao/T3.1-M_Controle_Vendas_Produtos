package exceptions;

/**
 * A classe exception <b>IdProdutoException</b> � respons�vel por gerar exceptions relacionadas a ids 
 * @version 1.0
 */
public class IdProdutoException extends Exception{
	private static final long serialVersionUID = 1L;

	/**
	 * Construtor padr�o
	 * @param msg Mensagem a ser mostrada quando o erro for gerado
	 */
	public IdProdutoException(String msg) {
		super(msg);
	}
}
