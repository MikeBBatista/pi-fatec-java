package fatec.pi.daos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BaseConnection {
	String serverName = "localhost"; //caminho do servidor
	String mydatabase = "pijava"; //nome do seu banco de dados
	String url = "jdbc:mysql://" + serverName + "/" + mydatabase;
	String username = "root"; //nome de um usu�rio de seu BD
	String password = "admin"; //sua senha de acesso
	Connection connection;

	BaseConnection() throws SQLException{
		connection = DriverManager.getConnection(url, username, password);
	}
}
