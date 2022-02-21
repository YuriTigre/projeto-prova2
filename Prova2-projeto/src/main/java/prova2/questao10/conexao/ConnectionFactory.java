package prova2.questao10.conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.sql.DataSource;


public class ConnectionFactory {
	
	public DataSource dataSource;
	
	public Connection recuperaConexao() throws SQLException {
		
		return DriverManager.getConnection("jdbc:mysql://localhost/projeto_carinha?useTimezone=true&serverTimezone=UTC",
				"root","yurizinho2002") ;
	}

	}


