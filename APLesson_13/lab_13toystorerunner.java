import java.util.Scanner;
import java.util.ArrayList;

public class lab_13toystorerunner
{
	public static void main (String[]args)
	{	
		lab_13toysore wow = new lab_13toysore("Hotwheel, Car, G.I.Joe, AF, PennyRacer, Car, Matchbox, Car, Star Wars, AF, Pullback, Car, Star Wars, AF");
		
		System.out.println(wow);
		System.out.println(wow.getMostFrequentToy());
		System.out.println(wow.getMostFrequentType());
		
	}
	
}