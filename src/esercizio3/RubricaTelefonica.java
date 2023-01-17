/*Esercizio #3
Scrivere una classe Java che permetta di gestire una rubrica  telefonica. La lista dei contatti è realizzata mediante una HashMap in cui le chiavi sono i nomi delle persone e i valori sono i numeri di telefono. Realizzare i metodi per:
1. L’inserimento di una coppia <Nome, telefono>
2. La cancellazione di una coppia <Nome, telefono> a partire dal nome
3. La ricerca di una Persona di cui si conosce il numero di telefono
4. La ricerca del numero di telefono di una Persona di cui si conosce il Nome 
5. La stampa di tutti i contatti con nome e numero.*/

package esercizio3;

import java.util.HashMap;
import java.util.Map;

public class RubricaTelefonica {

	public static void main(String[] args) {

		Map<String, String> hmap = new HashMap<String, String>();

		// inserimento coppia chiave valore
		hmap.put("Mario", "3920796582");
		hmap.put("Anna", "3208569631");
		hmap.put("Luca", "3495555201");
		hmap.put("Andrea", "3246911478");

		// Stampa lista prima di cancellazione
		for (String rubrica : hmap.keySet()) {
			System.out.println("Nome: " + rubrica + " - Numero: " + hmap.get(rubrica));
		}
		System.out.println("--------------------------------------");

		// cancellazione a partire dal nome, cancello Andrea
		hmap.remove("Andrea");

		// ricerca persona tramite telefono
		String ricerca = null;

		for (String telefono : hmap.keySet()) {
			if ("3920796582".equals(hmap.get(telefono))) {
				ricerca = telefono;
			}
		}
		System.out.println("Ricerca per telefono: " + ricerca);

		System.out.println("--------------------------------------");

		// ricerca persona tramite nome
		ricerca = hmap.get("Mario");
		System.out.println("Ricerca per nome: " + ricerca);

		System.out.println("--------------------------------------");

		/*
		 * Stampa tutta la lista Set set = hmap.entrySet(); Iterator iterator =
		 * set.iterator(); while(iterator.hasNext()) { Map.Entry m =
		 * (Map.Entry)iterator.next(); System.out.println("Stampa Rubrica: ");
		 * System.out.print("Nome contatto: " + m.getKey() + " & Numero di telefono: ");
		 * System.out.println(m.getValue()); }
		 */
		// Ristampo lista senza Andrea
		for (String rubrica : hmap.keySet()) {
			System.out.println("Nome: " + rubrica + " - Numero: " + hmap.get(rubrica));
		}
		System.out.println("--------------------------------------");

	}

}
