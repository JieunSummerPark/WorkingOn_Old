public class HW08_CountToEE_02_Done_ButNeedEdit {
	public static void main(String[] args) {
		
		int row = 5;
		int col = 5;
		
		char[] alphabetRow = new char[row];
		char[] alphabetCol = new char[col];
		
		String alRow = "";
		String alCol = "";
		
		String[][] hooray = new String[row][col];
		
		for (int i=0; i<row; i++) {
			for (int j=0; j<col; j++) {
				alphabetRow[i] = (char)('A' + i);
				alphabetCol[j] = (char)('A' + j);
				alRow = Character.toString(alphabetRow[i]);
				alCol = Character.toString(alphabetCol[j]);
				hooray[i][j] = alRow + alCol;
			}
		} // for loop for assign
		
		
		for (int i=0; i<row; i++) {
			for (int j=0; j<col; j++) {
				System.out.print(hooray[i][j]+"\t");
			}
			System.out.println("");
		} // for loop for printing

		
	}
}