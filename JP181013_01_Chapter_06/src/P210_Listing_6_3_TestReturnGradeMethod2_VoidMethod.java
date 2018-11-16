
public class P210_Listing_6_3_TestReturnGradeMethod2_VoidMethod {

	public static void main(String[] args) {
		System.out.print("The Grade is ");
		getGrade(78.5);
		System.out.print("The Grade is ");
		getGrade(98.5);
	}

	private static void getGrade(double score) {
		if (score < 0 || score > 100) {
			System.out.println("Invalid Score");
			return;
		}
		else if (score >= 90.0)
			System.out.println('A');
		else if (score >= 80.0)
			System.out.println('B');
		else if (score >= 70.0)
			System.out.println('C');
		else if (score >= 60.0)
			System.out.println('D');
		else
			System.out.println('F');
	}

}
