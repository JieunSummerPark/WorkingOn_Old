import java.util.Scanner;

public class AdditionGame_07_LetsMakeGUI {

	public static Scanner input = new Scanner(System.in);

	public static String userName;

	public static int whichCalculation;
	
	public static int ranNum1;
	public static int ranNum2;
	public static int result;
	public static int answer;

	public static int roundCounter;
	public static int howManyGames = 7;
	public static int correctCounter = 0;

	public static double scorePercentage;

	public static double startTime;
	public static double stopTime;
	public static double answerTime;
	public static double totalTime = 0;

	public static char keepGoingCheck;
	public static boolean keepGoing = true;
	
	
	
	public static void main(String[] args) {

		System.out.print("Please enter your name: ");
		userName = input.nextLine();
		System.out.println("You are " + userName + ".");
		

		while(keepGoing) {
			
			System.out.print("\n"
					+ "\n1. Addition"
					+ "\n2. Subtraction"
					+ "\n3. Multiplication"
					+ "\n4. Division"
					+ "\n\nWhich calculation do you want to do? : ");
			whichCalculation = input.nextInt();
			// TODO 1,2,3,4 말고 다른 거 나왔을 떄 에러표시 만들기
			
			if (whichCalculation!=1 && whichCalculation!=2 && whichCalculation!=3 && whichCalculation!=4) {
				System.out.println("Try 1, 2, 3, or 4.");
				break;
			}
			
			System.out.println("\n");
			switch(whichCalculation) {
			case 1: System.out.println("Let's start Addition Game."); break;
			case 2: System.out.println("Let's start Subtraction Game."); break;
			case 3: System.out.println("Let's start Multiplication Game."); break;
			case 4: System.out.println("Let's start Division Game."); break;
			}

			for (roundCounter = 1; roundCounter <= howManyGames; roundCounter++) {
				startTime = System.currentTimeMillis();
				
				// TODO 나중에 나눗셈은 ranNum1 더 큰걸로 정해주기
				ranNum1 = (int)(Math.random() * 10 + 1 );
				ranNum2 = (int)(Math.random() * 10 + 1 );
				
				switch(whichCalculation) {
				case 1: Addition(); break;
				case 2: Subtraction(); break;
				case 3: Multiplication(); break;
				case 4: Division(); break;
				}
				
				answer = input.nextInt();
				if (answer == result) {
					System.out.println("Correct!");
					correctCounter++;
				} else if (answer != result) {
					System.out.println("It's wrong.\nThe correct answer is " + result + "!");
				}
				System.out.println("");
				
				stopTime = System.currentTimeMillis();
				answerTime = (stopTime - startTime) / 1000;
				totalTime += answerTime;
			}

			scorePercentage = (correctCounter/(double)howManyGames) * 100;
			System.out.println(userName + "'s score is " + correctCounter + " out of " + howManyGames + ".");
			System.out.println(userName + "'s score is " + String.format("%.2f", scorePercentage) + "%.");
			System.out.println(userName + " took " + String.format("%.2f", totalTime) + " seconds.");
			System.out.println(userName + "'s average seconds per answer is " + String.format("%.2f", totalTime/howManyGames) + " seconds.");

			// RESET
			correctCounter = 0;
			totalTime = 0;
			
			System.out.println("\n");
			System.out.println("Would you like to try again?");
			System.out.print("Press any key to try again OR Press '0' to stop: ");
			keepGoingCheck = input.next().charAt(0);
			if(keepGoingCheck == '0') {
				System.out.println("\n\nThank you and good bye.");
				keepGoing = false;
				break;
			}
		} // End of While Loop
		
		
		

		input.close();
	} // End of Main Method





	private static void Addition() {
		result = ranNum1 + ranNum2;
		System.out.print(ranNum1 + " + " + ranNum2 + " = ");
	}





	private static void Subtraction() {
		int max;
		if (ranNum2 > ranNum1) {
			max = ranNum2;
			ranNum2 = ranNum1;
			ranNum1 = max;
		}
		result = ranNum1 - ranNum2;
		System.out.print(ranNum1 + " - " + ranNum2 + " = ");
	}





	private static void Multiplication() {
		result = ranNum1 * ranNum2;
		System.out.print(ranNum1 + " X " + ranNum2 + " = ");	
	}





	private static void Division() {
		int max;
		if (ranNum2 > ranNum1) {
			max = ranNum2;
			ranNum2 = ranNum1;
			ranNum1 = max;
		}
		result = ranNum1 / ranNum2;
		System.out.print(ranNum1 + " / " + ranNum2 + " = ");
	}
	
	
	
}