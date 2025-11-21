package h3;

public class H3_main {

	public static void main(String[] args) {
		int input = 6279; 

	       
        int[][] einheiten = {
                {50000, 20000, 10000, 5000, 2000, 1000, 500, 200, 100, 50, 20, 10, 5, 2, 1},
                {    0,     0,     0,    0,    0,    0,   0,   0,   0,  0,  0,  0, 0, 0, 0}
        };

        int rest = input;

       
        for (int i = 0; i < einheiten[0].length; i++) {
            int wert = einheiten[0][i];   // z.B. 5000, 2000, 1000, ...
            int anzahl = rest / wert;     // wie oft passt dieser Wert rein?
            einheiten[1][i] = anzahl;     // in zweite Zeile eintragen
            rest = rest % wert;           // Restbetrag übrig lassen
        }

        // Ausgabe
        System.out.println("Betrag (input): " + input + " Cent");

        System.out.print("Werte:      ");
        for (int i = 0; i < einheiten[0].length; i++) {
            System.out.print(einheiten[0][i] + " ");
        }
        System.out.println();

        System.out.print("Stückzahl:  ");
        for (int i = 0; i < einheiten[1].length; i++) {
            System.out.print(einheiten[1][i] + " ");
        }
        System.out.println();

	}

}
