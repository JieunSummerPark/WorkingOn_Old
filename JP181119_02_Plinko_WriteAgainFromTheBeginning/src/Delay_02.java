import java.util.concurrent.TimeUnit;

public class Delay_02 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int timeToWait = 1;

		System.out.println("Please wait for " + timeToWait + " seconds.");
		
		try {
			TimeUnit.NANOSECONDS.sleep(100);
			TimeUnit.MICROSECONDS.sleep(100);
			TimeUnit.MILLISECONDS.sleep(100); 
			TimeUnit.SECONDS.sleep(100);
			TimeUnit.MINUTES.sleep(100);
			TimeUnit.HOURS.sleep(100);
			TimeUnit.DAYS.sleep(100);
		} catch (InterruptedException e) {
			//Handle exception }
			e.printStackTrace();
		}
		
		System.out.println("Thank you for waitting.");
		

	}
}
