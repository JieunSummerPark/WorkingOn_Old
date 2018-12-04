import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class plinko_01_TimeDelay {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Welcome to Plinko game!");
		System.out.print("Choose a number: ");

		int userinput = input.nextInt();
		System.out.println("You chose : " + userinput);

		System.out.println("Wait");

		try {
			for(int i=0; i<4; i++) {
				TimeUnit.SECONDS.sleep(1/2);
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 

		System.out.println("Thank you for waitting");

		input.close();

	}

}
