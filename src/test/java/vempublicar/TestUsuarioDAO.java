package vempublicar;

import vempublicar.entidade.Usuario;
import vempublicar.persistencia.UsuarioDAO;

public class TestUsuarioDAO {

	public static void main(String[] args) {	
		testeExcluir();
	}
	public static void testeExcluir(){
		// criando usuario
				Usuario usu = new Usuario();
				usu.setId(2);
				
				// cadastrando usuario no banco
				UsuarioDAO usuDAO = new UsuarioDAO();
				usuDAO.excluir(usu);
				
				System.out.println("Excluido com suceso!!");
	}
	public static void testeAlterar(){
		// criando usuario
				Usuario usu = new Usuario();
				usu.setId(2);
				usu.setNome("Jorge Lucas De lima Pian");
				usu.setLogin("sdifsdk");
				usu.setSenha("123sd4");
				// cadastrando usuario no banco
				UsuarioDAO usuDAO = new UsuarioDAO();
				usuDAO.alterar(usu);
				
				System.out.println("Alterado com suceso!!");
	}
	
	public static void testeCadastrar(){
		// criando usuario
				Usuario usu = new Usuario();
				usu.setNome("Jorge Lucas");
				usu.setLogin("jlp");
				usu.setSenha("1234");
				// cadastrando usuario no banco
				UsuarioDAO usuDAO = new UsuarioDAO();
				usuDAO.cadastrar(usu);
				
				System.out.println("Cadastrado com suceso!!");
	}

}
