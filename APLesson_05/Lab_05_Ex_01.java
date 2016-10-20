import java.util.Random;
public class Lab_05_Ex_01
{
	static int player;
	static int computer;
	static String winner;
	
	public static void main(String[]args)
	{
		player = (int)(Math.random()*7)+1;
		computer = (int)(Math.random()*7)+1;
		
		rollDice();
		
		System.out.println("You rolled a " + player);
		System.out.println("Computer rolled a " + computer);
		System.out.println("Winner is " + winner);
	}
	
	
	
	public static void rollDice()
	{
		
		if (computer > player) 
			winner = "computer";
		
		if (player > computer)
			winner = "player";
		
		
	}
	
	
}