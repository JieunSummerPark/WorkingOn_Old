import java.util.Scanner;

public class DIY_01_ArrayAverage {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the number of items: ");
		int n = input.nextInt();
		System.out.println("");
		
		double [] numbers = new double[n];
		double sum = 0;
		
		for (int i=0; i<n; i++) {
			System.out.print("Enter the " + (i+1) + "th numbers: ");
			numbers[i] = input.nextDouble();
			sum += numbers[i];
		}
		
		double average = sum/n;
		
		int count = 0;	// The number of elements above average
		for (int i=0; i<n; i++) {
			if (numbers[i] > average)
				count++;
		}
		
		System.out.println("");
		System.out.println("Average is " + average);
		System.out.println("Number of elements above the average is " + count);
		
		input.close();

	}

}