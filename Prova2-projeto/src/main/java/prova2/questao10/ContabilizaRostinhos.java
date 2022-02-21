package prova2.questao10;

public class ContabilizaRostinhos extends VerificaEntrada{
	public void contabiliza(){//retornar o numero
		if(feliz > triste) {
			System.out.println("Divertido!!");
		}
		if(feliz < triste) {
			System.out.println("Chateado");
		}
		if(feliz == triste) {
			System.out.println("Você está neutro");
		}
		
	}
}
