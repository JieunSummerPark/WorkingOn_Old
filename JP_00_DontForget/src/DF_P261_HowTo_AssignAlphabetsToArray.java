
public class DF_P261_HowTo_AssignAlphabetsToArray {

	public static void main(String[] args) {
		
		char[] alphabet = new char[26];
		
		for (int i=0; i<26; i++) {
			alphabet[i] = (char)('A' + i);
			System.out.print(alphabet[i] + " ");
		}

	}

}
