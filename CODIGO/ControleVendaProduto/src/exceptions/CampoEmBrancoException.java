package exceptions;

public class CampoEmBrancoException extends Exception{
	static final long serialVersionUID = 1L;
	
	public CampoEmBrancoException(String msg) {
		super(msg);
	}

}