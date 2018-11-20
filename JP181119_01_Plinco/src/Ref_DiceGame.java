import java.util.Scanner;

public class Ref_DiceGame {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter your name: ");
		String username = input.nextLine();
		System.out.println("The username is " + username);

		char KeepGoingCheck;
		boolean keepGoing = true;

		while(keepGoing) {

			int userDice = (int)(Math.random() * 6 + 1);
			int computerDice = (int)(Math.random() * 6 + 1);

			System.out.println("");

			if (userDice > computerDice) {
				System.out.println("The number of " + username + "'s Dice is " + userDice + ".");
				System.out.println("The number of computer's Dice is " + computerDice + ".");
				System.out.println("So, user is won!");
			} else if (userDice < computerDice) {
				System.out.println("The number of " + username + "'s Dice is " + userDice + ".");
				System.out.println("The number of computer's Dice is " + computerDice + ".");
				System.out.println("So, computer is won!");
			} else {
				System.out.println("The number of both's dices are " + userDice + ".");
				System.out.println("Let's call it a tie.");
			}

			System.out.print("\nDo you wanna play again? Press Y for yes, or N for no: ");
			KeepGoingCheck = input.next().charAt(0);
			KeepGoingCheck = Character.toUpperCase(KeepGoingCheck);
			if(KeepGoingCheck == 'n') {
				System.out.println("\nThank you and good bye!");
			}
		}


		input.close();

	}

}