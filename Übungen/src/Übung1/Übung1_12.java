package Übung1;

import java.util.Scanner;

public class Übung1_12 {
	public static void main (String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("Geben Sie die Anfangseinlage ein: ");
		double anfangseinlage = s.nextDouble();
		System.out.print("Geben Sie den jährlichen Zinssatz (%) ein: ");
		double zinssatz = s.nextDouble() / 100;
		System.out.print("Geben Sie die Anzahl der Jahre ein: ");
		int jahre = s.nextInt();
		
		for (int i = 1; i <= jahre; i++) {
			anfangseinlage += anfangseinlage * zinssatz;
			System.out.println("Nach " + i  + " Jahren: " + anfangseinlage);
		}

s.close();
}
}