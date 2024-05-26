package Zusatzaufgabe.Abstrakte_Methoden;

public abstract class Form {
	
	    abstract double berechneFlaeche();
	    abstract double berechneUmfang();
	    abstract void anzeigen();
	}

	class Kreis extends Form {
	    private double radius;

	    public Kreis(double radius) {
	        this.radius = radius;
	    }

	    @Override
	    double berechneFlaeche() {
	        return Math.PI * Math.pow(radius, 2);
	    }

	    @Override
	    double berechneUmfang() {
	        return 2 * Math.PI * radius;
	    }

	    @Override
	    void anzeigen() {
	        System.out.println("Kreis - Radius: " + radius);
	    }
	}

	class Rechteck extends Form {
	    private double laenge;
	    private double breite;

	    public Rechteck(double laenge, double breite) {
	        this.laenge = laenge;
	        this.breite = breite;
	    }

	    @Override
	    double berechneFlaeche() {
	        return laenge * breite;
	    }

	    @Override
	    double berechneUmfang() {
	        return 2 * (laenge + breite);
	    }

	    @Override
	    void anzeigen() {
	        System.out.println("Rechteck - Länge: " + laenge + ", Breite: " + breite);
	    }
	}

	class Dreieck extends Form {
	    private double a;
	    private double b;
	    private double c;

	    public Dreieck(double a, double b, double c) {
	        this.a = a;
	        this.b = b;
	        this.c = c;
	    }

	    @Override
	    double berechneFlaeche() {
	        return 0.5 * a * b;
	    }

	    @Override
	    double berechneUmfang() {
	        return a + b + c;
	    }

	    @Override
	    void anzeigen() {
	        System.out.println("Dreieck - Seitenlängen: " + a + ", " + b + ", " + c);
	    }
	}



