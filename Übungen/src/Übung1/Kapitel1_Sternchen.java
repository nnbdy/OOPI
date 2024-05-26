package Übung1;

public class Kapitel1_Sternchen {
	public static void main (String[] args) {
		
		for (int i = 9; i >= 0; i--) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
}
}