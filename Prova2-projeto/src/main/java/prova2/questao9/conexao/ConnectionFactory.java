package prova2.questao9.conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.sql.DataSource;


public class ConnectionFactory {
	
	public DataSource dataSource;
	
	public Connection recuperaConexao() throws SQLException {
		
		return DriverManager.getConnection("jdbc:mysql://localhost/projeto_loja?useTimezone=true&serverTimezone=UTC",
				"root","yurizinho2002") ;
	}

	}
//	public ConnectionFactory() {
//		ComboPooledDataSource cpds = new ComboPooledDataSource();
//		cpds.setJdbcUrl("jdbc:mysql://localhost/projeto_loja?useTimezone=true&serverTimezone=UTC");
//		cpds.setUser("root");
		
//		cpds.setPassword("yurizinho2002");
	
//		cpds.setMaxPoolSize(15);
	
//		this.dataSource = cpds;
//	}
	

