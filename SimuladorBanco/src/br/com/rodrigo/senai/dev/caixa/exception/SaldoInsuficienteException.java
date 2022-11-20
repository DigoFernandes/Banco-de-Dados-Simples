package br.com.rodrigo.senai.dev.caixa.exception;

//extend faz com que a classe faça parte da herança 
public class SaldoInsuficienteException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public SaldoInsuficienteException(String message) {
		
		super(message);
		
		}
}
