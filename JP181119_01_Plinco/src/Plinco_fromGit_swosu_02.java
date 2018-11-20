public class Plinco_fromGit_swosu_02 {

	public static void main(String[] args) {
		// a working plinko game.
		String userName;
		int tokenCount;
		int tokenSlot;
		int[] prizeArray = {127,109,116,136,144,139,121, 137,75};
		int tokenPoints;
		int totalPoints = 0;

		introduceGame();
		provideGameRules();
		userName = getUserName();
		greetUser(userName);
		tokenCount = getUserTokenCount(userName);
		announceTokenCount(tokenCount,userName);
		for(int tokenIndex = 1; tokenIndex <= tokenCount; tokenIndex++)
		{
			tokenSlot = getTokenSlot();
			printTokenSlot(tokenSlot);
			tokenPoints = getPointsPerToken(tokenSlot, prizeArray);
			printTokenPoints(tokenPoints);
			totalPoints = totalPoints + tokenPoints;

		}
		announceUserPoints(userName,totalPoints);
	}

	private static void announceUserPoints(String userName, int totalPoints) {
		System.out.println(userName + " earned " + totalPoints + " points.");
		
	}

	private static void printTokenPoints(int tokenPoints) {
		System.out.println("That token gained " + tokenPoints + " points.");
		
	}

	private static int getPointsPerToken(int tokenSlot, int[] prizeArray) {
		int tokenPoints = prizeArray[tokenSlot -1];
		return tokenPoints;
	}

	private static void printTokenSlot(int tokenSlot) {
		System.out.println("That token landed in slot " + tokenSlot);

	}

	private static int getTokenSlot() {
		int tokenSlot = (int)(Math.random()*9)+1;
		return tokenSlot;
	}

	private static void announceTokenCount(int tokenCount, String userName) {
		System.out.println(userName + " earned " + tokenCount + " tokens.");

	}

	private static int getUserTokenCount(String userName) {
		return 2;
	}

	private static void greetUser(String userName) {
		System.out.println("Hello " + userName);

	}

	private static String getUserName() {
		String userName = "Bob";
		return userName;
	}

	private static void provideGameRules() {
		System.out.println("You will enter your name, \n"
				+ "then get tokesn, \n" +
				"play, and recieve bonus points.");

	}

	private static void introduceGame() {
		System.out.println("This is a plinco simulator for bonus points.");

	}

}