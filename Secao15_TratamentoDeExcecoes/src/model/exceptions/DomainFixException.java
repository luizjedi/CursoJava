package model.exceptions;

public class DomainFixException extends RuntimeException {
	
	private static final long serialVersionUID = 1L;
	
	public DomainFixException(String msg) {
		super(msg);
	}

}
