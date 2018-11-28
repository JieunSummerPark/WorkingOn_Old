import java.util.Scanner;

public class AdditionGame_01 {

	public static String userName;

	public static int roundCounter;
	public static int howManyGames = 7;

	public static int ranNum1;
	public static int ranNum2;
	public static int result;
	public static int answer;

	public static int correctCounter = 0;

	public static double scorePercentage;
	public static long temp = 3L;

	public static long startTime;
	public static long stopTime;
	public static long answerTime;
	public static double totalTime;



	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Please enter your name: ");
		userName = input.nextLine();
		System.out.println("You are " + userName + ".");

		System.out.println("");
		System.out.println("Let's start Addition Game.");
		System.out.println("");

		for (roundCounter = 1; roundCounter <= howManyGames; roundCounter++) {

			startTime = System.currentTimeMillis();

			ranNum1 = (int)(Math.random() * 10 + 1 );
			ranNum2 = (int)(Math.random() * 10 + 1 );
			result = ranNum1 + ranNum2;
			System.out.print(ranNum1 + "+" + ranNum2 + "=");
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
		System.out.println("Your score is " + correctCounter + " out of " + howManyGames + ".");
		System.out.println("Your score is " + String.format("%.2f", scorePercentage) + "%.");
		System.out.println("You took " + totalTime + " seconds.");
		System.out.println("And your average seconds per answer is " + String.format("%.2f", totalTime/howManyGames) + " seconds.");
		input.close();

	}

}