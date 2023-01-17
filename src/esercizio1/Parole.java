/*Esercizio #1
Scrivere un programma che chieda all'utente di inserire un intero N che rappresenti il numero di elementi da inserire e poi gli chieda di inserire N parole. Il programma dovrà:
– stampare tutte le parole duplicate
– stampare il numero di parole distinte
– stampare l'elenco delle parole distinte
Utilizzare l'interfaccia Set e l'implementazione HashSet*/


package esercizio1;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Parole {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
        System.out.print("Scegli il numero di parole: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        Set<String> parole = new HashSet<>();
        Set<String> paroleDuplicate = new HashSet<>();

        for (int i = 0; i < n; i++) {
            System.out.print("Inserisci la parola " + (i + 1) + ": ");
            String parola = scanner.nextLine();
            if (!parole.add(parola)) {
                paroleDuplicate.add(parola);
            }
        }

        System.out.println("Parole duplicate: " + paroleDuplicate);
        System.out.println("Numero di parole distinte: " + parole.size());
        System.out.println("Elenco parole distinte: " + parole);
    }

}
