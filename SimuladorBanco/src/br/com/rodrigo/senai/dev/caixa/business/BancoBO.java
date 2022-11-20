package br.com.rodrigo.senai.dev.caixa.business;

import java.util.List;
import br.com.rodrigo.senai.dev.caixa.dao.BancoDAO;
import br.com.rodrigo.senai.dev.caixa.domain.Usuario;
import br.com.rodrigo.senai.dev.caixa.exception.SaldoInsuficienteException;
import br.com.rodrigo.senai.dev.caixa.exception.ValorInvalidoException;

public class BancoBO {
	
	public static void salvarUsuario(Usuario usuario) {
		
		if(usuarioExiste(usuario)==false) {
		BancoDAO.salvarUsuario(usuario);
		System.out.println("Usuario adicionado com sucesso!");
	}else {
		System.out.println("O usuario já existe!");
	}
	}
	
	private static boolean usuarioExiste(Usuario usuario) {
		List <Usuario> usuarios = BancoDAO.listarUsuarios();
		
			if (usuarios.contains(usuario)) {
				return true;
			}
		
		return false;

	}
	
	public static List<Usuario> Listar() {

		return BancoDAO.listarUsuarios();

	}

	public static void removerUsuario(Usuario usuario) {
		BancoDAO.removerUsuario(usuario);
	}

	private static void verificarSaldo(int saldo, int verificacao) throws SaldoInsuficienteException {

		if ((saldo < verificacao || saldo <= 0))
			throw new SaldoInsuficienteException("Saldo Insuficiente");
		{
		}

	}

	public static void depositar(Usuario usuario, int valor) throws ValorInvalidoException {

		verificarDeposito(valor);

		usuario.setSaldo(usuario.getSaldo() + valor);
	}

	private static void verificarDeposito(int valor) throws ValorInvalidoException {

		// "!" nega o valor

		if (!(valor > 0))
			throw new ValorInvalidoException("Valor Invalido!");
		{

		}

	}
		
		
	public static Usuario logar(String nome, String senha) {
		List<Usuario> usuarios = BancoDAO.listarUsuarios();
		for(Usuario usuario : usuarios) {
			if(usuario.getNome().equals(nome)&&usuario != null && usuario.getSenha().equals(senha)) {
				return usuario;
			}
		}
		return null;
	}
	
}