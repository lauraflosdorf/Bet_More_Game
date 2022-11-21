package BetMore_Game;

import java.util.Scanner;

public class Player {
	
	public boolean user_selected = false;
	public boolean computer;
	public BetMore_Game bet;
	public int x;
	public int changeCard = 0;
	public Scanner in;
	
	public Player(boolean computer, BetMore_Game bet) {
		this.computer = computer;
		this.bet = bet;
	}
	
	public Player(boolean computer, BetMore_Game bet, Scanner in) {
		this.computer = computer;
		this.bet = bet;
		this.in = in;
	}
	
	public int start () {
		
		if (computer) {
			x = bet.play();
			
		} else {
		
		while(!user_selected && changeCard < 5) {
			x = bet.play();
			System.out.println("Your Value is " + x + ". Would you like to "
					+ "choose that card or generate a new number? Type 'Bet' to choose this number and bet."
					+ " Any other input will generate you a new number.");
			String gameString = in.next();
			
			if(gameString.equals("Bet")) {
				user_selected = true;
				in.close();
			}
			else 
			changeCard+=1;
			
			if(changeCard == 5) {
				System.out.println("That was your last try to generate a new number.");
				in.close();
				}
			}
		}
		
		return x;
		
	}
	

}
