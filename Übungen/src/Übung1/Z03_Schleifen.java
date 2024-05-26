package Übung1;

import java.util.Random;
import java.util.Scanner;

public class Z03_Schleifen {
	public static void main (String[] args) {
		Scanner s = new Scanner(System.in);
		Random r = new Random();
		
		int sgewinnegesamt = 0;
		int kigewinnegesamt = 0;
		boolean beenden ;

		do {
		beenden = false;
			
		System.out.println("Willkommen bei Schere-Stein-Papier! \nWähle eine der folgenden Möglichkeiten aus: " + 
				"\nA" + "\tSpiel starten" + "\nB" + "\tGesamtspielstand anzeigen" + "\nC" + "\tSpiel beenden");
		
		System.out.print("Möglichkeit: ");
		char Auswahl = s.next().charAt(0);
		
		int sgewinn = sgewinnegesamt;
		int kigewinn = kigewinnegesamt;
		int runde = 1;
		
		//1 = Schere; 2 = Stein; 3 = Papier
		
		switch(Auswahl) {
		case 'A': {
			do {
				int kiwahl = r.nextInt(3) +1;
				
				System.out.print("\n1 = Schere \n2 = Stein \n3 = Papier \nZum Beenden 0 eingeben\n" + "\nRunde " + runde + "\n");
				
				System.out.print("Geben Sie eine Zahl ein: ");
				int spiel = s.nextInt();
				
				if (spiel == 1 && kiwahl == 2) {
					System.out.println("Deine Wahl: Schere" +
										"\nWahl der KI: Stein");
					System.out.println("\nKI gewinnt");
					System.out.println("\n---------------------------");
					kigewinn++; runde++;}
				
				else if (spiel == 1 && kiwahl == 3) {
					System.out.println("Deine Wahl: Schere" +
										"\nWahl der KI: Papier");
					System.out.println("\nDu gewinnst");
					System.out.println("\n---------------------------");
					sgewinn++; runde++;}
				
				else if (spiel == 2 && kiwahl == 1) {
					System.out.println("Deine Wahl: Stein" +
										"\nWahl der KI: Schere");
					System.out.println("\nDu gewinnst");
					System.out.println("\n---------------------------");
					sgewinn++; runde++;}
				
				else if (spiel == 2 && kiwahl == 3) {
					System.out.println("Deine Wahl: Stein" +
										"\nWahl der KI: Papier");
					System.out.println("\nKI gewinnt");
					System.out.println("\n---------------------------");
					kigewinn++; runde++;}
				
				else if (spiel == 3 && kiwahl == 1) {
					System.out.println("Deine Wahl: Papier" +
										"\nWahl der KI: Schere");
					System.out.println("\nKI gewinnt");
					System.out.println("\n---------------------------");
					kigewinn++; runde++;}
				
				else if (spiel == 3 && kiwahl == 2) {
					System.out.println("Deine Wahl: Papier" +
										"\nWahl der KI: Stein");
					System.out.println("\nDu gewinnst");
					System.out.println("\n---------------------------");
					sgewinn++; runde++;}
				
				else if (spiel == 0) {
					System.out.println("Das Spiel ist beendet");
					break;}
				
				else if (spiel != 1 && spiel != 2 && spiel != 3 && spiel != 0) {
					System.out.println("Bitte gib eine Zahl zwischen 1 und 3 ein");}
				
				else {System.out.println("Gleichstand. Versusche es nochmal.");}
				} while (sgewinn < 3 && kigewinn < 3);	
				if (sgewinn == 3) {
				System.out.println("\nHerzlichen Glückwunsch Du hast gewonnen!");}
				else {System.out.println("\nDie KI hat gewonnen");}
				}
		
					case 'B': {
						System.out.println(sgewinn + "\t" + kigewinn);
						break;
							}
			
						case 'C': {
							System.out.println("Das Spiel wurde beendet.");
							beenden = true;
								}
			}
		
	} while (beenden = false); 
	
	
}
}