package Übung1;

public class Math_Example {
	    public static void main(String[] args) {
	        double number1 = -10.5;
	        double number2 = 7.8;
	        
	        // Absoluter Wert
	        double absValue = Math.abs(number1);
	        System.out.println("Der absolute Wert von " + number1 + " ist " + absValue);
	        
	        // Quadratwurzel
	        double sqrtValue = Math.sqrt(number2);
	        System.out.println("Die Quadratwurzel von " + number2 + " ist " + sqrtValue);
	        
	        // Potenz
	        double powerValue = Math.pow(number1, 2);
	        System.out.println(number1 + " hoch 2 ist " + powerValue);
	        
	        // Sinus, Cosinus und Tangens
	        double angle = Math.PI / 4; // 45 Grad im Bogenmaß
	        double sinValue = Math.sin(angle);
	        sinValue = Math.round(sinValue*100.0)/100.0;
	        double cosValue = Math.cos(angle);
	        cosValue = Math.round(cosValue*100.0)/100.0;
	        double tanValue = Math.tan(angle);
	        tanValue = Math.round(tanValue*100.0)/100.0;
	        System.out.println("Sinus von " + angle + " ist " + sinValue);
	        System.out.println("Kosinus von " + angle + " ist " + cosValue);
	        System.out.println("Tangens von " + angle + " ist " + tanValue);
}
}
