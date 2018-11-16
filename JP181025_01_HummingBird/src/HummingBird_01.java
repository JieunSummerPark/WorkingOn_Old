
public class HummingBird_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int merong;
		
		int speedOfServo = 0;
		  int repeat = 5;

		  for (int j=0; j<repeat; j++){

		    if (
		   
		      
		    if (knobSensor < (170*j)){
		    
		      speedOfServo *= j;

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
		    } // end of if
		  } // end of if

	}

}
