package h1;

public class Grid {
	 private Cell[][] gridArray;

	    public Grid(Cell[] cells, int gridRows, int gridCols) {
	        this.gridArray = new Cell[gridRows][gridCols];

	  
	        for (int r = 0; r < gridRows; r++) {
	            for (int c = 0; c < gridCols; c++) {
	                gridArray[r][c] = new Cell(r, c, false);
	            }
	        }

	        if (cells != null) {
	            for (Cell cell : cells) {
	                if (cell == null) continue;
	                int r = cell.getIndexRow();
	                int c = cell.getIndexCol();

	                if (r >= 0 && r < gridRows && c >= 0 && c < gridCols) {
	                    gridArray[r][c].setAlive(true);
	                }
	            }
	        }

	       
	        recomputeAll();
	    }

	    public Cell[][] getGridArray() {
	        return gridArray;
	    }

	    public void setGridArray(Cell[][] gridArray) {
	        this.gridArray = gridArray;
	    }

	    public void computeNextGen() {
	       
	        for (int r = 0; r < gridArray.length; r++) {
	            for (int c = 0; c < gridArray[0].length; c++) {
	                gridArray[r][c].countLivingNeighbors(gridArray);
	            }
	        }

	     
	        for (int r = 0; r < gridArray.length; r++) {
	            for (int c = 0; c < gridArray[0].length; c++) {
	                gridArray[r][c].setAlive(gridArray[r][c].isAliveNextGen());
	            }
	        }

	      
	        recomputeAll();
	    }

	 
	    public void computeGeneration(int n) {
	        if (n < 0) {
	            throw new IllegalArgumentException("n muss nicht-negativ sein.");
	        }
	        for (int i = 0; i < n; i++) {
	            computeNextGen();
	        }
	    }

	    private void recomputeAll() {
	        for (int r = 0; r < gridArray.length; r++) {
	            for (int c = 0; c < gridArray[0].length; c++) {
	                gridArray[r][c].countLivingNeighbors(gridArray);
	            }
	        }
}
}
