package Übung1;

import java.util.Scanner;

public class Z01_Scanner {
	public static void main (String[] args) {
		Scanner s = new Scanner(System.in);
		
		// entfernung, kilometerpauschale, gesamtkosten
		
		
		System.out.print("Geben Sie die zurückgelegte Entfernung in km ein: ");
		double entfernung = s.nextDouble();
		
		System.out.print("Geben Sie die Kosten pro km ein (z.B. 0,35 für 35ct pro km: ");
		double kilometerpauschale = s.nextDouble();
		
		double Gesamtkosten = entfernung * kilometerpauschale;
		
		System.out.println("Die Gesamtkosten betragen: " + Gesamtkosten);
		
				
}
}