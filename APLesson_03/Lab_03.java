import java.util.Scanner;

public class Lab_03
{
	public static void main (String[]args )
	{
		
		Scanner keyboard = new Scanner(System.in);
		
		 
		System.out.println("Hi, my name is RudeAI.\n I'd like to ask you a few questions. \n What is your name?");
		String name = keyboard.next();
		
		
		System.out.println( name + "?!!! Why would anyone name a baby that? \n How old are you, " + name + "?" );
		int num = keyboard.nextInt();
		
		System.out.println("Oooooo!!!" + num + " is getting up there. \n What do you do for fun, " + name+ "?");
		String fun = keyboard.next();
		
		
		System.out.println("I thought only nerds like to " + fun+ " ? \n What kind of music to you like? " );
		String mus = keyboard.next();
		
		System.out.println("Boooo!!! I wouldn't wish the sound of " + mus + " on my worst enemy. \n How many siblings do you have? ");
		int sib = keyboard.nextInt();
		
		System.out.println(sib +"?  Wow, I hope the rest of your family is better looking.\n What do you want to be when you grow up? ");
		String grw = keyboard.next();
		
		System.out.println("I think you'd have to be smarter to be a "+ grw + ".\n So" + name + " , you're " + num +"...\n You like to " + fun + " and listen to " + mus +"\n Good luck becoming a          " + grw + ". \n I'm only kiddin' " + name );
	}
}