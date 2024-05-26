package Übung1;

import java.util.Scanner;
import java.util.Random;

public class Übung1_14 {
	public static void main (String[] args) {
		Scanner s = new Scanner(System.in);
		Random r = new Random();
		
		int geheimzahl = r.nextInt(100) + 1;
		
		System.out.println("Willkommen beim Ratespiel! Versuchen Sie, die geheime Zahl zu erraten (1-100)." + 
							"\nGeben Sie -1 ein, um das Spiel zu beenden");
		
		int zahl;
		int attempts = 0;
		
		do {
			System.out.print("Geben Sie eine Zahl ein : ");
			zahl = s.nextInt();
			
			if (zahl == -1) {
				System.out.println("Das Spiel wurde beendet.");
				break; }
			if (zahl < geheimzahl) {
				System.out.println("Zu niedrig! Versuchen Sie es erneut.");
				attempts++; }
			if (zahl > geheimzahl) {
				System.out.println("Zu hoch! Versuchen Sie es erneut");
				attempts++; }
			if (zahl == geheimzahl) {
				attempts++;
				System.out.println("Herzlichen Glückwunsch! Sie haben die Zahl " + geheimzahl + " erraten!" + 
									"\nSie haben " + attempts + " Versuche gebraucht.");
				break; }
			
		} while (zahl != geheimzahl && zahl != -1);
		

}
}