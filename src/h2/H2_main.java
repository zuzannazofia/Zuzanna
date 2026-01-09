package h2;

public class H2_main {

	public static void main(String[] args) {
		  Spielbrett b = new Spielbrett(3);

	 
	        Feld[][] a = b.getBrett();
	        a[0][0] = new Feld(false, 'L');
	        a[0][1] = new Feld(true,  'R');
	        a[0][2] = new Feld(false, 'L');

	        a[1][0] = new Feld(false, 'L');
	        a[1][1] = new Feld(true,  'R');
	        a[1][2] = new Feld(false, 'U');

	        a[2][0] = new Feld(false, 'L');
	        a[2][1] = new Feld(false, 'U');
	        a[2][2] = new Feld(false, 'U');

	        Spielstein s = new Spielstein(b, 2, 2);

	        System.out.println("Start: (" + s.getCurrentRow() + "," + s.getCurrentCol() + ")");
	        s.go(7);
	        System.out.println("Ende:  (" + s.getCurrentRow() + "," + s.getCurrentCol() + ")");
	    }
	}

	


