
public class P206_Listing_6_1 {
	/** Main Method */
	public static void main(String[] args) {
		
		int i = 5;
		int j = 2;
		int k = max(i,j);
		
		System.out.println(k);
		
	}

	private static int max(int num1, int num2) {
		
		int result;
		
		if (num1>num2)
			result = num1;
		else
			result = num2;
		
		return result;
	}

}
