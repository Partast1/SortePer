import java.util.ArrayList;
import java.util.List;

public class Deck {
	
	public static List<Card> Cards;
	
	
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
		 kylling  = new Card("Kylling");
		 abe = new Card("Abe");
		 kat = new Card("Kat");
		 sortePer = new Card("Sorte Per");
		 for (int i = 0; i < 2; i++)
	     {
			
			 Cards.add(haj);
			 Cards.add(ko);
			 Cards.add(kylling);
			 Cards.add(abe);
			 Cards.add(kat);
	     }
		 Cards.add(sortePer);
//		 deal.Shuffle(Cards)";
	}
	
}
