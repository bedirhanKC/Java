import java.util.Random;
import java.util.Scanner;

enum HandSign {
	ROCK, SCISSOR, PAPER;
}

public class Gamer {

	String name;
	HandSign handSign;
	int numberOfWins;
	static int numberOfDraws;
	static int numberOfTrials;
	
	public Gamer(String name) {
		
		this.name = name;
		numberOfWins=0;
		
	}

	void move() {

		

		if (Game.isOver)
			return;
		
		if (name == "PC" ||name == "PC1" || name == "PC2 )
			autoMove();
		
		else {

			boolean wrongInput;
			do {
				
				wrongInput = false;
				System.out.printf("player %s;\nfor rock : [r] \nfor scissor : [s] \nfor paper [p] \nfor quit : [q]\nplease choose your move : ",name);
				Scanner input = new Scanner(System.in);
				char move = input.next().charAt(0);

				System.out.println("the move was made \n");

				switch (move) {

				case 'r':

					this.handSign = HandSign.ROCK;

				break;

				case 's':
					this.handSign = HandSign.SCISSOR;

				break;

				case 'p':
					this.handSign = handSign.PAPER;

				break;

				case 'q':
					Game.isOver = true;
				break;

				default:
					System.out.println("wrong input, please try again...\n");
					wrongInput = true;
				break;

				}

			} while (wrongInput);

		}

	}

	private void autoMove() {
		
		Random random = new Random();
		int autoChoose = random.nextInt(3);
		System.out.println("the auto move was made \n");
		
		switch (autoChoose){
        case 0:
            this.handSign =HandSign.PAPER;
            break;
        case 1:
            this.handSign =HandSign.SCISSOR;
            break;
        case 2:
            this.handSign =HandSign.ROCK;
            break;
		}

	}
}
