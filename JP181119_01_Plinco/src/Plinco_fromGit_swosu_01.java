public class Plinco_fromGit_swosu_01 {
 	public static void main(String[] args) {
		System.out.println("Hello.");


 		int chipCount = getChipCount();
 		int chipFinalRestingPlace;
 		int prize = 0;
 		for(int chipIndex = 1; chipIndex <= chipCount; chipIndex++) 
		{
			chipFinalRestingPlace = getChipFinalRestingPlace();
 			prize = prize + getPrize(chipFinalRestingPlace);
		}
		
		announcePrize(prize);
 	}
 	private static void announcePrize(int prize) {
 		// tell the user what they have won.
 		System.out.println("You won!");
 		System.out.println("You recieve " + prize + " bonus points.");
 
 	}
 
 	private static int getChipCount() {
 		/* maybe for future releases, we can have a math quiz
 		 * to determine how many chips you get for the game.
 		 */
 		return 2;
 	}
 
 	private static int getPrize(int chipFinalRestingPlace) { 
 		int[] prizeArray = {127,109,116,136,144,139,121, 137,75};
 		return prizeArray[chipFinalRestingPlace];
 	}
 
 	private static int getChipFinalRestingPlace() {
 		return (int)(Math.random()*9);
 	}
 
 }