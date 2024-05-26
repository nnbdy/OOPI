package Übung1;

import java.util.Scanner;

public class Übung1_5 {
	public static void main (String[] args) {
		Scanner s = new Scanner(System.in);
		
		double[] noten = new double[3];

		System.out.print("Geben Sie Note 1 ein: ");
		noten[0] = s.nextDouble();
		
		System.out.print("Geben Sie Note 2 ein: ");
		noten[1] = s.nextDouble();
		
		System.out.print("Geben Sie Note 3 ein: ");
		noten[2] = s.nextDouble();
		
		double summe = noten[0] + noten[1] + noten[2];
		double Durchschnitt = summe / noten.length;
		Durchschnitt = Math.round(Durchschnitt*100.0)/100.0;
		
		System.out.println("Der Durchschnitt der Noten beträgt: " + Durchschnitt);
}
}