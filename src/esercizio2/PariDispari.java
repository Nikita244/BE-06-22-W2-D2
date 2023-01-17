package esercizio2;

import java.util.List;

public class PariDispari {

	
	public static void controllo(List<Integer> lista, boolean x) {
		//x è il mio valore boolean definito pari = true
		   if (x) {
			   System.out.println("I numeri nella posizione pari sono: ");
		   } else {
			   System.out.println("I numeri nella posizione dispari sono: ");
		   }
		   
		   
	        for (int i = 0; i < lista.size(); i++) {
	            if (!x && i % 2 == 0) {
	                System.out.print(lista.get(i) + " ");
	            } else if (x && i % 2 != 0) {
	                System.out.print(lista.get(i) + " ");
	            }
	        }
	    }
}
/* 
Scrivere una terza funzione che accetti una lista ed un booleano: se il booleano Ã¨ true stampa i valori in posizioni pari, altrimenti stampa i valori in posizioni dispari. Creare una main che utilizzi le due funzioni. Utilizzare l'interfaccia List e l'implementazione ArrayList. */
