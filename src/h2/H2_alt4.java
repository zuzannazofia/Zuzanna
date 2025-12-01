package h2;

public class H2_alt4 {

	public static void main(String[] args) {
		int n = 299;      // hier kannst du andere Zahlen testen
        int digits = 0;

  
        int[] a = new int[9];

       
        int temp = n;

        if (temp == 0) {
            digits = 1;
        } else {
            while (temp > 0) {
                digits++;
                temp = temp / 10;
            }
        }

       
        temp = n;
        int index = a.length - 1;   // letzte Stelle im Array (rechts)

        while (index >= 0 && temp > 0) {
            a[index] = temp % 10;   // letzte Ziffer
            temp = temp / 10;       // Ziffer „abschneiden“
            index--;                // nach links gehen
        }

        // ---- Kontrolle: Ausgabe ----
        System.out.println("n = " + n);
        System.out.println("digits = " + digits);

        System.out.print("Array a: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
}

	


