package h1;

public class H1_main {

	public static void main(String[] args) {
		 Cell[] start = new Cell[] {
		            new Cell(0, 4),
		            new Cell(1, 1),
		            new Cell(2, 2),
		            new Cell(2, 3),
		            new Cell(3, 1),
		            new Cell(3, 2)
		        };

		        Grid g = new Grid(start, 4, 5);
		        g.computeGeneration(2);

		     
		    }

		
		    private static void printGrid(Cell[][] a) {
		        for (Cell[] row : a) {
		            for (Cell cell : row) {
		                System.out.print(cell.isAlive() ? "1 " : "0 ");
		            }
		            System.out.println();
		        }

	}

}
