
public class DF_P261_HowTo_CutPer10Letters {

	public static void main(String[] args) {
		
		char[] alphabet = new char[26];
		
		for (int i=0; i<26; i++) {
			
			alphabet[i] = (char)('A' + i);
			
			if ((i+1)%10 == 0) {	
				System.out.print(alphabet[i] + "\n");
			}
			else {
				System.out.print(alphabet[i] + " ");
			}
			
		}

	}

}
