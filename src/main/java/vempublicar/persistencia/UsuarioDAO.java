package vempublicar.persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import vempublicar.entidade.Usuario;
import vempublicar.persistencia.jdbc.ConnectionFactory;

public class UsuarioDAO {
	private Connection con = ConnectionFactory.getConnection();
	
	// Cria Registro)
	public void cadastrar(Usuario usu) {
		String sql = "insert into usuario(nome, login, senha) values (?,?,?)";	
		try{
		// criando um Statement (preparador)
			PreparedStatement preparador = con.prepareStatement(sql);
			preparador.setString(1, usu.getNome()); // substitui ? pelo dado do usuario
			preparador.setString(2, usu.getLogin());
			preparador.setString(3, usu.getSenha());
			// executa banco de dados
			preparador.execute();
			preparador.close();		
		} catch (SQLException e){
		e.printStackTrace();
		}
	}
	// Altera Registro
	public void alterar(Usuario usu) {		
		String sql = "update usuario set nome=?, login=?, senha=? where id=?";		
		try(PreparedStatement preparador = con.prepareStatement(sql)){ // uma forma diferente de close
			preparador.setString(1, usu.getNome()); // substitui ? pelo dado do usuario
			preparador.setString(2, usu.getLogin());
			preparador.setString(3, usu.getSenha());
			preparador.setInt(4, usu.getId());
			// executa banco de dados
			preparador.execute();			
		} catch (SQLException e){
			e.printStackTrace();
		}
	}
	// Excluir Registro
	public void excluir(Usuario usu) {		
		String sql = "delete from usuario where id=?";		
		try(PreparedStatement preparador = con.prepareStatement(sql)){ // uma forma diferente de close
			preparador.setInt(1, usu.getId());
			// executa banco de dados
			preparador.execute();
			
		} catch (SQLException e){
			e.printStackTrace();
		}
	}

}
