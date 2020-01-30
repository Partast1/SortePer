
public class Main {

	public static void main(String[] args) {
		Deck deck = new Deck();
		Dealer dealer = new Dealer();
		dealer.Shuffle(deck.Cards);
		dealer.Deal();
		dealer.StartGame();

	}

}
