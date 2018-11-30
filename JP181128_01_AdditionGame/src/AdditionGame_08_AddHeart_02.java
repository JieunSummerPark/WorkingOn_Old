import java.util.Scanner;

public class AdditionGame_08_AddHeart_02 {

	public static Scanner input = new Scanner(System.in);

	public static String userName;

	public static int whichCalculation;

	public static int ranNum1;
	public static int ranNum2;
	public static int result;
	public static int answer;

	public static int roundCounter;
	public static int howManyGames = 10;
	public static int correctCounter = 0;

	public static double scorePercentage;

	public static double startTime;
	public static double stopTime;
	public static double answerTime;
	public static double totalTime = 0;

	public static char keepGoingCheck;
	public static boolean keepGoing = true;

	public static int heartCount = 3;
	public static int wrongCount;



	public static void main(String[] args) {

		System.out.print("Please enter your name: ");
		userName = input.nextLine();

		System.out.println(""
				+ "\nYou, " + userName + " has " + heartCount + " hearts.");


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
			case 1: System.out.println("\n\n"
					+ "\n---------------------------------------------------------"
					+ "\n-------------------AdditionGame-START--------------------"
					+ "\n---------------------------------------------------------\n\n\n");
					break;
			case 2: System.out.println("\n\n"
					+ "\n---------------------------------------------------------"
					+ "\n-----------------SubtractionGame-START-------------------"
					+ "\n---------------------------------------------------------\n\n\n");
					break;
			case 3: System.out.println("\n\n"
					+ "\n---------------------------------------------------------"
					+ "\n----------------MultiplicationGame-START-----------------"
					+ "\n---------------------------------------------------------\n\n\n");
					break;
			case 4: System.out.println("\n\n"
					+ "\n---------------------------------------------------------"
					+ "\n-------------------DivisionGame-START--------------------"
					+ "\n---------------------------------------------------------\n\n\n");
					break;
			}
			System.out.println("\n");

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
					--heartCount;
					wrongCount++;
					System.out.println("You lost 1 heart. Now you have " + heartCount + " haerts.");
				}
				System.out.println("");

				stopTime = System.currentTimeMillis();
				answerTime = (stopTime - startTime) / 1000;
				totalTime += answerTime;

				if (heartCount<=0) {
					System.out.println("\n\n"
							+ "\n---------------------------------------------------------"
							+ "\n-------------------------GameOver------------------------"
							+ "\n---------------------------------------------------------\n\n\n");
					break;
				}
			}

			scorePercentage = (correctCounter/(double)howManyGames) * 100;
			System.out.println(userName + "'s score is " + correctCounter + " out of " + howManyGames + ".");
			System.out.println(userName + "'s score is " + String.format("%.2f", scorePercentage) + "%.");
			System.out.println(userName + " took " + String.format("%.2f", totalTime) + " seconds.");
			System.out.println(userName + "'s average seconds per answer is " + String.format("%.2f", totalTime/howManyGames) + " seconds.");

			System.out.println("");
			if (wrongCount < 3) {
				if (scorePercentage > 90) {
					heartCount += 3;
					System.out.println("Your score is above 90%! You get 3 more hearts.");
				}

				if ((totalTime/howManyGames) < 1) {
					heartCount += 5;
					System.out.println("You are so fast! You get 5 more hearts.");
				} else if ((totalTime/howManyGames) < 2) {
					heartCount += 1;
					System.out.println("You are pretty fast! You get 1 more hearts.");
				}

				System.out.println("\nNow you have " + heartCount + " hearts.");
			} else if (wrongCount >5) {
				if (heartCount>0) {
					System.out.println("Don't give up! You can do it!");
				} else {
					System.out.println("Better luck next time...!");
				}
			}
			
			if (heartCount>50) {
				System.out.println("");
			}




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