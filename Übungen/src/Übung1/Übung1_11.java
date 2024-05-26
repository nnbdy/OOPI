package Übung1;

public class Übung1_11 {
	public static void main (String[] args) {
		
		int[] zahlen = {1,2,3,4,5,6,7,8,9,10,11,12};
		
		int max = zahlen[0];

        for (int i = 1; i < zahlen.length; i++) {
            if (zahlen[i] > max) {
                max = zahlen[i];
            }
        }

        System.out.println("Das größte Element im Array ist: " + max);
 
}
}