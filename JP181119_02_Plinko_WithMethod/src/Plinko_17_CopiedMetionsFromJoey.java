import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Plinko_17_CopiedMetionsFromJoey {

	static String userName;
	static int earnedToken, leftToken;

	private static int slot;
	private static int tokenSerial;
	private static int tokenParallel;
	private static int ranNum;
	private static int tokenPoints;
	private static int totalPoints;

	private static int[] topLine = {1,2,3,4,5,6,7,8,9};
	private static String[][] plinkoBoard = new String[10][9];
	private static int[] tokenArray = {1,2,3,4,5,4,3,2,1};
	private static int[] prizeArray = {100,200,300,400,500,400,300,200,100};

	static int timeToWait = 500;


	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		// Introduce and get user's name
		System.out.println("This simulation aims to replicate the feeling of playing Plinko."
				+ "\nYou will earn points based solely on chance. How fun!");
		System.out.print("Please enter your name: ");
		userName = input.nextLine();
		System.out.println("You are " + userName + ".");

		// Show user a board with the number of token.
		System.out.println("\n\nTOKEN BOARD\n");
		putXXX();
		printTopLine();
		printTable_WithoutDelay();
		printTokenLine();
		System.out.print("\nThis is a Plinko board for earning token."
				+ "\nFor now, you have 1 token."
				+ "\nYou need to play a token game to earn extra tokens for PLINKO game."
				+ "\nWhere would you like to drop your token?: ");
		slot = input.nextInt();
		System.out.println("\n" + userName + " chose (" + slot + ").");
		tokenParallel = slot-1;

		// Token falls.
		System.out.println("\n\nTOKEN BOARD\n");
		putOOO();
		printTopLine();
		printTable_WithDelay();
		printTokenLine();

		// Announce user how many tokens user earned.
		System.out.println("\nThat token landed in slot " + (tokenParallel+1) + "."
				+ "\n" + userName + " earned " + tokenArray[tokenParallel] + " tokens."
				+ "\nLet's start the game with " + tokenArray[tokenParallel] + " tokens.");

		earnedToken = tokenArray[tokenParallel];	// Save a number from array to earnedToken.
		leftToken = earnedToken;					// At first, the number of left tokens is same as earned tokens. 


		// Show user the board with prize points.
		System.out.println("\n\n\nPLINKO BOARD\n");
		putXXX();
		printTopLine();
		printTable_WithoutDelay();
		printPrizeLine();
		System.out.println("\nThis is PLINKO board for game. Choose a slot for points.");


		// Repeat Games depends on the number of earned tokens.
		for (int gameCount = 1; gameCount <= earnedToken; gameCount++) {

			System.out.print("\n\n\nROUND " + gameCount
					+ "\nWhere would you like to drop your token?: ");
			slot = input.nextInt();
			System.out.println(userName + " chose (" + slot + ").");	// Check the slot which user chose.
			tokenParallel = slot-1;

			// Token Falls.
			System.out.println("\nPLINKO " + gameCount + "\n");
			putXXX();
			putOOO();
			printTopLine();
			printTable_WithDelay();
			printPrizeLine();

			--leftToken;
			tokenPoints = prizeArray[tokenParallel];
			totalPoints += tokenPoints;
			System.out.println("\nThat token landed in slot " + (tokenParallel+1) + "."
					+ "\nThat token gained " + tokenPoints + " points."
					+ "\nYou have " + leftToken + " tokens left.");


		}

		System.out.println("\n\n\nTHE END");
		
		if (totalPoints < 1000)
			System.out.println("Better luck next time! " + userName + " only managed to collect " + totalPoints + " points.");
		else
			System.out.println("Good job! " + userName + " collected " + totalPoints + " points.");

		input.close();

	}


	private static void putOOO() {

		for (tokenSerial=0; tokenSerial<plinkoBoard.length; tokenSerial++) {

			if (tokenParallel>0 && tokenParallel<8) {

				int plusORminus = (int)(Math.random() * 2);

				if (plusORminus == 0)
					ranNum = 1;
				else if (plusORminus == 1)
					ranNum = -1;

			} else if (tokenParallel==0) {
				ranNum = 1;
			} else if (tokenParallel==8) {
				ranNum = -1;
			}

			tokenParallel += ranNum;
			plinkoBoard[tokenSerial][tokenParallel] = " O ";
		}

	}

	private static void putXXX() {

		for (int i=0; i<plinkoBoard.length; i++) {
			for (int j=0; j<plinkoBoard[i].length; j++) {
				plinkoBoard[i][j] = "XXX";
			}
		}

	}

	private static void printTopLine() {

		System.out.print("\t");
		for (int i=0; i<9; i++) {
			System.out.print("("+topLine[i]+")" + "\t");
		}
		System.out.println("");

	}

	private static void printTable_WithoutDelay() {

		for (int i=0; i<plinkoBoard.length; i++) {
			System.out.print("\t");
			for (int j=0; j<plinkoBoard[i].length; j++) {
				System.out.print(plinkoBoard[i][j] + "\t");				
			}
			System.out.println("");
		}

	}

	private static void printTable_WithDelay() {

		for (int i=0; i<plinkoBoard.length; i++) {
			System.out.print("\t");
			for (int j=0; j<plinkoBoard[i].length; j++) {
				System.out.print(plinkoBoard[i][j] + "\t");				
			}
			System.out.println("");

			try {
				for(int k=0; k<1; k++) {
					TimeUnit.MILLISECONDS.sleep(timeToWait);
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}


		}

	}

	private static void printTokenLine() {

		System.out.print("\t");
		for (int i=0; i<9; i++) {
			System.out.print(" " + tokenArray[i] + "\t");
		}
		System.out.println("");

	}

	private static void printPrizeLine() {

		System.out.print("\t");
		for (int i=0; i<9; i++) {
			System.out.print(prizeArray[i] + "\t");
		}
		System.out.println("");

	}

}
