import java.util.Scanner;

public class P209_Listing_6_2_TestVoidMethod_WithScanner {
	public static void main(String[] args) {
		
		Scanner grade = new Scanner(System.in);
		
		System.out.print("Put your math grade: ");
		double mathScore = grade.nextDouble();
		printGrade(mathScore);
		
		System.out.print("ut your science grade: ");
		double scienceScore = grade.nextDouble();
		printGrade(scienceScore);
		
		grade.close();
	}

	private static void printGrade(double score) {
		
		if (score > 100 || score < 0 )
			System.out.println("That's wrong.");
		else if (score >= 90.0)
			System.out.println("Your grade is A.");
		else if (score >= 80.0)
			System.out.println("Your grade is B.");
		else if (score >= 70.0)
			System.out.println("Your grade is C.");
		else if (score >= 60.0)
			System.out.println("Your grade is D.");
		else
			System.out.println("Your grade is F.");
		
	}
}
