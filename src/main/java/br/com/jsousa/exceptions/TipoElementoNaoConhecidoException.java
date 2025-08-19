package br.com.jsousa.exceptions;

public class TipoElementoNaoConhecidoException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6265753789871957255L;

	public TipoElementoNaoConhecidoException(String msg) {
        this(msg, null);
    }

    public TipoElementoNaoConhecidoException(String msg, Throwable e) {
        super(msg, e);
    }
}
