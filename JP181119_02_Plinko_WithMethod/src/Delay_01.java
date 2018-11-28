import java.util.concurrent.TimeUnit;

public class Delay_01 {

	public static void main(String[] args) {
		
		int timeToWait = 1;

		System.out.println("Please wait for " + timeToWait + " seconds.");

		try {
			for(int i=0; i<4; i++) {
				TimeUnit.SECONDS.sleep(timeToWait);
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("Thank you for waitting.");



	}

}
