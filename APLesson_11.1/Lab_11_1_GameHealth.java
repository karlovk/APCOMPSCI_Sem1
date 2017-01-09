import java.util.Scanner;

public class Lab_11_1_GameHealth
{
	static String [] health;
	static int healthload = 6;
	static int healthcount;
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		String turn = "";
		int damage = 0;
		int amount = 0;
		healthcount = 6;
		health = new String[healthload];
		
		while(turn != "Q" && healthcount > 0)
		{
			System.out.println("Your turn! Hit Enter when ready: ");
			turn = kb.nextLine();
			damage = (int)(Math.random()*2)+1;
			amount = (int)(Math.random()*6)+1;
			System.out.println(takeDamage(damage, amount));
			printClip();
		}
		System.out.println("You died :(((((");
	}
	public static String takeDamage(int dmg, int amt)
	{
		if(dmg == 1)
		{
			healthcount -= amt;
			return "You took " + amt + " damage(s)!";
		}
		else
		{
			if(healthcount + amt < healthload)
				healthcount += amt;
			else
				healthcount = healthload;
		}
		return "Power up " + amt + "!";
	}
	public static void printClip()
	{
		String output = "Health: \t";
		for(int i = 0; i < healthload; i++)
		{
			if(i < healthcount)
				health[i] = "@";
			else
				health[i] = "[]";
			output += health[i];
		}
		System.out.println(output);
	}
}