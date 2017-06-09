/**
 * This is a class that tests the Card class.
 */
public class cardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		card A = new card("seven","hearts",7);
		
		card B = new card("eight","hearts",8);
		
		card C = new card("seven","hearts",7);
		
		System.out.println(A);
		
		System.out.println(B);
		
		System.out.println(C);
		
		System.out.println(C.matches(A));
		
		System.out.println(C.matches(B));
		
		/* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
	}
}