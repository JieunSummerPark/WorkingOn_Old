
public class P122_RoundingMethod {

	public static void main(String[] args) {
		
		int a=4;
		int b=4;
		int c=6;
		int d=7;
		
		double[] ceil = new double[a];
		double[] floor = new double[b];
		double[] rint = new double[c];
		double[] round = new double[d];
		
		ceil[0] = Math.ceil(2.1);
		ceil[1] = Math.ceil(2.0);
		ceil[2] = Math.ceil(-2.0);
		ceil[3] = Math.ceil(-2.1);
		
		floor[0] = Math.floor(2.1);
		floor[1] = Math.floor(2.0);
		floor[2] = Math.floor(-2.0);
		floor[3] = Math.floor(-2.1);
		
		rint[0] = Math.rint(2.1);
		rint[1] = Math.rint(-2.0);
		rint[2] = Math.rint(-2.1);
		rint[3] = Math.rint(2.5);
		rint[4] = Math.rint(4.5);
		rint[5] = Math.rint(-2.5);
		
		round[0] = Math.round(2.6f);
		round[1] = Math.round(2.0);
		round[2] = Math.round(-2.0f);
		round[3] = Math.round(-2.6);
		round[4] = Math.round(-2.4);
		round[5] = Math.round(2.5);
		round[6] = Math.round(-2.5);
		
		
		for (int i=0; i<a; i++) {
			System.out.print(ceil[i] + "\t");
		}
		
		System.out.println("");
		
		for (int i=0; i<b; i++) {
			System.out.print(floor[i] + "\t");
		}
		
		System.out.println("");
		
		for (int i=0; i<c; i++) {
			System.out.print(rint[i] + "\t");
		}
		
		System.out.println("");
		
		for (int i=0; i<d; i++) {
			System.out.print(round[i] + "\t");
		}
		
	}

}
