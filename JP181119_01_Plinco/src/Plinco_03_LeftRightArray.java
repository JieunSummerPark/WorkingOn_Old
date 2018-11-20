
public class Plinco_03_LeftRightArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int direction = (int)(Math.random() * 3 - 1);
		
		
		int boardLength = 9;
		int boardWidth = 9;
		String[][] plinkoBoard = new String[boardLength][boardWidth];
		
		for (int i=0; i<plinkoBoard.length; i++) {
			for (int j=0; j<plinkoBoard[i].length; j++) {
				plinkoBoard[i][j] = " X ";
				System.out.print(plinkoBoard[i][j]);
			}
			System.out.println("");
		}
		
		
		
		switch (direction+2) {
		case 0: ; 
		}
		
		

	}

}
