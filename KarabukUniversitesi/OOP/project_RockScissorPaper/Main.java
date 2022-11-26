
public class Main {

	public static void main(String[] args) {

			
			Gamer player1 = new Gamer("bedirhan");
			Gamer player2 = new Gamer("PC");
			
			Game newGame = new Game(player1, player2);
			
			newGame.start();
			
		
		
	}

}
