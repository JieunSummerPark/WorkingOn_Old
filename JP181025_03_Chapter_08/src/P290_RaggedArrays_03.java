
public class P290_RaggedArrays_03 {

	public static void main(String[] args) {
		
		int row = 5;
		int col = 5;
		
		int[][] hurray = new int [row][col];
		
		/*for (int k=0; k<(row*col); k++) {*/
			for (int i=0; i<row; i++) {
				for (int j=0; j<col; j++) {
					for (int k=0; k<row*col; k++) {
						hurray[i][j] = k;
						System.out.print(hurray[i][j]+"\t");
					}
					System.out.println("");
				}
				System.out.println("");
			}
			System.out.println("");
		//}

		
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
