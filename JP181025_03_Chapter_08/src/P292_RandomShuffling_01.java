
public class P292_RandomShuffling_01 {
	
	public static void main(String[] args) {
		
		int row = 4;
		int col = 5;
		
		int[][] matrix = new int [row][col];
		
		for (int i=0; i<matrix.length; i++) {
			for (int j=0; j<matrix[i].length; j++) {
				int mi = (int)(Math.random() * matrix.length);
				int mj = (int)(Math.random() * matrix.length);
				
				// Swap matrix[i][j] with matrix[mi][mj]
				int temp = matrix[i][j];
				matrix[i][j] = matrix[mi][mj];
				matrix[mi][mj] = temp;
			}
		}
		
		for (int i=0; i<matrix.length; i++) {
			for (int j=0; j<matrix[i].length; j++) {
				System.out.print(matrix[i][j]+"\t");
			}
			System.out.println("");
		}

	}

}
