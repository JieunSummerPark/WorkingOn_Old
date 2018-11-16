
public class P210_Listing_6_3_TestReturnGradeMethod {

	public static void main(String[] args) {
		System.out.println("The Grade is " + getGrade(78.5));
		System.out.println("The Grade is " + getGrade(59.5));
	}

	private static char getGrade(double score) {
		if (score >= 90.0)
			return 'A';
		else if (score >= 80.0)
			return 'B';
		else if (score >= 70.0)
			return 'C';
		else if (score >= 60.0)
			return 'D';
		else
			return 'F';
	}

}
