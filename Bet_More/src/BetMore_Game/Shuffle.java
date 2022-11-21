package BetMore_Game;

public class Shuffle {
	
	int shuffle;
	
	public int pickCard() {
		double randNumber = Math.random();
		double d = randNumber * 100;
		shuffle = (int)d + 1;
		return shuffle;
	}

}
