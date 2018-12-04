
public class HW08_CountToEE_01 {

	public static void main(String[] args) {
		
		int row = 5;
		int column = 5;
		
		int count = 0;
		
		int[][] hurray = new int [row][column];
		
		for (int i=0; i<row; i++) {
			for (int j=0; j<column; j++) {
				hurray[i][j] = count++;
				System.out.print(hurray[i][j]+"\t");
			}
			System.out.println("");
		}

	}

}
