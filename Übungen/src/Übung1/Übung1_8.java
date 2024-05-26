package Übung1;

import java.util.Scanner;

public class Übung1_8 {
		public static void main (String[] args) {
			Scanner s = new Scanner(System.in);
			
			System.out.print("Geben Sie die Temperatur ein: ");
			int Temperatur = s.nextInt(); 
			
			String nachricht = "";
			
			if (Temperatur < 6) {
				nachricht = "Es ist kalt";
			} else if (Temperatur >= 0 && Temperatur <= 20) {
				nachricht = "Es ist mild";
			} else 
				nachricht = "Es ist warm";
		
	System.out.println(nachricht);

	s.close();
	}
}