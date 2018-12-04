import java.util.Scanner;
public class HW08_CountToEE_04_04_Done {
	public static void main(String[] args) { 
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Do you want for it to be square? Press 1 for yes, or 2 for no: ");
		int syorn = input.nextInt(); // syorn: square yes or no
		System.out.println("");
		
		int row = 0;
		int col = 0;
		
		if (syorn == 1) {
			System.out.print("How big do you want for the square?: ");
			row = col = input.nextInt();
			System.out.println("");
		} else if (syorn == 2) {
			System.out.print("How many rows do you want?: ");
			row = input.nextInt();
			System.out.print("How many columns do you want?: ");
			col = input.nextInt();
			System.out.println("");
		}
		
		if(row<=26 && col<=26) {
			if (syorn==1 || syorn==2) {
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
			else {
				System.out.println("ERROR: You should press only 1 or 2.");
			}
		} else {
			System.out.println("ERROR: You should write a number under 26.");
		}
		
		
		input.close();
	}
}