package prova2.questao9.menu.opcoes;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import prova2.questao9.conexao.ConnectionFactory;

public class Inserir {
	
	public void cadastro(Integer id) throws SQLException {
		Scanner scan = new Scanner(System.in);
		ConnectionFactory factory = new ConnectionFactory();
		Connection connection = factory.recuperaConexao();
		
		System.out.print("Digite o nome: ");
		String nome = scan.next();
		
		System.out.print("Digite a descricao: ");
        String descricao = scan.next();
        
        System.out.print("Digite o desconto: ");
        Float desconto= scan.nextFloat();
        
        System.out.print("Digite a data: ");
        String data = scan.next();
        
		PreparedStatement pstm = connection.prepareStatement
				("INSERT INTO PRODUTO (nome,descricao,desconto,data) VALUES (?,?,?,?) ");
		pstm.setString(1, nome);
		pstm.setString(2, descricao);
		pstm.setFloat(3, desconto);
		pstm.setString(4, data);
		pstm.execute();
		scan.close();
	} 
}
