
public class P290_RaggedArrays_05 {
	public static void main(String[] args) {
		
		int row = 5;
		int column = 5;
		
		int count = 0;
		
		int[][] hooray = new int [row][column];
		
		for (int i=0; i<row; i++) {
			for (int j=0; j<column; j++) {
				hooray[i][j] = count++;
				System.out.print(hooray[i][j]+"\t");
			}
			System.out.println("");
		}
		
	}
}
