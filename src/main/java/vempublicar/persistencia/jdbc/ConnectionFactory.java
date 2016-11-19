package vempublicar.persistencia.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

	public static Connection getConnection() {
		// TODO Auto-generated method stub
		try {
			return DriverManager.getConnection("jdbc:postgresql://localhost:5432/extilos","postgres","251251");
		} catch (SQLException e) {
			// relancando a exception
			throw new RuntimeException(e);
		}
	}

}
