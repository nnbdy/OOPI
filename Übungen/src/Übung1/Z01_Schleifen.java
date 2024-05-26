package Übung1;

import java.util.Scanner;

public class Z01_Schleifen {
	public static void main (String[] args) {
	Scanner s = new Scanner(System.in);
		
		System.out.print("Geben Sie den Anfangswert ein: ");
		int anfangswert = s.nextInt();
		System.out.print("Geben Sie den Endwert ein: ");
		int endwert = s.nextInt();
		System.out.print("Geben Sie den Zielwert ein: ");
		int zielwert = s.nextInt();
		
		int i = anfangswert;
		
		if (zielwert > endwert) {
			System.out.println("Der Zielwert " + zielwert + " wurde nicht gefunden.");
		} else {
			while (true) {
				if (i == zielwert){
					break;
				} else  { i++; }	
			}
		System.out.println("Der Zielwert " + zielwert + " wurde an Position " + (zielwert - anfangswert) + " gefunden");
		}
		
s.close();
}
}