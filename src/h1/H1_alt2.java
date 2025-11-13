package h1;

public class H1_alt2 {

	public static void main(String[] args) {
		double guthaben = 200.0;
		double monEingang = 100.0;
		int rating = -1;
		boolean warnhinweis = false;
		boolean negativ = false;
		
		if (guthaben < 0) {
			negativ = true;
		} else {
			negativ = false;
		}
		
		if (guthaben > 0) {
			rating = rating + 3;
		} else if (guthaben == 0) {
			rating = rating + 2;
		}
		
		if (guthaben < 0 && monEingang >= Math.abs(guthaben)) {
			rating = rating + 1;
		}
		
		if (guthaben < 0 && monEingang <Math.abs(guthaben) && rating < 0) {
			warnhinweis = true;
		} else {
			warnhinweis = false;
		}
		
		System.out.println("guthaben: " + guthaben);
		System.out.println("monEingang: " + monEingang);
		System.out.println("rating: " + rating);
		System.out.println("negativ: " + negativ);
		System.out.println("warnhinweis:" + warnhinweis);

	}

}
