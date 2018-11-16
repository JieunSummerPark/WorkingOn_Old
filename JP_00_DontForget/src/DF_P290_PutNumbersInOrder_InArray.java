// 2차원 배열에 순서대로 숫자 넣기

public class DF_P290_PutNumbersInOrder_InArray {

	public static void main(String[] args) {
		
		int row = 5;
		int column = 5;
		
		int count = 0;

		int[][] hurray = new int [row][column];

		// 배열에 숫자 채워넣는거
		System.out.println("1.");
		for (int i=0; i<row; i++) {
			for (int j=0; j<column; j++) {
				hurray[i][j] = count++;
			}
		}
		System.out.println("Done for 1.");
		
		// 채워진거 프린트만
		System.out.println("\n3.");
		for (int i=0; i<row; i++) {
			for (int j=0; j<column; j++) {
				System.out.print(hurray[i][j]+"\t");
			}
			System.out.println("");
		}
		System.out.println("Done for 3.");
		
		// 숫자 채워넣으면서 바로 프린트 하는거
		System.out.println("\n2.");
		for (int i=0; i<row; i++) {
			for (int j=0; j<column; j++) {
				hurray[i][j] = count++;
				System.out.print(hurray[i][j]+"\t");
			}
			System.out.println("");
		}
		System.out.println("Done for 2.");

		// 채워진거 프린트만
		System.out.println("\n3.");
		for (int i=0; i<row; i++) {
			for (int j=0; j<column; j++) {
				System.out.print(hurray[i][j]+"\t");
			}
			System.out.println("");
		}
		System.out.println("Done for 3.");

	}

}
