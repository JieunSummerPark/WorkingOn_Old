import java.util.Scanner;

public class DF_P037_Scanner {
	
	final static double PI = 3.141592;
	/*
	 * 상수는 메인함수 바깥쪽에 선언됨
	 * final:	한번 선언이 되면 절대로 바꿀 수 없음. 즉 상수의 의미
	 * static:	하나의 class에서 공유하는 자원
	 * double:	실수형을 의미
	 */

	public static void main(String[] args) {
		
		// Create a Scanner object
		Scanner input = new Scanner(System.in);
		
		// Prompt the user to enter a radius
		System.out.print("Enter a number for radius: ");
		double radius = input.nextDouble();
		
		// Compute area
		double area = radius * radius * PI;
		
		// Display results
		System.out.println("The area for the circle of radius " + radius + " is " + area);
		
		input.close();
	}

}