package Übung1;

public class Übung1_2 {
	public static void main (String[] args) {
		
		double sp = 5.0d;
		int me = 10;
		final float MWST = 0.19f;
		
		double Gesamtpreis = sp * me;
		double Gesamtpreis_mit_MWST = Gesamtpreis + (Gesamtpreis* MWST);
		Gesamtpreis_mit_MWST = Math.round(Gesamtpreis_mit_MWST*100.0)/100.0;
		
System.out.println("Gesamtpreis ohne Steuern: " + Gesamtpreis);
System.out.println("Gesamtpreis mit Steuern (19%): " + Gesamtpreis_mit_MWST);
		
	}
	}