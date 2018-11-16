import java.util.Scanner;
public class HW07_CountToE_07_Again {
	public static void main(String[] args) {

		// Create Scanner Object
		Scanner input = new Scanner(System.in);

		char keepGoingCheck;
		boolean keepGoing = true;

		while(keepGoing) {
			askForLetter(input);
			System.out.print("\n\nWould you like to try again? Press Y for yes, or N for no: ");
			keepGoingCheck = input.next().charAt(0);
			keepGoingCheck = Character.toUpperCase(keepGoingCheck);
			System.out.println(" ");
			if(keepGoingCheck == 'N') {
				System.out.println("\nThank you and good bye.");
				keepGoing = false;
			}
		}

		input.close();

	} // end of main method

	private static void askForLetter(Scanner input) {

		int number = 0;
		char iwantthis;

		// Prompt the user to choose Upper case or Lower case
		System.out.println("STEP 1");
		System.out.println("Which one do you want? Upper case or Lower case?");
		System.out.print("Write 'U' for upper case, and 'L' for lower case.\n: ");
		char uorl = input.next().charAt(0);
		uorl = Character.toUpperCase(uorl);

		// Make alphabet array
		char[] alphabet = new char[26];
		if (uorl == 'U') {
			System.out.println("You chose upper case letter.");

			// Assign upper case letters to alphabet[]
			for (int i=0; i<26; i++)
				alphabet[i] = (char)('A' + i);

			// Prompt the user to enter a upper case letter
			System.out.println("\nSTEP 2");
			System.out.print("To which character do you want to count?\n: ");
			iwantthis = input.next().charAt(0);
			iwantthis = Character.toUpperCase(iwantthis);

			// Save the upper case letter that user chose to number
			number = (int)(iwantthis-'A'+1);
			printResult(number, alphabet);
		}

		else if (uorl == 'L') {
			System.out.println("You chose lower case letter.");

			// Assign lower case letters to alphabet[]
			for (int i=0; i<26; i++)
				alphabet[i] = (char)('a' + i);

			// Prompt the user to enter a lower case letter
			System.out.println("\nSTEP 2");
			System.out.print("To which character do you want to count?\n: ");
			iwantthis = input.next().charAt(0);
			iwantthis = Character.toLowerCase(iwantthis);

			// Save the lower case letter that user chose to number
			number = (int)(iwantthis-'a'+1);
			printResult(number, alphabet);
		}

		else {
			System.out.println("You entered wrong one.");
		}

	} // end of ask for letter method

	private static void printResult(int number, char[] alphabet) {
		System.out.print("\nRESULT\nHere it is!\n:");
		for(int i=0; i<number; i++) {
			System.out.print(" " + alphabet[i]);
		}
	} // end of print result method
}