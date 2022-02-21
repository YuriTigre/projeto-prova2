package prova2.questao9;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import prova2.questao9.conexao.ConnectionFactory;
import prova2.questao9.menu.opcoes.Atualizar;
import prova2.questao9.menu.opcoes.Deletar;
import prova2.questao9.menu.opcoes.Inserir;
import prova2.questao9.menu.opcoes.Listar;

public class Menu {

	public static void visual() throws SQLException {
		Scanner scan = new Scanner(System.in);
		String[] opcoes = { "1 - para INSERIR uma nova oferta", "2 - para ATUALIZAR uma oferta",
				"3 - para DELETAR uma nova oferta", "4 - para LISTAR as palavras que contem", "0 - para SAIR" };
		System.out.println("---+---+---+---+---+---+---+---");
		System.out.println("Bem Vindo(a) ao BD produtos!");
		System.out.println("Digite a opção desejada: ");
		leArray(opcoes);
		System.out.println("---+---+---+---+---+---+---+---\n");
		Integer escolha = scan.nextInt();
		respostaEscolha(escolha);

	}

	public static void respostaEscolha(Integer escolha) throws SQLException {
		Produto produto = new Produto();
		if (escolha == 0) {
			ConnectionFactory factory = new ConnectionFactory();
			Connection connection = factory.recuperaConexao();
			connection.close();
			return;
		}
		if (escolha == 1) {
			Inserir inserir = new Inserir();
			inserir.cadastro(produto.getId());
			auxSelect();
			visual();
		}
		if (escolha == 2) {
			Atualizar atualizar = new Atualizar();
			atualizar.atualiza(produto.getId());
			auxSelect();
		}
		if (escolha == 3) {
			Deletar deletar = new Deletar();
			deletar.quemDelete();
			System.out.println("\nDeletado!\n");
			auxSelect();
			visual();
		}
		if (escolha == 4) {
			Listar listar = new Listar();
			listar.lista();
			auxSelect();
		}

	}

	public static void auxSelect() throws SQLException {
		ConnectionFactory factory = new ConnectionFactory();
		Connection connection = factory.recuperaConexao();
		System.out.println("\nFazendo o select --- Tabela abaixo!!");
		String sql = "SELECT * FROM PRODUTO";
		try (PreparedStatement pstm = connection.prepareStatement(sql)) {
			pstm.execute();
			ResultSet rst = pstm.getResultSet();

			while (rst.next()) {
				Integer id = rst.getInt("ID");
				System.out.println("-----------------");
				System.out.println("ID: " + id);
				String nome = rst.getString("NOME");
				System.out.println("Nome: " + nome);
				String descricao = rst.getString("DESCRICAO");
				System.out.println("Descricao: " + descricao);
				String desconto = rst.getString("DESCONTO");
				System.out.println("Desconto: " + desconto);
				String data = rst.getString("DATA");
				System.out.println("Data: " + data);
				System.out.println("-----------------\n");
			}
		}
	}

	public static void leArray(String[] array) {
		for (int i = 0; i < 5; i++) {
			System.out.println(array[i]);
		}
	}
}
