package Übung1;

public class Übung1_1 {
	public static void main (String[] args) {

		double note1 = 1.3d;
		double note2 = 2.6d;
		double note3 = 1.7d;


		double e1 = (note1 + note2 + note3)/3;
		e1 = Math.round(e1*100.0)/100.0;

System.out.println("Die Durchschnitsnote ist: " + e1);

}
}
