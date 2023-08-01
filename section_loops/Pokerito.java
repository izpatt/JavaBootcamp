package section_loops;

public class Pokerito {

	public static void main(String[] args) {
		System.out.println(
		"Let's play Pokerito. Type anything when you're ready.\n" +
		"It's like Poker, but a lot simpler.\n" +
		"- There are two players, you and the computer.\n" +
		"- The dealer will give each player one card.\n"+
		"- Then, the dealer will draw five cards (the river)\n"+
		"- The player with the most river matches wins!\n"+
		"- If the matches are equal, everyone's a winner!\n"+
		"- Ready? Type anything if you are.\n"
		);
		
		System.out.println("_____Drawing for User_________");
		String drawCardsPlayer = drawCards("player");
		System.out.println(drawCardsPlayer);
		
		System.out.println("_____Drawing for Computer_____");
		String drawCardsComputer= drawCards("player");
		System.out.println(drawCardsComputer);
		
		System.out.println("_____Drawing for Dealer________");
		String drawCardsRiver= drawCards("river");
		System.out.println(drawCardsRiver);
		
		String winnerPoints = winnerChecker(drawCardsPlayer, drawCardsComputer, drawCardsRiver);
		System.out.println("\n" + "Scores: \n" + winnerPoints);
	}
	
	public static String drawCards(String userr) {	
        String[] cards = {"♠️", "♥️", "♦️", "♣️", "🃏", "🎴"};
        int size = (userr == "player") ? 1: 5;
        String something = "";
        
		for (int i = 0; i < size; i++) {
			int card = (int) (Math.random() * cards.length - 1) + 1; //0 - 6
			something += cards[card] + " "; 	
		}
		return something;
	}
	
	public static String winnerChecker(String drawCardsPlayer, String drawCardsComputer, String drawCardsRiver) {
	    int countPlayer = drawCardsRiver.split(drawCardsPlayer).length - 1;
	    int countComputer = drawCardsRiver.split(drawCardsComputer).length - 1;
	    System.out.println("Points user player: " + countPlayer);
		System.out.println("Points user computer: " + countComputer);
		
		String result = 
			((countPlayer == countComputer)) ?  "Everyone's a winner" : 
			(countPlayer > countComputer == true) ?
	    	 "User Player wins" : "User Computer wins";
	    return result; 
		
	}
}
