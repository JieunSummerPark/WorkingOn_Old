import java.util.Scanner;

public class Plinko_Joey_02 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		introduction();

		String userName = input.nextLine();
		double pointCount = getPointCount();
		announceResults(userName, pointCount);
		bonusPoints(userName, pointCount);

		input.close();
	}
	private static void introduction() {
		System.out.println("This simulation aims to replicate the feeling of playing Plinko.");
		System.out.println("You will earn points based solely on chance. How fun!");
		System.out.print("Please enter your name: ");
	}
	public static double getPointCount() {
		double pointCount = Math.random() * 9 + 1;
		return pointCount;
	}
	public static void announceResults(String userName, double pointCount) {
		if (pointCount < 3)
			System.out.println("Better luck next time! " + userName + " only managed to collect " + (int)(pointCount) + " points.");
		else
			System.out.println("Good job! " + userName + " collected " + (int)(pointCount) + " points.");
	}
	public static int bonusPoints(String userName, double pointCount) {
		int bonusPointCount = 32;
		return bonusPointCount;
	}
}
