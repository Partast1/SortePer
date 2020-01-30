import java.util.ArrayList;
import java.util.List;

public class Deck {
	
	public List<Card> Cards;
	
	
	  private Card haj;
      private Card ko;
      private Card kylling;
      private Card abe;
      private Card kat;
      private Card sortePer;

	public Deck() {
		Cards = new ArrayList<Card>();

		haj = new Card("Haj");
		ko = new Card("Ko");
		kylling = new Card("Kylling");
		abe = new Card("Abe");
		kat = new Card("Kat");
		sortePer = new Card("Sorte Per");
		for (int i = 0; i < 2; i++) {

			Cards.add(haj);
			Cards.add(Cards.size(), ko);
			Cards.add(Cards.size(), kylling);
			Cards.add(Cards.size(), abe);
			Cards.add(Cards.size(), kat);
		}
		Cards.add(sortePer);


	}
}
