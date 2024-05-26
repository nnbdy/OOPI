package Übung1;

public class Übung1_9 {
	public static void main (String[] args) {
	
	int[] zahlen = {1,5,13,9,17,2};
	
	int summe = 0;
	int i = 0;
	
	while (i < zahlen.length) {
		summe += zahlen[i];
		i++;
	}

System.out.println("Die Summe beträgt: " + summe);

}
}
