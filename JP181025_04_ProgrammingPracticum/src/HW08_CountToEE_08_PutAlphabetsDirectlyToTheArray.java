import java.util.Scanner;
public class HW08_CountToEE_08_PutAlphabetsDirectlyToTheArray {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		// Prompt the user to choose Rectangle or Square.
		System.out.print("Which one do you want? Rectangle or Square? Press R for Rectangle or S for Square: ");
		char rors = input.next().charAt(0); // rors: rectangle or square
		rors = Character.toUpperCase(rors);
		System.out.println("");

		int row, col;

		// Prompt the user to choose how big the table is.
		if (rors == 'S') {
			System.out.print("How big do you want for the square?: ");
			row = col = input.nextInt();
			MakeATable(row, col);
		} else if (rors == 'R') {
			System.out.print("How many rows do you want?: ");
			row = input.nextInt();
			System.out.print("How many columns do you want?: ");
			col = input.nextInt();
			MakeATable(row, col);
		} else {
			System.out.println("ERROR: You should press only S or R");
		}

		input.close();
	} // End of void method

	private static void MakeATable(int row, int col) {
		System.out.println(""); // 이거 위에 적을까 밑에 적을까

		if (row<=0 || col<=0) {
			System.out.println("ERROR: You should write an natural number.");
		} else if (row<=26 && col<=26) {
			
			String[][] hooray = new String[row][col];

			for (int i=0; i<hooray.length; i++) {	// .length 말고 걍 row랑 col로 하면 안되나? 둘중에 뭐가 더 편할까?
				for (int j=0; j<hooray[i].length; j++) {
					String alRow = Character.toString((char)('A' + i));
					String alCol = Character.toString((char)('A' + j));	// char 여러개를 string오로 하는거 이렇게 하는거 맞나?
					hooray[i][j] = alRow + alCol;
					System.out.print(hooray[i][j]+"\t");
				}
				System.out.println("");
			} // End of for loop

		} else
			System.out.println("ERROR: You should write a number under 26.");

	} // end of make a table method
} // End of class