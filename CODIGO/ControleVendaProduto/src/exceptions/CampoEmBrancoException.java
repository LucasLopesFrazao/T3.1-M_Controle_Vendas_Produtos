package exceptions;

/**
 * A classe exception <b>CampoEmBrancoException</b> � respons�vel por gerar exceptions relacionadas a campos vazios
 * @version 1.0
 */
public class CampoEmBrancoException extends Exception{
	static final long serialVersionUID = 1L;
	
	/**
	 * Construtor padr�o
	 * @param msg Mensagem a ser mostrada quando o erro for gerado
	 */
	public CampoEmBrancoException(String msg) {
		super(msg);
	}

}