package esercizio2;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
	static ArrayList<Integer> lista = new ArrayList<Integer>();

	public static void main(String[] args) {
		
		chiediNum();
	}
	
	
	//-------------Richiesta Lista--------------//
	public static void chiediNum() {
		Scanner in = new Scanner(System.in);
		System.out.println("Inserisci la quantità  di numeri che desideri: ");
		int size = Integer.parseInt(in.nextLine());
		in.close();
		listaRandom(size);
	}

	public static void listaRandom(int size) {
		Random r = new Random();

		// genera un array grande quanto indicato dall'input
		for (int i = 0; i < size; i++) {
			lista.add(r.nextInt(101));
		}

		System.out.printf("Lista array creata: %s%n", lista);// lista creata
		
		CrescenteDecrescente.ordina(lista);
		
		boolean pari = true;
		PariDispari.controllo(lista, pari);
	}

}
