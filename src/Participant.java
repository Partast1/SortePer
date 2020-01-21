import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;


public class Participant {
	
	 List<Card> hand;
	
	public void TakeCard(Card card) {
		hand.add(card);
	}

	public Card GiveCard(int num) {
		return hand.get(num);
		
	}
	public Participant() {
		hand = new ArrayList<Card>();
	}
	
	public void CheckDuplicate(List<Card> cards) 
	{
		for (Card card : cards) {
			System.out.print("Duplication hand " + cards.indexOf(card));
		}

	      for (int j = 0; j < cards.size() ; j++) 
	      {
//	    	  for (Card card2 : hand) 
//	    	  {
	    	  for (int i = 0; i < cards.size() ; i++) 
	    	  {
				
			
			if (cards.get(i).getName() == hand.get(j).getName() && !(cards.indexOf(i) == hand.indexOf(j))) 
			{
				System.out.print("Duplicate found " + hand.get(i).getName() + "have been removed");
				hand.remove(i);
//				hand.remove(card2);
			}
			else {
//				System.out.print("No duplicate found ");
			}
		
	    	  }
	      }

	}
	



}
