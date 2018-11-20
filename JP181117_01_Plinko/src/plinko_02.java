import java.util.Scanner;

public class plinko_02 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Welcome to Plinko game!");
		
		
		int row = 7;
		int col = 6;
		
		char[][] plinkoBoard = new char [row][col];
		
		for (int i=0; i<row; i++) {
			for (int j=0; j<col; j++) {
				
				System.out.print(plinkoBoard[i][j]+"\t");
			}
			System.out.println("");
		}
		
		
		System.out.print("Choose a number: ");

		int userinput = input.nextInt();
		System.out.println("You chose : " + userinput);

		

		input.close();

	}

}
