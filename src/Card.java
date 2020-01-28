import java.util.Objects;

public class Card {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public Card(String Name) {
		setName(Name);
	}

//	@Override
//	public boolean equals(Object o) {
//		if (this == o) return true;
//		if (o == null || getClass() != o.getClass()) return false;
//		Card card = (Card) o;
//		return Objects.equals(name, card.name);
//	}
//
//	@Override
//	public int hashCode()
//	{
//		return Objects.hash(name);
//	}
}
