package view;

import br.com.serialexperimentscarina.listaint.ListaInt;

public class Principal {

	public static void main(String[] args) {
		
		int[] vet = {3, 5, 18, 12, 9, 7, 6, 2, 13, 4, 16};
		ListaInt lista = new ListaInt();
		
		for (int dado : vet) {
			try {
				lista.addLast(dado);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("Lista em ordem invertida: ");
		while (!lista.isEmpty()) {
			try {
				System.out.print(lista.get(lista.size() - 1) + " ");
				lista.removeLast();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

}
