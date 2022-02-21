package prova2.questao9.menu.opcoes;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import prova2.questao9.conexao.ConnectionFactory;

public class Listar {

	public void lista() throws SQLException {
		Scanner scan = new Scanner(System.in);
		ConnectionFactory factory = new ConnectionFactory();
		Connection connection = factory.recuperaConexao();

		System.out.println("Digite que categoria gostaria de listar: ");
		String categoria = scan.nextLine();
		if (categoria.equalsIgnoreCase("nome")) {
			System.out.println("Digite o que gostaria de buscar: ");
			String busca = scan.nextLine();
			PreparedStatement pstm = connection.prepareStatement("SELECT NOME FROM PRODUTO WHERE NOME = ?");
			pstm.setString(1, busca);
		}
		if (categoria.equalsIgnoreCase("descricao")) {
			System.out.println("Digite o que gostaria de buscar: ");
			String busca = scan.nextLine();
			PreparedStatement pstm = connection.prepareStatement("SELECT DESCRICAO FROM PRODUTO WHERE DESCRICAO = ?");
			pstm.setString(1, busca);
			ResultSet rst = pstm.getResultSet();

			while (rst.next()) {
				String nome = rst.getString("NOME");
				System.out.println("Nome: " + nome);

			}
		}
		scan.close();
	}
}
