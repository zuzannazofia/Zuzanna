package h3;

public class H3_main {

	public static void main(String[] args) {
		int i = 210;
        int j = 102;
        int k = -10;

        // Ausdruck 1: i > j
        // Ausdruck 2: i > 200
        // Ausdruck 3: j > 100

        if (i > j) { // Ausdruck 1
            if (i > 200) { // Ausdruck 2
                if (j > 100) { // Ausdruck 3
                    k = 3; // alle drei wahr
                } else {
                    k = 2; // Ausdruck 1 & 2 wahr, aber 3 falsch
                }
            } else {
                if (j > 100) {
                    // i > j, aber i <= 200, j > 100 → kein spezieller Fall
                    k = -10;
                } else {
                    k = 1; // Ausdruck 1 wahr, 2 & 3 falsch
                }
            }
        } else if (!(i > j) && !(i > 200) && !(j > 100)) {
            k = 4; // alle drei falsch
        }

        System.out.println("Wert von k: " + k);

	}

}
