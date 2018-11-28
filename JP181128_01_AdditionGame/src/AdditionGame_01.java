import java.util.Scanner;

public class AdditionGame_01 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter your name: ");
		String userName = input.nextLine();
		System.out.println("You are " + userName + ".");
		
		input.close();

	}

}