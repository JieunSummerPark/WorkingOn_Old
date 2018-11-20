import java.util.Scanner;

public class Plinco_05_Tab {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		String userName;
		int tokenCount;
		int tokenSlot;
		int tokenPoints;
		int totalPoints = 0;

		System.out.println("Welcome to Plinco!"
				+ "\nThis is a simulator for bonus points."
				+ "\nYou will enter your name, then get tokens, play, and receive bonus points.");		
		System.out.println("");
		System.out.println("Please enter your name: Jieun Park");
		userName = "Jieun Park";
		//System.out.print("Please enter your name: ");
		//userName = input.nextLine();
		System.out.println("So, you are " + userName + ".");

		System.out.println("");
		tokenCount = (int)(Math.random() * 9 + 1);
		System.out.println(userName + " earned " + tokenCount + " tokens.");

		
		
		
		
		
		System.out.println("");
		System.out.println("");
		System.out.println("");
		
		int boardLength = 9;
		int boardWidth = 9;
		
		String[] topLine = {" 1 ", " 2 ", " 3 ", " 4 ", " 5 ", " 6 ", " 7 ", " 8 ", " 9 "};
		System.out.print("\t");
		for (int i=0; i<9; i++) {
			System.out.print(topLine[i] + "\t");
		}
		System.out.println("");
		
		
		String[][] plinkoBoard = new String[boardLength][boardWidth];
		for (int i=0; i<plinkoBoard.length; i++) {
			System.out.print("\t");
			for (int j=0; j<plinkoBoard[i].length; j++) {
				plinkoBoard[i][j] = "XXX";
				System.out.print(plinkoBoard[i][j] + "\t");
			}
			System.out.println("");
		}
		
		
		int[] prizeArray = {100,200,300,400,500,400,300,200,100};
		System.out.print("\t");
		for (int i=0; i<9; i++) {
			System.out.print(prizeArray[i] + "\t");
		}
		System.out.println("");
		
		System.out.println("");
		System.out.println("");
		System.out.println("");
		
		
		
		
		
		

		
		System.out.print("Where would you like to drop your Plinco Token? (1-9): ");
		int dropToken = input.nextInt();
		System.out.println(userName + " chose " + dropToken + ".");
		
		
		
		
		
		
		/*
		int direction = (int)(Math.random() * 3 - 1);
		
		switch (direction+2) {
		case 0: something; break;
		case 1: something; break;
		}
		*/
		
		
		
		
		
		System.out.println("");
		for (int tokenIndex = 1; tokenIndex <= tokenCount; tokenIndex++) {
			tokenSlot = (int)(Math.random() * 9 + 1);
			System.out.println("That token landed in slot " + tokenSlot);
			tokenPoints = prizeArray[tokenSlot-1];
			System.out.println("That token gained " + tokenPoints + " points.");
			totalPoints += tokenPoints;
		}
		
		System.out.println("");
		System.out.println(userName + " earned " + totalPoints + " points.");

		
		
		
		
		
		
		
		
		
		

		input.close();

	}

}