// 이거 이상함. 근데 지금 숙제를 먼저 하고싶으니 나중에 돌아오겠음

public class P292_RandomShuffling_02 {

	public static void main(String[] args) {
		
		int row = 4;
		int col = 5;
		
		int[][] matrix = new int [row][col];
		
		for (int i=0; i<matrix.length; i++) {
			for (int j=0; j<matrix[i].length; j++) {
				int i1 = (int)(Math.random() * matrix.length);
				int j1 = (int)(Math.random() * matrix.length);
				
				// Swap matrix[i][j] with matrix[i1][j1]
				int temp = matrix[i][j];
				matrix[i][j] = matrix[i1][j1];
				matrix[i1][j1] = temp;
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
