package BetMore_Game;

public class Game_Chair {
	
	public Player computer;
	public Player player_2;
	public Player winner;
	public Shuffle s;
	public BetMore_Game bet;
	public int xComputer;
	public int xPlayer2;
	
	public Game_Chair(Player computer, Player player_2, Shuffle s, BetMore_Game bet) {
		this.computer = computer;
		this.player_2 = player_2;
		this.s = s;
		this.bet = bet;
        xComputer = computer.start();
        System.out.println("Computer Card Value selected!");
		xPlayer2 = player_2.start();
		System.out.println("Your final number is " + xPlayer2 +".");
		winner = bet.findWinner(computer, player_2);
		
		if(winner.equals(computer)) {
			System.out.println("You lost! The computer had the card number " + xComputer + ".");
		} else if (winner.equals(player_2)) {
			System.out.println("Congratulations, you won! The computer had the card number " + xComputer + ".");
		} else {
			System.out.println("Tie! You both had the number " + xComputer + ".");
			}
		}

}
