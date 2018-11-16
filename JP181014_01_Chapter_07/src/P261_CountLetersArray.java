
public class P261_CountLetersArray {
	/** Main Method */
	public static void main(String[] args) {
		
		// Declare and create an array
		char[] chars = createArray();
		
		// Display the array
		System.out.println("The lowercase letters are: ");
		displayArray(chars);
		
		// Count the occurrence of each letter
		int[] counts = countLetters(chars);
		
		// Display counts
		System.out.println();
		System.out.println("The occurrence of each letter are:");
		displayCounts(counts);

	}

	/** Create an array of characters */
	private static char[] createArray() {
		// Declare an array of characters and create it
		char[] chars = new char[100];
		
		// Create lowercase letters randomly and assign them to the array
		for (int i=0; i<chars.length; i++)
			chars[i] = RandomCharacter.getRandomLowerCaseLetter();
		
		// Return the array
		return chars;
	}
	
	/** Display the array of characters */
	private static void displayArray(char[] chars) {
		// Display the characters in the array 20 on each line
		for (int i=0; i<chars.length; i++) {
			if ((i + 1) % 10 == 0)
				System.out.print(chars[i] + "\n");
			else
				System.out.print(chars[i] + "\t");
		}
	}

	/** Count the occurrence of each letter */
	private static int[] countLetters(char[] chars) {
		// Declare and create an array of 26 int
		int[] counts = new int[26];
		
		// For each lowercase letter in the array, count it
		for (int i=0; i<chars.length; i++)
			counts[chars[i]-'a']++;
		
		return counts;
	}
	
	/** Display counts */
	public static void displayCounts(int[] counts) {
		for (int i = 0; i < counts.length; i++) {
			if ((i + 1) % 10 == 0)
				System.out.print(counts[i] + " " + (char)(i + 'a') + "\n");
			else
				System.out.print(counts[i] + " " + (char)(i + 'a') + "\t");
		}
	}
	
}
