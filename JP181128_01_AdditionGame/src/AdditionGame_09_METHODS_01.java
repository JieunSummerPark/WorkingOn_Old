import java.util.Scanner;

public class AdditionGame_09_METHODS_01 {

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
	public static double answeringTime;
	public static double totalTime = 0;

	public static char keepGoingCheck;
	public static boolean keepGoing = true;

	public static int heartCount = 3;
	public static int wrongCount;



	public static void main(String[] args) {

		/*
		System.out.print("Please enter your name:");
		userName = input.nextLine();
		 */
		userName = "UBER USER";

		accounceTheRule();

		while(keepGoing) {

			askToChooseCalculation();
			whichCalculation = input.nextInt();

			// TODO <DONE> 1,2,3,4 말고 다른 거 나왔을 떄 에러표시 만들기
			// TODO 에러 표시하고 다시 할래 말래 물어보기

			if (whichCalculation!=1 && whichCalculation!=2 && whichCalculation!=3 && whichCalculation!=4) {
				System.out.println("Try 1, 2, 3, or 4.");
				break;
			}

			System.out.println("\n");

			announceTheGameStart();

			System.out.println("\n");

			for (roundCounter = 1; roundCounter <= howManyGames; roundCounter++) {
				startTime = System.currentTimeMillis();
				computing();
				stopTime = System.currentTimeMillis();
				answeringTime = (stopTime - startTime) / 1000;
				totalTime += answeringTime;
				if (heartCount<=0) {
					announceGameOver();
					break;
				}
			}

			announceResult();
			announceHeartGAINorLOSE();

			// RESET
			correctCounter = 0;
			totalTime = 0;

			System.out.println(""
					+ "\nWould you like to try again?"
					+ "Press any key to try again OR Press '0' to stop: ");
			keepGoingCheck = input.next().charAt(0);
			if(keepGoingCheck == '0') {
				System.out.println("\n\nThank you and good bye.");
				keepGoing = false;
				break;
			}
		} // End of While Loop




		input.close();
	} /////////////////////////////////////////////////////////////////////////////////////// THE END of MAIN METHOD




	private static void accounceTheRule() {
		System.out.println(""
				+ "\n당신은 지금 3개의 하트를 가지고 있습니다."
				+ "\n결과에 따라 하트를 더 얻을수도, 잃을수도 있습니다."
				+ "\n하트를 다 잃으면 게임은 끝납니다."
				+ "\n하트가 30개를 넘어가면 게임은 엔딩을 맞이하게 됩니다.");
		System.out.println(""
				+ "\nFor now, you have 3 hearts."
				+ "\nYou will get or lose your hearts depends on your result."
				+ "\n(result = time and the number of wrong)."
				+ "\nWhen you lose all of your heart, you will lose."
				+ "\nwhen you get 30 heart or more than that,"
				+ "\n\n<< YOU WILL WIN THIS GAME >>");
	}
	
	
	
	
	private static void askToChooseCalculation() {
		System.out.print("\n"
				+ "\nWhich calculation do you want to do?"
				+ "\n1. Addition"
				+ "\n2. Subtraction"
				+ "\n3. Multiplication"
				+ "\n4. Division"
				+ "\n\nPlease choose : ");

	}
	
	
	
	
	private static void announceTheGameStart() {
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
	}
	
	
	
	
	private static void computing() {

		// TODO 나중에 나눗셈이랑 빼기는 ranNum1 더 큰걸로 정해주기
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
			correctCounter++;
			System.out.println("Correct!");
		} else if (answer != result) {
			--heartCount; wrongCount++;
			System.out.println("It's wrong.\nThe correct answer is " + result + "!");
			System.out.println("You lost 1 heart. Now " + userName + " has " + heartCount + " haerts.");
		}
		System.out.println("");

	}
	
	
	
	
	private static void announceGameOver() {
		System.out.println("\n\n"
				+ "\n---------------------------------------------------------"
				+ "\n-------------------------GameOver------------------------"
				+ "\n---------------------------------------------------------\n\n\n");
	}
	
	
	
	
	private static void announceResult() {
		scorePercentage = (correctCounter/(double)howManyGames) * 100;
		System.out.println(userName + "'s score is " + correctCounter + " out of " + howManyGames + ".");
		System.out.println(userName + "'s score is " + String.format("%.2f", scorePercentage) + "%.");
		System.out.println(userName + " took " + String.format("%.2f", totalTime) + " seconds.");
		System.out.println(userName + "'s average seconds per answer is " + String.format("%.2f", totalTime/howManyGames) + " seconds.");
	}
	
	
	
	
	private static void announceHeartGAINorLOSE() {
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

		if (heartCount>30) {
			System.out.println("");
		}
	}













	
	
	
	
	private static void Addition() {
		result = ranNum1 + ranNum2;
		System.out.print(roundCounter + ". " + ranNum1 + " + " + ranNum2 + " = ");
	}

	private static void Subtraction() {
		int max;
		if (ranNum2 > ranNum1) {
			max = ranNum2;
			ranNum2 = ranNum1;
			ranNum1 = max;
		}
		result = ranNum1 - ranNum2;
		System.out.print(roundCounter + ". " + ranNum1 + " - " + ranNum2 + " = ");
	}

	private static void Multiplication() {
		result = ranNum1 * ranNum2;
		System.out.print(roundCounter + ". " + ranNum1 + " X " + ranNum2 + " = ");	
	}

	private static void Division() {
		int max;
		if (ranNum2 > ranNum1) {
			max = ranNum2;
			ranNum2 = ranNum1;
			ranNum1 = max;
		}
		result = ranNum1 / ranNum2;
		System.out.print(roundCounter + ". " + ranNum1 + " / " + ranNum2 + " = ");
	}

}  /////////////////////////////////////////////////////////////////////////////////////// THE END of CLASS