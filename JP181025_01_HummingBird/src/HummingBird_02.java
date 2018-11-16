import java.util.Scanner;

public class HummingBird_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);

		int merong;

		int speedOfServo = 10;
		int repeat = 6;
		int knobSensor = input.nextInt();

		for (int j=1; j<=repeat; j++) {
			if (knobSensor < (170*j)) {
				speedOfServo *= j;
				
				if (j==1) {
					merong.setTriColorLED(1,255,0,0);
				} else if (j==2) {
					merong.setTriColorLED(1,127,127,0);
				} else if (j==3) {
					merong.setTriColorLED(1,0,255,0);
				} else if (j==4) {
					merong.setTriColorLED(1,0,127,127);
				} else if (j==5) {
					merong.setTriColorLED(1,0,0,255);
				} else if (j==6) {
					merong.setTriColorLED(1,0,127,127);
				}
				
				// Step 1
				for (int i=0; i<90; i++) {
					merong.setServo(1,i);
					merong.setServo(2,180-i);
					delay(speedOfServo);
				}

				// Step 2
				for (int i=180; i>30; i--) {
					merong.setServo(1,i);
					merong.setServo(3,i);
					delay(sppedOfServo);
				}

				// Step 3
				for (int i=90; i<180; i++) {
					merong.setServo(1,i);
					merong.setServo(2,180-i);
					delay(speedOfServo);
				}

				// Step 4
				for (int i=30; i>0; i--) {
					merong.setServo(3,i);
					delay(sppedOfServo);
				}

				// Step 5
				for (int i=180; i>0; i--) {
					merong.setServo(1,i);
					merong.setServo(2,180-i);
					merong.setServo(3,180-i);
					delay(speedOfServo);
				}
				
				// Step Done

			} // End of if
		} // End of big for


		input.close();
	}

}
