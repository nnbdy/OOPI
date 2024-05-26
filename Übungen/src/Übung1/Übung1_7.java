package Übung1;

import java.util.Scanner;

public class Übung1_7 {
	public static void main (String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("Geben Sie die Note ein: ");
		double Note = s.nextDouble(); 
		
		String nachricht = "";
		
		if (Note >= 0.9 && Note <= 1.5) {
			nachricht = "Sehr gut";
		} else if (Note >= 1.6 && Note <= 2.5) {
			nachricht = "Gut";
		} else if (Note >= 2.6 && Note <= 3.9) {
			nachricht = "Befriedigend";
		} else if (Note >= 3.6 && Note <= 4.9) {
			nachricht = "Ausreichend";
		} else if (Note >= 4.6 && Note <= 5.9) {
			nachricht = "Mangelhaft";
		} else if (Note >= 5.6 && Note <= 6.0) {
			nachricht = "Mangelhaft";
		} else 
			nachricht = "Nicht möglich als Note";

System.out.println("Bewertung: " + nachricht);
	
s.close();
	}
}