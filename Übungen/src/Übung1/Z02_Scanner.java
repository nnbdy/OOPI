package Übung1;

import java.util.Scanner;

public class Z02_Scanner {
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Geben Sie die Temperatur in Celsius ein: ");
		double celsius = scanner.nextDouble();
		
		double fahrenheit = celsius *1.8+32;
		
		System.out.println("Die Temperatur in Fahrenheit beträgt: " + fahrenheit);
		
		
}
}
