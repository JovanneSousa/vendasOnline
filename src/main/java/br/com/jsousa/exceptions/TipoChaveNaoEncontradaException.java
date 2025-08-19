package br.com.jsousa.exceptions;

public class TipoChaveNaoEncontradaException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8536904322630620169L;

	public TipoChaveNaoEncontradaException(String msg) {
        this(msg, null);
    }

    public TipoChaveNaoEncontradaException(String msg, Throwable e) {
        super(msg, e);
    }
}
