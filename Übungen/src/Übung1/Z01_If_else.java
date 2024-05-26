package Übung1;

import java.util.Scanner;

public class Z01_If_else {
	public static void main (String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("Geben Sie die erste Zahl ein: ");
		double zahl1 = s.nextDouble();
		System.out.print("Geben Sie die zweite Zahl ein: ");
		double zahl2 = s.nextDouble();
		System.out.print("Wählen Sie die Operation aus(+, -, *, /): ");
		char operation = s.next().charAt(0);

	// 	leerer String anlegen 
	double ergebnis = 0;
	
	//Operationen überprüfen
	if (zahl2 == 0 && operation == '/') {
		System.out.println("Division durch Null ist nicht erlaubt.");
	} else if (operation != '+' && operation != '-' && operation != '*' && operation != '/') {
			System.out.println("Diese Operation word nicht unterstützt.");
	//Matheoperationen ausführen mit Rundung auf 2 Kommastellen
	} else
		switch (operation) {
		case '+':
			ergebnis = zahl1 + zahl2;
			ergebnis = Math.round(ergebnis*100.0)/100.0;
			break;
		case '-':
			ergebnis = zahl1 - zahl2;
			ergebnis = Math.round(ergebnis*100.0)/100.0;
			break;
		case '*':
			ergebnis = zahl1 * zahl2;
			ergebnis = Math.round(ergebnis*100.0)/100.0;
			break;
		case '/':
			ergebnis = zahl1 / zahl2;
			ergebnis = Math.round(ergebnis*100.0)/100.0;
			break;
		} 
	System.out.println(zahl1 + " " + operation + " " + zahl2 + " = " + ergebnis);
s.close();

	}
}

