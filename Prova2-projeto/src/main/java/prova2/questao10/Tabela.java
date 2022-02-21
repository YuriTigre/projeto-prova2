package prova2.questao10;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import prova2.questao10.conexao.ConnectionFactory;

public class Tabela {
	public void mostraTabela(String nome, String carinha) throws SQLException {
	ConnectionFactory factory = new ConnectionFactory();
	Connection con = factory.recuperaConexao();

	PreparedStatement pstmInsert = 
			con.prepareStatement("INSERT INTO ROSTO (nome,carinha) VALUES (?,?) ");
	
	pstmInsert.setString(1, nome);
	pstmInsert.setString(2, carinha);
	
	PreparedStatement pstm = 
			con.prepareStatement("SELECT * FROM ROSTO");
	pstm.execute();
	ResultSet rst = pstm.getResultSet();

	while (rst.next()) {
		System.out.println("-----------------");
		String nome1 = rst.getString("NOME");
		System.out.println("Nome: " + nome);
		String carinha1 = rst.getString("NOME");
		System.out.println("Carinha: " + carinha);
		System.out.println("-----------------\n");
	}
	}
	
}
