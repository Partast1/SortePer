import java.util.*;
import java.util.stream.Collectors;


public class Participant {

	ArrayList<Card> hand;


	public void TakeCard(Card card) {
		hand.add(card);
	}

	public Card GiveCard(int num) {
		return hand.get(num);
	}
// constructor - Instantiates
	public Participant() {
		hand = new ArrayList<Card>();
	}

// Checks for duplicates.. all duplicates are added to the tempHand list
//	The tempHand is comparied to the hand.. duplicates removed.
	public void CheckDuplicate() {

		ArrayList<Card> tempHand = new ArrayList<>();

		for (int i = 0; i < hand.size(); i++) {
			for (int j = 0; j < hand.size(); j++) {
				if (hand.get(i).getName().equals(hand.get(j).getName()) && i != j) {
					System.out.print("Duplicate found. " + hand.get(i).getName() + " Have been removed.");
					tempHand.add(hand.get(i));
				}
			}
		}
		for (Card card: tempHand)
		{
			if (hand.contains(card))
			{
				hand.remove(card);
			}
		}
			tempHand.clear();
	}

}