import java.util.Scanner;

public class Plinco_07_StartForLoop {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		String username;
		int earnedToken;
		int leftToken;

		int boardLength = 9;
		int boardWidth = 9;

		String[] topLine = {" 1 ", " 2 ", " 3 ", " 4 ", " 5 ", " 6 ", " 7 ", " 8 ", " 9 "};
		String[][] plinkoBoard = new String[boardLength][boardWidth];
		int[] prizeArray = {100,200,300,400,500,400,300,200,100};

		int dropToken;

		int tokenSlot;
		int tokenPoints;
		int totalPoints = 0;





		System.out.println("");
		System.out.println("");
		System.out.println("");

		// print top line
		System.out.print("\t");
		for (int i=0; i<9; i++) {
			System.out.print(topLine[i] + "\t");
		}
		System.out.println("");

		// print XXXBoard
		for (int i=0; i<plinkoBoard.length; i++) {
			System.out.print("\t");
			for (int j=0; j<plinkoBoard[i].length; j++) {
				plinkoBoard[i][j] = "XXX";
				System.out.print(plinkoBoard[i][j] + "\t");
			}
			System.out.println("");
		}


		// print bottom line
		System.out.print("\t");
		for (int i=0; i<9; i++) {
			System.out.print(prizeArray[i] + "\t");
		}
		System.out.println("");


		System.out.println("");
		System.out.println("");
		System.out.println("");




		System.out.println("Welcome to Plinco!"
				+ "\nThis is a simulator for bonus points."
				+ "\nYou will enter your name, then get tokens, play, and receive bonus points.");		
		System.out.println("");
		System.out.println("Please enter your name: Jieun Park");
		username = "Jieun Park";
		//System.out.print("Please enter your name: ");
		//username = input.nextLine();
		System.out.println("So, you are " + username + ".");

		System.out.println("");
		earnedToken = (int)(Math.random() * 9 + 1);
		System.out.println(username + " earned " + earnedToken + " tokens.");

		// ----------

		leftToken = earnedToken;
		for (int gameCount = 1; gameCount <= earnedToken; gameCount++) {
			System.out.println("------------------------------------------------------------");
			System.out.println("");
			System.out.println("Round " + gameCount);
			System.out.print("Where would you like to drop your Plinco Token? (1-9): ");
			dropToken = input.nextInt();
			System.out.println(username + " chose " + dropToken + ".");

			System.out.println("");

			tokenSlot = (int)(Math.random() * 9 + 1);
			System.out.println("That token landed in slot " + tokenSlot);
			tokenPoints = prizeArray[tokenSlot-1];
			System.out.println("That token gained " + tokenPoints + " points.");
			totalPoints += tokenPoints;


			--leftToken;
			System.out.println("");
			System.out.println("You have " + leftToken + " tokens left.");
			System.out.println("");
			System.out.println("------------------------------------------------------------");
		}










		/*
		int direction = (int)(Math.random() * 3 - 1);

		switch (direction+2) {
		case 0: something; break;
		case 1: something; break;
		}
		 */







		System.out.println("");
		System.out.println(username + " earned " + totalPoints + " points.");












		input.close();

	}

}