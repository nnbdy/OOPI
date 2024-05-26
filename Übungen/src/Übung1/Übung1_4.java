package Übung1;

import java.util.Scanner;

public class Übung1_4 {
	public static void main (String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("Geben Sie die Anzahl der Tage ein: ");
		int Tage = s.nextInt();
		
		System.out.println(
				"10 Tage entsprechen:\n" + 
				"Stunden: " + (Tage *24)+ "\n" +
				"Minuten: " + (Tage *1440)+ "\n" +
				"Sekunden: " + (Tage *86400)+ "\n"
				);
		

}
}