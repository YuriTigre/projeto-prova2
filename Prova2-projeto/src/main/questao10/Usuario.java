package prova2.questao10;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Usuario {

	public void entrada() {
		Scanner scan = new Scanner(System.in);
		ArrayList<String> listaEntrada = new ArrayList<String>();
		VerificaEntrada verificaEntrada = new VerificaEntrada();
		System.out.print("Digite seu usuario: ");
		String nome = scan.nextLine();

		System.out.println("Olá, " + nome + "! Como está se sentindo hoje: ");
		String entrada = scan.nextLine();
		listaEntrada.add(entrada);
		verificaEntrada.verifica(listaEntrada);

	}

}
