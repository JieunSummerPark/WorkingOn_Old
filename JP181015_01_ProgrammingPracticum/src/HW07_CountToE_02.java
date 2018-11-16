import java.util.Scanner;

public class HW07_CountToE_02 {

	public static void main(String[] args) {
		
		// Create Scanner Object
		Scanner input = new Scanner(System.in);
		
		// Assign alphabets into array char[]
		char[] alphabet = new char[26];
		
		System.out.println("Which one do you want? Uppercase or Lowercase?");
		System.out.print("Write 'U' for uppercase, and 'L' for lowercase.\n: ");
		char uorl = input.next().charAt(0);
		
		if (uorl == 'U') {
			for (int i=0; i<26; i++) {
				alphabet[i] = (char)('A' + i);
				System.out.print(alphabet[i] + " ");
			}
		}
		else if (uorl == 'L') {
			for (int i=0; i<26; i++) {
				alphabet[i] = (char)('a' + i);
				System.out.print(alphabet[i] + " ");
			}
		}
		
		
		System.out.println("\n\nTo which character do you want to count?: ");
		char iwantthis = input.next().charAt(0);
		int number = (int)(iwantthis-'a'+1);
		
		System.out.println(number);
		
		for(int i=0; i<number; i++) {
			System.out.print(alphabet[i] + " ");
		}
		
		input.close();

	}

}