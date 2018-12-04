import java.util.Scanner;

public class P128_ComparingAndTestingCharacters {

	public static void main(String[] args) {
		
		// Creat Scanner Object
		Scanner inputCharacter = new Scanner(System.in);
		
		System.out.print("input a character: ");
		char ch = inputCharacter.next().charAt(0);
		
		if (ch >= 'A' && ch <= 'Z')
			System.out.println(ch + " is an uppercase letter");
		else if (ch >= 'a' && ch <= 'z')
			System.out.println(ch + " is an lowercase letter");
		else if (ch >= '0' && ch <= '9')
			System.out.println(ch + " is a numeric character");
		
		inputCharacter.close();

	}

}
