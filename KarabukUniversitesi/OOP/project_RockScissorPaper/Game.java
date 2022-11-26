
public class Game {
	
	private Gamer player1;
	private Gamer player2;
	static boolean isOver=false;
	
	public Game(Gamer player1, Gamer player2) {
		
		this.player1 = player1;
		this.player2 = player2;
		
	}
	
	void start() {
		
		while(true) {
			
			player1.move();
			player2.move();
			
			if(isOver) {
				
				showInfo();
				return;
				
			}
			
			determiningWinner();
			if(Gamer.numberOfTrials == 1000) isOver = true;
			
		}
		
	}
	
	void determiningWinner() {
		
		System.out.println(player1.name + " hand sign : " + player1.handSign);
		System.out.println(player2.name + " hand sign : " + player2.handSign);
		
		Gamer.numberOfTrials++;
		
		if((player1.handSign == HandSign.ROCK && player2.handSign == HandSign.SCISSOR) ||
		(player1.handSign == HandSign.SCISSOR && player2.handSign == HandSign.PAPER) || 
		(player1.handSign == HandSign.PAPER && player2.handSign == HandSign.ROCK)) {
			
			System.out.println("winner : " + player1.name);
			player1.numberOfWins++;
			
		}else if(player1.handSign == player2.handSign) {
			
			System.out.println("No winner, draw.");
			Gamer.numberOfDraws++;
			
		}else {
			
			System.out.println("winner : " + player2.name);
			player2.numberOfWins++;
			
		}

		showShortInfo();
		
	}
	
	void showShortInfo() {
		
		System.out.println(player1.numberOfWins + " : " + Gamer.numberOfDraws + " : " + player2.numberOfWins + "\n");
		
	}
	
	void showInfo() {
			
		System.out.println("final info;");
		System.out.println(player1.name + " : " + player1.numberOfWins);
		System.out.println(player2.name + " : " + player2.numberOfWins);
		System.out.println("Draw : " + Gamer.numberOfDraws);
		System.out.println("total games played : " + Gamer.numberOfTrials + " \n");
		
	}

}
