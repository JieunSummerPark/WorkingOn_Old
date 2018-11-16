public class Quiz181024_01 {
	public static void main(String[] args) {
		
		int random1 = (int)(Math.random()*6)+1;
		int random2 = (int)(Math.random()*6)+1;
		
		int random3 = (int)(Math.random()*11)+2;
		
		int sum = random1 + random2;
		
		if (sum == random3)
			System.out.println("Lucky Genius");
		else
			System.out.println("Not this time");
		
		System.out.println("\nBecause");
		System.out.println("random1 was \t" + random1);
		System.out.println("random2 was \t" + random2);
		System.out.println("so the sum was \t" + sum);
		System.out.println("random3 was \t" + random3);
		
	}
}