import java.util.Scanner;

public class Plinco_04_CombinedWith_LeftRightArray {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		String userName;
		int tokenCount;
		int tokenSlot;
		int[] prizeArray = {100,200,300,400,500,400,300,200,100};
		int tokenPoints;
		int totalPoints = 0;

		System.out.println("Welcome to Plinco!"
				+ "\nThis is a simulator for bonus points."
				+ "\nYou will enter your name, then get tokens, play, and receive bonus points.");
		
		System.out.println("");
		System.out.print("Please eneter your name: ");
		userName = input.nextLine();
		System.out.println("So, you are " + userName + ".");

		System.out.println("");
		tokenCount = (int)(Math.random() * 9 + 1);
		System.out.println(userName + " earned " + tokenCount + " tokens.");
		
		
		
		int boardLength = 9;
		int boardWidth = 9;
		
		String[] topLine = {" 1 ", " 2 ", " 3 ", " 4 ", " 5 ", " 6 ", " 7 ", " 8 ", " 9 "};
		for (int i=0; i<9; i++) {
			System.out.print(topLine[i]);
		}
		System.out.println("");
		
		
		String[][] plinkoBoard = new String[boardLength][boardWidth];
		for (int i=0; i<plinkoBoard.length; i++) {
			for (int j=0; j<plinkoBoard[i].length; j++) {
				plinkoBoard[i][j] = " X ";
				System.out.print(plinkoBoard[i][j]);
			}
			System.out.println("");
		}
		
		
		String[] prizeArray2 = {"100","200","300","400","500","400","300","200","100"};
		for (int i=0; i<9; i++) {
			System.out.print(prizeArray2[i]);
		}
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