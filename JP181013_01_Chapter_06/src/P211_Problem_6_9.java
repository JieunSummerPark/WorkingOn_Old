
public class P211_Problem_6_9 {
	
	public static void main(String[] args) {
		
		System.out.println("hello");
		System.out.println(aMethod(3,5));
		bMethod(3,5);
		System.out.println("bye");

	}

	private static void bMethod(int i, int j) {
		
		if (i<j) {
			j--;
		}
		
		System.out.println(j);
		
	}

	public static double aMethod(double i, double j) {
		while (i<j) {
			j--;
		}
		return j;
	}

}
