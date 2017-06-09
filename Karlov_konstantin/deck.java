import java.util.List;
import java.util.ArrayList;

/**
 * The Deck class represents a shuffled deck of cards.
 * It provides several operations including
 *      initialize, shuffle, deal, and check if empty.
 */
public class deck {

	/**
	 * cards contains all the cards in the deck.
	 */
	private List<card> cards = new ArrayList<card>();

	/**
	 * size is the number of not-yet-dealt cards.
	 * Cards are dealt from the top (highest index) down.
	 * The next card to be dealt is at size - 1.
	 */
	private int size;


	/**
	 * Creates a new <code>Deck</code> instance.<BR>
	 * It pairs each element of ranks with each element of suits,
	 * and produces one of the corresponding card.
	 * @param ranks is an array containing all of the card ranks.
	 * @param suits is an array containing all of the card suits.
	 * @param values is an array containing all of the card point values.
	 */
	public deck(String[] ranks, String[] suits, int[] values) {
		for (int a = 0; a < ranks.length; a++)
		{
			for (int b = 0; b < suits.length; b++)
			{
				cards.add(new card(ranks[a],suits[b],values[a]));
				size++;
			}
		}
		/* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
	}


	/**
	 * Determines if this deck is empty (no undealt cards).
	 * @return true if this deck is empty, false otherwise.
	 */
	public boolean isEmpty() {
		if (size >= 0)
			return false;
		else
			return true;
		/* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
	}

	/**
	 * Accesses the number of undealt cards in this deck.
	 * @return the number of undealt cards in this deck.
	 */
	public int size() {
		return size;
		/* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
	}

	/**
	 * Randomly permute the given collection of cards
	 * and reset the size to represent the entire deck.
	 */
	 
	public void shuffle() {
		List<card> shuffled = new ArrayList<card>();
		for (int a = 0; a < cards.size(); a++)
		{
			shuffled.add(null);
		}
		for (int a = 0; a < cards.size(); a++)
		{
			while (shuffled.get(a) == null)
			{
				int j = (int)(Math.random() * cards.size());
				if (cards.get(j) != null)
				{
					shuffled.set(a,cards.get(j));
					cards.set(j,null);
				}
			}
		}
		for (int c = 0; c < shuffled.size(); c++)
		{
			cards.set(c,shuffled.get(c));
		}
		/* *** TO BE IMPLEMENTED IN ACTIVITY 4 *** */
	}

	/**
	 * Deals a card from this deck.
	 * @return the card just dealt, or null if all the cards have been
	 *         previously dealt.
	 */
	public card deal() {
		if (size >= 0)
		{
			size--;
			return cards.get(size);
		}
		else
			return null;
		/* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
	}

	/**
	 * Generates and returns a string representation of this deck.
	 * @return a string representation of this deck.
	 */
	@Override
	public String toString() {
		String rtn = "size = " + size + "\nUndealt cards: \n";

		for (int k = size - 1; k >= 0; k--) {
			rtn = rtn + cards.get(k);
			if (k != 0) {
				rtn = rtn + ", ";
			}
			if ((size - k) % 2 == 0) {
				// Insert carriage returns so entire deck is visible on console.
				rtn = rtn + "\n";
			}
		}

		rtn = rtn + "\nDealt cards: \n";
		for (int k = cards.size() - 1; k >= size; k--) {
			rtn = rtn + cards.get(k);
			if (k != size) {
				rtn = rtn + ", ";
			}
			if ((k - cards.size()) % 2 == 0) {
				// Insert carriage returns so entire deck is visible on console.
				rtn = rtn + "\n";
			}
		}

		rtn = rtn + "\n";
		return rtn;
	}
}