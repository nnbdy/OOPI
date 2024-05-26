package Zusatzaufgabe_Interfaces;


public class Auto implements Fortbewegungsmittel {
    private int aktuelleGeschwindigkeit;

    public static void main(String[] args) {
        Auto a = new Auto();
        a.aktuelleGeschwindigkeit = 50;
        
        /* Rufen Sie hier zusÃ¤tzlich die Methode zum Beschleunigen auf und geben Sie die aktuelle Geschwindigkeit aus */
        System.out.println("Neue Geschwindigkeit: " + a.beschleunigen());
    }
    
    /*Implementieren Sie hier die Methode aus dem Interface*/
    public double beschleunigen() {
        aktuelleGeschwindigkeit += 1;
        return aktuelleGeschwindigkeit;
    }
}