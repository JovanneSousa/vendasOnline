package br.com.jsousa.exceptions;

public class DAOException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4408738768747727382L;

	public DAOException(String msg, Exception ex) {
		super(msg, ex);
    }
}
