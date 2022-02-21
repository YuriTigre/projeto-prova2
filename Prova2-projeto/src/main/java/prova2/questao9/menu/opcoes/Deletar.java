package prova2.questao9.menu.opcoes;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import prova2.questao9.conexao.ConnectionFactory;

public class Deletar {
	public void quemDelete() throws SQLException {
		Scanner scan = new Scanner(System.in);
		ConnectionFactory factory = new ConnectionFactory();
		Connection connection = factory.recuperaConexao();
		PreparedStatement pstm = connection.prepareStatement("SELECT * FROM PRODUTO");
		pstm.execute();
		System.out.print("Quem você deseja deletar?");
		Integer escolha = scan.nextInt();
		delete(escolha);
	}

	public void delete(Integer id) throws SQLException {

		ConnectionFactory factory = new ConnectionFactory();
		Connection connection = factory.recuperaConexao();

		PreparedStatement pstm = connection.prepareStatement("DELETE FROM PRODUTO WHERE ID = ?");
		pstm.setInt(1, id);
		pstm.execute();

	}
}
