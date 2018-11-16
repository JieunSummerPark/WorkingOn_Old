/*  There is an error in INT one
 *  But idk which one exactly is
 *  Fine it next time idk enough time now 
 */

public class DIY_01_IntSum_VS_DoubleSum {

	public static void main(String[] args) {
		
		int doubleRepeat = 13;
		int intRepeat = 13;
		int howManyNumbers = 100;
		
		double[] theDoubles = new double[doubleRepeat];
		double[] theInts = new double[doubleRepeat];
		
		
		for (int i=0; i<doubleRepeat; i++) {
			
			int[] array = new int[howManyNumbers];
			
			for (int j=0; j<howManyNumbers; j++) {
				array[j] = (int)(Math.random() * howManyNumbers + 1);
			}
			
			double sumA1 = 0;
			
			for (int j=0; j<howManyNumbers; j++) {
				sumA1 += array[j];
			}
			
			double averageA = sumA1/howManyNumbers;
			System.out.println(i+1 + "\tThe average of 100 random numbers is " + averageA);
			
			theDoubles[i] = averageA;
			
		}
		
		System.out.println("");
		
		for (int i=0; i<intRepeat; i++) {
			
			int[] array = new int[howManyNumbers];
			
			for (int j=0; j<100; j++) {
				array[i] = (int)(Math.random() * howManyNumbers + 1);
			}
			
			int sumB1 = 0;
			
			for (int j=0; j<howManyNumbers; j++) {
				sumB1 += array[i];
			}
			
			double averageB = sumB1/howManyNumbers;
			System.out.println(i+1 + "\tThe average of 100 random numbers is " + averageB);
			
			theInts[i] = averageB;

		}
		

		double sumA2 = 0;
		for (int j=0; j<doubleRepeat; j++) {
			sumA2 += theDoubles[j];
		}
		
		double sumB2 = 0;
		for (int j=0; j<intRepeat; j++) {
			sumB2 += theInts[j];
		}
		
		
		System.out.println("\nThe average of 100 double random numbers is " + sumA2/doubleRepeat);
		System.out.println("The average of 100 int random numbers is " + sumB2/intRepeat);
		
	}
}
