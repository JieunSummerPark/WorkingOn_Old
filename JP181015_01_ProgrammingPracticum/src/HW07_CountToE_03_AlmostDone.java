import java.util.Scanner;

public class HW07_CountToE_03_AlmostDone {

	public static void main(String[] args) {
		
		// Create Scanner Object
		Scanner input = new Scanner(System.in);
		
		// Make alphabet array
		char[] alphabet = new char[26];
		
		// Choose Uppercase or Lowercase
		System.out.println("Which one do you want? Uppercase or Lowercase?");
		System.out.print("Write 'U' for uppercase, and 'L' for lowercase.\n: ");
		char uorl = input.next().charAt(0);
		
		
		// Assign alphabets to the arrays
		if (uorl == 'U') {
			System.out.println("You choosed uppercase letter.");
			for (int i=0; i<26; i++)
				alphabet[i] = (char)('A' + i);
		} else if (uorl == 'L') {
			System.out.println("You choosed lowercase letter.");
			for (int i=0; i<26; i++)
				alphabet[i] = (char)('a' + i);
		}
		
		
		// Choose the character that the user want to count to
		System.out.print("\nTo which character do you want to count?\n: ");
		char iwantthis = input.next().charAt(0);
		
		
		int number = 0;
		if (uorl == 'U') {
			number = (int)(iwantthis-'A'+1);
		} else if (uorl =='L') {
			number = (int)(iwantthis-'a'+1);
		}
		
		for(int i=0; i<number; i++) {
			System.out.print(alphabet[i] + " ");
		}
		
		input.close();

	}

}
