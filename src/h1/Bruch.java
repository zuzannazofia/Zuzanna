package h1;

public class Bruch {

	int zaehler;
	int nenner;
	
	public Bruch(int zaehler, int nenner) {
		this.zaehler = zaehler;
		this.nenner = nenner;
		
	}
	
	private int ggT(int x, int y) {
		x = Math.abs(x);
				y = Math.abs(y);
				
		while (y!=0) {
			int rest = x % y;
			x=y;
			y=rest;
		}
		
		return x;
	}

	public void shorten () {
		int g = ggT(zaehler, nenner);
		if (g!=0) {
			zaehler= zaehler / g;
			nenner=nenner /g;
		}
	}
	
	public boolean hasSameValueAs(Bruch b) {
		
		long left = (long) this.zaehler* b.nenner;
		long right = (long) b.zaehler* this.nenner;
		return left == right;
	}
	@Override
	public String toString() {
		return zaehler + "/" + nenner;
	}
}

