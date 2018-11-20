import java.util.Scanner;

public class Plinco_01 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		System.out.println("Welcome to Plinco!"
				+ "\nThis is a simulator for bonus points."
				+ "\nYou will enter your name, then get tokens, play, and receive bonus points.");
		
		System.out.println("");
		System.out.print("Please eneter your name: ");
		String userName = "Jieun Park";
		// String userName = input.nextLine();
		System.out.println("So, you are " + userName +".");

		input.close();

	}

}
