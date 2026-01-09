package h2;

public class Spielstein {

	
	    private int currentRow;
	    private int currentCol;
	    private Spielbrett brett;

	    public Spielstein(Spielbrett brett, int indexRow, int indexCol) {
	        this.brett = brett;
	        this.currentRow = indexRow;
	        this.currentCol = indexCol;
	    }

	    public int getCurrentRow() {
	        return currentRow;
	    }

	    public void setCurrentRow(int currentRow) {
	        this.currentRow = currentRow;
	    }

	    public int getCurrentCol() {
	        return currentCol;
	    }

	    public void setCurrentCol(int currentCol) {
	        this.currentCol = currentCol;
	    }

	    public Spielbrett getBrett() {
	        return brett;
	    }

	    public void setBrett(Spielbrett brett) {
	        this.brett = brett;
	    }

	    
	    private boolean movesOut() {
	        Feld[][] a = brett.getBrett();
	        int dim = brett.getDim();

	        Feld f = a[currentRow][currentCol];
	        char d = f.getDirection();

	        if (d == 'U') return currentRow == 0;
	        if (d == 'D') return currentRow == dim - 1;
	        if (d == 'L') return currentCol == 0;
	        if (d == 'R') return currentCol == dim - 1;

	        return false; 
	    }

	   
	    public void go(int n) {
	        if (n == 0) return;

	        Feld[][] a = brett.getBrett();
	        int dim = brett.getDim();

	        for (int i = 0; i < n; i++) {
	            Feld f = a[currentRow][currentCol];

	          
	            if (f.isBoese()) {
	                continue;
	            }

	           
	            if (movesOut()) {
	                continue;
	            }

	            char d = f.getDirection();

	            int nextRow = currentRow;
	            int nextCol = currentCol;

	            if (d == 'U') nextRow--;
	            else if (d == 'D') nextRow++;
	            else if (d == 'L') nextCol--;
	            else if (d == 'R') nextCol++;

	           
	            if (nextRow < 0 || nextRow >= dim || nextCol < 0 || nextCol >= dim) {
	                continue;
	            }

	            currentRow = nextRow;
	            currentCol = nextCol;
	        }
	    }
	}

