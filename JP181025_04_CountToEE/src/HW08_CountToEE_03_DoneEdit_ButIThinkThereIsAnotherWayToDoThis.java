public class HW08_CountToEE_03_DoneEdit_ButIThinkThereIsAnotherWayToDoThis {
	public static void main(String[] args) {
		
		int row = 5;
		int col = 5;
		
		char[] alphabetRow = new char[row];
		char[] alphabetCol = new char[col];
		
		String alRow = "";
		String alCol = "";
		
		String[][] hooray = new String[row][col];
		
		for (int i=0; i<hooray.length; i++) {
			for (int j=0; j<hooray[i].length; j++) {
				alphabetRow[i] = (char)('A' + i);
				alphabetCol[j] = (char)('A' + j);
				alRow = Character.toString(alphabetRow[i]);
				alCol = Character.toString(alphabetCol[j]);
				hooray[i][j] = alRow + alCol;
				System.out.print(hooray[i][j]+"\t");
			}
			System.out.println("");
		} // End of for loop
		
	}
}