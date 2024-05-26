package Übung1;

import java.util.Scanner;

public class Übung1_10 {
	public static void main (String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("Geben Sie die Zahl ein: ");
		int zahl = s.nextInt();
		
		int fakultaet = 1;
		int i = 1;
		
		while (i <= zahl) {
			fakultaet *= i;
			i++;
		}
System.out.println("Die Fakultät von " + zahl + " ist: " + fakultaet);

s.close();
}
}