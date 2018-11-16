import java.util.Scanner;

public class P206_Listing_6_1_AnotherWay_01 {

	public static void main(String[] args) {
		
		Scanner number = new Scanner(System.in);
		
		System.out.print("First Number: ");
		double num1 = number.nextDouble();
		
		System.out.print("Second Number: ");
		double num2 = number.nextDouble();
		
		double maximum = max(num1, num2);
		
		System.out.println("The larger number is " + maximum);
		
		number.close();

	}

	private static double max(double i, double j) {
		
		double result = 0;
		
		if (i==j)
			System.out.println("Those are same.");
		if (i>j)
			result = i;
		else
			result = j;

		return result;
	}

}
