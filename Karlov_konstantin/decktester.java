/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		Deck A = new Deck(new String[]{"A","B","C"},new String[]{"K","Y","S"},new int[]{1,2,3});
		Deck B = new Deck(new String[]{"Asd","Bac","Cad"},new String[]{"Kaw","Yas","Sad"},new int[]{113,222,143});
		Deck C = new Deck(new String[]{"Kapper","Bapper","Clack"},new String[]{"ASWE","YASWE","SASWE"},new int[]{0,2,0});
		
		System.out.println(A.size());
		while (A.size() > 0)
		{
			System.out.println(A.deal());
		}
		
		
		String[] ranks = {"ace","two","three","four","five","six","seven","eight","nine","ten","jack","queen","king"};
		String[] suits = {"diamonds", "hearts","clubs","clovers"};
		int[] pointValues = {11,2,3,4,5,6,7,8,9,10,10,10,10};
		
		Deck Full = new Deck(ranks,suits,pointValues);

		Full.shuffle();
		System.out.println(Full);
		
		
		/* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
	}
}