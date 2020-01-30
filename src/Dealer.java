import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Dealer {


	private List<Card> decklist;
	Participant player;
	Participant computer;
	private List<Participant> participants;

	
	public Dealer() {
		player = new Participant();
		computer = new Participant();
		participants = new ArrayList<Participant>();
		participants.add(player);
		participants.add(computer);
		decklist = new ArrayList<Card>();
		
	}
//	Shuffles deck
	public void Shuffle(List<Card> cards) {

		  Collections.shuffle(cards);
		  decklist = cards;
	}
//Randomize participants, and deals cards.
	public void Deal() 
	{
		Random rnd = new Random();
		int number = rnd.nextInt(1);
		Participant p1 = participants.get(number);
		player = p1;
		participants.remove(number);
		Participant p2 = participants.get(0);
		computer = p2;
		participants.remove(0);
		int index = 0;
			for (int i = 0; i < decklist.size() / 2; i++) {

				p1.hand.add(decklist.get(index));
				index++;	

				p2.hand.add(decklist.get(index));
				index++;
			}
			if (0 < decklist.size()) {
				p2.hand.add(decklist.get(index));
			}
	}
//	Starts game, and controls the turns
	public void StartGame() {
		for (Card card: player.hand)
		{
			System.out.print(card.getName() + " ");
		}

		boolean gameWon = true;
		while (gameWon) {
            if (0 < player.hand.size() || 0 < computer.hand.size()) {

                player.CheckDuplicate();
                computer.CheckDuplicate();
                System.out.print("Player hand \n");
                for (Card car : player.hand) {
                    System.out.print(car.getName() + " ");
                }

                System.out.print("\n computer hand \n");
                for (Card cart : computer.hand) {
                    System.out.print(cart.getName() + " ");

                }
                player.CheckDuplicate();
                computer.CheckDuplicate();
                Random rnd = new Random();



                System.out.print("\n Choose a card between 1-" + (computer.hand.size() - 1));
                Scanner scan = new Scanner(System.in);

                int userInput = scan.nextInt();

                if (userInput < computer.hand.size()) {
                    player.TakeCard(computer.GiveCard(userInput));
                    computer.hand.remove(userInput);
                } else {
                    System.out.print("Wrong card");
                }
                player.CheckDuplicate();
                computer.CheckDuplicate();

				int comInput = rnd.nextInt(player.hand.size());
					computer.TakeCard(player.GiveCard(comInput));
					player.hand.remove(comInput);


            }

			else {
				if (player.hand.size() > computer.hand.size()){
					System.out.print("Computer have won!");
				}
				else{
					System.out.print("Player have won!");
				}
				gameWon = false;

			}
			
		}
	}
	
}

	

