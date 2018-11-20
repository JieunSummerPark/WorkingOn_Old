import java.util.Scanner;

public class Plinco_02_learnedFromClass {

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
		userName = "Jieun Park"; System.out.println("");
		// userName = input.nextLine();
		System.out.println("So, you are " + userName + ".");

		System.out.println("");
		tokenCount = (int)(Math.random() * 9 + 1);
		// System.out.println(userName + "has " + tokenCount + " tokens.");
		System.out.println(userName + " earned " + tokenCount + " tokens.");
		
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