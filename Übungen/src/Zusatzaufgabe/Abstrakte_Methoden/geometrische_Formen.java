package Zusatzaufgabe.Abstrakte_Methoden;

public class geometrische_Formen {
	    public static void main(String[] args) {
	        Form kreis = new Kreis(5.0);
	        Form rechteck = new Rechteck(3.0, 4.0);
	        Form dreieck = new Dreieck(3.0, 4.0, 5.0);

	        zeigeDetailsUndBerechne(kreis);
	        zeigeDetailsUndBerechne(rechteck);
	        zeigeDetailsUndBerechne(dreieck);
	    }

	    private static void zeigeDetailsUndBerechne(Form form) {
	        form.anzeigen();
	        System.out.println("Fläche: " + form.berechneFlaeche());
	        System.out.println("Umfang: " + form.berechneUmfang());
	        System.out.println();
	    }
	}

