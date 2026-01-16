package p1;

public class potenzeniterativ {
public static int potenz (int basis, int exponent) {
	int ergebnis = 1;
	for (int i = 0; i<exponent; i++) {
		ergebnis *= basis;
	}
	return ergebnis;
	}
public static void main(String[] args) {
	System.out.println(potenz(7,5));
}
}

