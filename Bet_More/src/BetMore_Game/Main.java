package BetMore_Game;

import java.util.Scanner;

public class Main {
	
	public static Shuffle s = new Shuffle();
	public static BetMore_Game bet = new BetMore_Game(s);
	public static Player computer = new Player(true, bet);
	public static Player player_2;
	
	
	public static void main(String []args) {
		
		 Scanner in = new Scanner(System.in); 
		 player_2 = new Player(false, bet, in);
		 System.out.println("Type 'Play' to start the game Bet More!"); 

		 String gameString = in.next();
		 
		 if (gameString.equals("Play")) {
		 Game_Chair chair = new Game_Chair(computer, player_2, s, bet);
		 } else {
			 System.out.println("Wrong input. Please restart to play game.");
		 }
	}

}
