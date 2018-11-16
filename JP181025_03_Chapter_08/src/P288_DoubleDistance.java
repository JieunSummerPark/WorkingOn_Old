public class P288_DoubleDistance {
	public static void main(String[] args) {
		
		int[][] distance = {{0,2,3}, {2,4,6}};
		System.out.println(distance);
		System.out.println("");
		
		for (int i=0; i<2; i++) {
			for (int j=0; j<3; j++) {
				System.out.print(distance[i][j]+"\t");
			}
			System.out.println("");
		}
		
		
	}
}