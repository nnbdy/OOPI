package Übung1;

import java.util.Scanner;

public class Übung1_3 {
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		final double pi = Math.PI ;
		
		System.out.print("Geben Sie den Radius ein: ");
		int radius = scanner.nextInt();
		
		System.out.println("Der Flächeninhalt des Kreises mit dem Radius " + radius + " beträgt: " + (pi * radius * radius));
		
		scanner.close();
}
}