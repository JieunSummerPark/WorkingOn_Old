import java.util.Scanner;

public class Plinco_10 {
	
	static String username;
	static int earnedToken, leftToken;

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Welcome to Plinco!");
		System.out.print("Please enter your name: ");
		username = input.nextLine();
		System.out.println("You are " + username);
		
		earnedToken = leftToken = 1;
		
		System.out.println("Where would you like to drop your Plinko Token?");
		
		input.close();

	}

}
