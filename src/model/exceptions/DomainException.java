package model.exceptions;

public class DomainException extends Exception {
	private static final long serialVersionUID = 1L;
	
	public DomainException(String msg) { //Permite instanciar a exce��o personalizada, passando uma mensagem pra ela. 
		super(msg);
	}

}
