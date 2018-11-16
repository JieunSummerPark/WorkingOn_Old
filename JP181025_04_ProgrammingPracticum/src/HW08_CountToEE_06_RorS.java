import java.util.Scanner;
public class HW08_CountToEE_06_RorS {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Do you want for it to be rectangle or square? Press R for Rectangle, or S for Square: ");
		char rors = input.next().charAt(0); // rors: square yes or no
		System.out.println("");

		if (rors == 's' || rors == 'r') {
			rors = Character.toUpperCase(rors);
		}

		int row = 0;
		int col = 0;

		if (rors == 'S') {
			System.out.print("How big do you want for the square?: ");
			row = col = input.nextInt();
			System.out.println("");
		} else if (rors == 'R') {
			System.out.print("How many rows do you want?: ");
			row = input.nextInt();
			System.out.print("How many columns do you want?: ");
			col = input.nextInt();
			System.out.println("");
		} else {
			System.out.println("ERROR: You should press only S or R");
		}

		if(row<=26 && col<=26) {
			if (rors=='S' || rors=='R') {
				char[] alphabetRow = new char[row];
				char[] alphabetCol = new char[col];

				String alRow = "";
				String alCol = "";

				String[][] hooray = new String[row][col];

				for (int i=0; i<hooray.length; i++) {
					for (int j=0; j<hooray[i].length; j++) {
						alphabetRow[i] = (char)('A' + i);
						alphabetCol[j] = (char)('A' + j);
						alRow = Character.toString(alphabetRow[i]);
						alCol = Character.toString(alphabetCol[j]);
						hooray[i][j] = alRow + alCol;
						System.out.print(hooray[i][j]+"\t");
					}
					System.out.println("");
				} // End of for loop
			}
		} else {
			System.out.println("ERROR: You should write a number under 26.");
		}


		input.close();
	}
}