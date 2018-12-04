import java.util.Scanner;
public class HW08_CountToEE_07_AddMethod {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Do you want for it to be rectangle or square? Press R for Rectangle or S for Square: ");
		char rors = input.next().charAt(0); // rors: rectangle or square
		rors = Character.toUpperCase(rors);
		System.out.println("");
		
		int row, col;
		
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
		System.out.println("");
		
		if (row<=0 || col<=0) {
			System.out.println("ERROR: You should write an natural number.");
		} else if (row<=26 && col<=26) {
			
			char[] alphabetRow = new char[row];
			char[] alphabetCol = new char[col];

			String[][] hooray = new String[row][col];

			for (int i=0; i<hooray.length; i++) {
				for (int j=0; j<hooray[i].length; j++) {
					alphabetRow[i] = (char)('A' + i);
					alphabetCol[j] = (char)('A' + j);
					String alRow = Character.toString(alphabetRow[i]);
					String alCol = Character.toString(alphabetCol[j]);
					hooray[i][j] = alRow + alCol;
					System.out.print(hooray[i][j]+"\t");
				}
				System.out.println("");
			} // End of for loop
			
		} else {
			System.out.println("ERROR: You should write a number under 26.");
		}

	} // end of make a table method
} // End of class