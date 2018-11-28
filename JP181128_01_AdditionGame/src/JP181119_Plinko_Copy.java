import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class JP181119_Plinko_Copy {

	public static String userName;
	public static int earnedToken;
	public static int leftToken;

	public static int slot;
	public static int boardSerial;
	public static int boardParallel;
	public static int leftORright;
	public static int gamePoints;
	public static int totalPoints;

	public static int[] topLine = {1,2,3,4,5,6,7,8,9};
	public static String[][] plinkoBoard = new String[11][9];
	public static int[] tokenLine = {1,2,3,4,5,4,3,2,1};
	public static int[] prizeLine = {100,200,300,400,500,400,300,200,100};

	public static int Delay = 500;	// Time delays 500 milliseconds when each token falls.

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		// Introduce and get user's name
		System.out.println(""
				+ "This simulation aims to replicate the feeling of playing Plinko."
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
		System.out.print(""
				+ "\nThis is the Plinko board for earning token."
				+ "\nFor now, you have 1 token."
				+ "\nYou need to play a token game to earn extra tokens for PLINKO game."
				+ "\nWhere would you like to drop your token?: ");
		slot = input.nextInt();
		System.out.println("\n" + userName + " chose (" + slot + ").");
		boardParallel = slot-1;

		// Token falls.
		System.out.println("\n\nTOKEN BOARD\n");
		putOOO();
		printTopLine();
		printTable_WithDelay();
		printTokenLine();

		// Announce user how many tokens user earned.
		System.out.println(""
				+ "\nThat token landed in slot (" + (boardParallel+1) + ")."
				+ "\n" + userName + " earned " + tokenLine[boardParallel] + " tokens."
				+ "\nLet's start the game with " + tokenLine[boardParallel] + " tokens.");

		printGameStart();

		earnedToken = tokenLine[boardParallel];		// Store a number from array to earnedToken.
		leftToken = earnedToken;					// At first, the number of left tokens is same as earned tokens. 


		// Show user the board with prize points.
		System.out.println("\n\n\nPLINKO BOARD\n");
		putXXX();
		printTopLine();
		printTable_WithoutDelay();
		printPrizeLine();
		System.out.println("\nThis is the PLINKO board for game. Choose a slot for points.");


		// Repeat Games depends on the number of earned tokens.
		for (int gameCount = 1; gameCount <= earnedToken; gameCount++) {

			System.out.print(""
					+ "\n\n\nROUND " + gameCount
					+ "\nWhere would you like to drop your token?: ");
			slot = input.nextInt();
			System.out.println(userName + " chose (" + slot + ").");	// Check the slot which user chose.
			boardParallel = slot-1;

			// Token Falls.
			System.out.println("\nPLINKO BOARD " + gameCount + "\n");
			putXXX();
			putOOO();
			printTopLine();
			printTable_WithDelay();
			printPrizeLine();

			--leftToken;
			gamePoints = prizeLine[boardParallel];
			totalPoints += gamePoints;
			System.out.println(""
					+ "\nThat token landed in slot (" + (boardParallel+1) + ")."
					+ "\nThat token gained " + gamePoints + " points."
					+ "\nYou have " + leftToken + " tokens left.");
		}

		printGameOver();


		if (totalPoints < 1000)
			System.out.println("Better luck next time! " + userName + " only managed to collect " + totalPoints + " points.");
		else
			System.out.println("Good job! " + userName + " collected " + totalPoints + " points.");

		input.close();

	}

	private static void printGameStart() {
		System.out.println(""
				+ "\n\n\n\n-----------------------------------------------------------------------------"
				+ "\n----------------------------------GameStart----------------------------------"
				+ "\n-----------------------------------------------------------------------------");
	}

	private static void printGameOver() {
		System.out.println(""
				+ "\n\n\n-----------------------------------------------------------------------------"
				+ "\n----------------------------------GameOver-----------------------------------"
				+ "\n-----------------------------------------------------------------------------\n\n\n");
	}

	// Put " O " on track of table to simulate token drops.
	public static void putOOO() {
		plinkoBoard[0][boardParallel] = " O ";
		for (boardSerial=1; boardSerial<plinkoBoard.length; boardSerial++) {
			if (boardParallel>0 && boardParallel<8) {
				int ranNum = (int)(Math.random() * 2);
				if (ranNum == 0)
					leftORright = 1;
				else if (ranNum == 1)
					leftORright = -1;
			} else if (boardParallel==0) {
				leftORright = 1;
			} else if (boardParallel==8) {
				leftORright = -1;
			}
			boardParallel += leftORright;
			plinkoBoard[boardSerial][boardParallel] = " O ";
		}
	}

	// Put "XXX" on every table to reset table.
	public static void putXXX() {
		for (int i=0; i<plinkoBoard.length; i++) {
			for (int j=0; j<plinkoBoard[i].length; j++) {
				plinkoBoard[i][j] = "XXX";
			}
		}
	}

	public static void printTopLine() {
		System.out.print("\t");
		for (int i=0; i<9; i++)
			System.out.print("("+topLine[i]+")" + "\t");
		System.out.println("");
	}

	// Print the table which has putted by " O " or "XXX".
	public static void printTable_WithoutDelay() {
		for (int i=0; i<plinkoBoard.length; i++) {
			System.out.print("\t");
			for (int j=0; j<plinkoBoard[i].length; j++)
				System.out.print(plinkoBoard[i][j] + "\t");				
			System.out.println("");
		}
	}

	// Print the table which has put by " O " or "XXX".
	// With time delay
	public static void printTable_WithDelay() {
		for (int i=0; i<plinkoBoard.length; i++) {
			System.out.print("\t");
			for (int j=0; j<plinkoBoard[i].length; j++)
				System.out.print(plinkoBoard[i][j] + "\t");				
			System.out.println("");
			try {	// This is Time delay code. It makes delays between each line.
				for(int k=0; k<1; k++) {
					TimeUnit.MILLISECONDS.sleep(Delay);
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public static void printTokenLine() {
		System.out.print("\t");
		for (int i=0; i<9; i++)
			System.out.print(" " + tokenLine[i] + "\t");
		System.out.println("");
	}

	public static void printPrizeLine() {
		System.out.print("\t");
		for (int i=0; i<9; i++)
			System.out.print(prizeLine[i] + "\t");
		System.out.println("");
	}

}