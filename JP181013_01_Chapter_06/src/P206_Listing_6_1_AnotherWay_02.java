import java.util.Scanner;

public class P206_Listing_6_1_AnotherWay_02 {

	public static void main(String[] args) {
		
		Scanner number = new Scanner(System.in);
		
		System.out.print("First Number: ");
		int num1 = number.nextInt();
		
		System.out.print("Second Number: ");
		int num2 = number.nextInt();
		
		int maximum = max(num1, num2);
		
		if(num1==num2) {
			System.out.println("\nThey are same.");
		} else {
			System.out.println("\nThe larger number is " + maximum);
		}
		
		
		number.close();
	}

	private static int max(int num1, int num2) {
		
		int result = 0;
		
		if (num1>num2)
			result = num1;
		else if (num1<num2)
			result = num2;

		return result;
	}

}
