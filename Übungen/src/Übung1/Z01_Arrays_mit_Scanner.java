package Übung1;

import java.util.Scanner;

public class Z01_Arrays_mit_Scanner {
	public static void main (String[] args) {
		Scanner s = new Scanner(System.in);
	
		System.out.print("Geben Sie den Fall ein: ");
		int Fall = s.nextInt();
		
		switch (Fall) 	{
			case 1:
				String [] hallo_welt = {"Hallo", "Welt"};
				System.out.println( "Vor dem Austausch:" + "\n" +
								"Array Element 0: " + hallo_welt[0] + "\n" +
								"Array Element 1: " + hallo_welt[1] );
				
				break;
			case 2:
				String [] hallo_welt_2 = {"Welt", "Hallo"};
				System.out.println( "Vor dem Austausch:" + "\n" +
						"Array Element 0: " + hallo_welt_2[0] + "\n" +
						"Array Element 1: " + hallo_welt_2[1] );
				break;
						}
s.close();

	}
}
