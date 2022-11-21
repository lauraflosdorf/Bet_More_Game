package BetMore_Game;

public class BetMore_Game {
	
	public Shuffle s;
	public int x;
	
	public BetMore_Game(Shuffle s) {
		this.s = s;
	}
	
	public int play() {
		x = s.pickCard();
		return x;
		
	}
	
	public Player findWinner(Player computer, Player player_2) {
		if (computer.x > player_2.x) {
			return computer;
		} else if (computer.x < player_2.x) {
			return player_2;
		} else {
			return null;
		}
	}

}
