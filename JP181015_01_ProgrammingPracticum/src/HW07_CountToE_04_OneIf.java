import java.util.Scanner;
public class HW07_CountToE_04_OneIf {
	public static void main(String[] args) {

		// Create Scanner Object
		Scanner input = new Scanner(System.in);
		
		// Make alphabet array
		char[] alphabet = new char[26];
		
		// Prompt the user to choose Uppercase or Lowercase
		System.out.println("STEP 1");
		System.out.println("Which one do you want? Uppercase or Lowercase?");
		System.out.print("Write 'U' for uppercase, and 'L' for lowercase.\n: ");
		char uorl = input.next().charAt(0);
		
		int number = 0;
		
		if (uorl == 'U') {
			System.out.println("You chose uppercase letter.");
			
			// Assign uppercase letters to alphabet[]
			for (int i=0; i<26; i++)
				alphabet[i] = (char)('A' + i);
			
			// Prompt the user to enter a uppercase letter
			System.out.println("\nSTEP 2");
			System.out.print("To which (uppercase) character do you want to count?\n: ");
			char iwantthis = input.next().charAt(0);
			
			// Save the uppercase letter that user chose to number
			number = (int)(iwantthis-'A'+1);
		}
		
		else if (uorl == 'L') {
			System.out.println("You chose lowercase letter.");
			
			// Assign lowercase letters to alphabet[]
			for (int i=0; i<26; i++)
				alphabet[i] = (char)('a' + i);
			
			// Prompt the user to enter a lowercase letter
			System.out.println("\nSTEP 2");
			System.out.print("To which (lower) character do you want to count?\n: ");
			char iwantthis = input.next().charAt(0);
			
			// Save the lowercase letter that user chose to number
			number = (int)(iwantthis-'a'+1);
		}
		
		
		System.out.print("\nRESULT\nHere it is!\n:");
		for(int i=0; i<number; i++) {
			System.out.print(" " + alphabet[i]);
		}
		
		input.close();

	}
}
