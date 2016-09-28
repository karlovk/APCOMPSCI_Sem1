import java.util.Scanner;

public class Lab_04_Ex_01
{
	public static void main (String[]args )
	{
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Please enter item 1:");
		String one = keyboard.next();
		
		System.out.println(" Please enter the price:");
		double oonnee = keyboard.nextInt();
		
		System.out.println("Please enter item 2: ");
		String two = keyboard.next();
		
		System.out.println(" Please enter the price:");
		double ttwwoo = keyboard.nextInt();
		
		System.out.println("Please enter item 3:");
		String three = keyboard.next();
		
		System.out.println(" Please enter the price: ");
		double tthree = keyboard.nextInt();
		
		System.out.println(" <<<<<<<<<<<<<<<__Receipt__>>>>>>>>>>>>>>>> \n \n *  " + one + "........     " + oonnee + "\n *  " +two+ "........     " + ttwwoo + "\n *  " + three + "........     " + tthree +  "\n \n ");
		
		double subtotal = oonnee + ttwwoo + tthree;
		
		double tax =   0.08  * subtotal;
		
		double total = subtotal + tax;
		
		
		System.out.println("*            Subtotal: ........     "+ subtotal + "\n *             Tax: ........     " + tax + "\n *           Total: ........     "+ total);
	
	}
	
	
}