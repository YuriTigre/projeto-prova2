package prova2.questao10;

import java.util.ArrayList;

public class VerificaEntrada {
	protected static int feliz = 0;
	protected static int triste = 0;

	public void verifica(ArrayList<String> array) {
		ContabilizaRostinhos contabilizaRosto = new ContabilizaRostinhos();
		int i = 0;
		while (array.size() > i) {

			System.out.println("Entrada: " + array.get(i));
			if (array.get(i).contains(":-)")) {
				feliz = getFeliz() + 1;
			}
			if (array.get(i).contains(":-(")) {
				triste = getTriste() + 1;
			}
			i++;
		}
		contabilizaRosto.contabiliza();
		System.out.println("feliz: " + feliz + " triste: " + triste);
	}

	public int getFeliz() {
		return this.feliz;
	}

	public int getTriste() {
		return this.triste;
	}
}
