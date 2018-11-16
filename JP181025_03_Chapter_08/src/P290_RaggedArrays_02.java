public class P290_RaggedArrays_02 {
	public static void main(String[] args) {
		
		int row = 5;
		int col = 5;
		
		int[][] hurray = new int [row][col];
		
		for (int k=0; k<(row*col); k++) {
			System.out.print("For K: " + k +"\t");
			for (int i=0; i<row; i++) {
				System.out.print("For I: " + i +"\t");
				for (int j=0; j<col; j++) {
					System.out.print("For J: " + j +"\t");
					hurray[i][j] = k;
				}
				System.out.println("");
			}
			System.out.println("");
		}

		
		System.out.println(hurray);
		System.out.println("");
		
		for (int i=0; i<row; i++) {
			for (int j=0; j<col; j++) {
				System.out.print(hurray[i][j]+"\t");
			}
			System.out.println("");
		}
		

	}
}
