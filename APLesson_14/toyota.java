import java.util.Arrays;
public class toyota implements location
{
	private String Loc;
	
	public toyota()
	{
		
		Loc = "";
		
	}
	
	public toyota(String L)
	{
		
		Loc = L;
		
	}
	
	public int getID()
	{
		
		return (int)(Math.random() * 1000000) + 1;
		
	}
	
	public void move(String L)
	{
		
		Loc = L;
		
	}
	
	public double[] getLoc()
	{
		double[] location = new double[2];
		
		String[] loca = Loc.split(", ");
		
		location[0] = Double.parseDouble(loca[0]);
		
		location[1] = Double.parseDouble(loca[1]);
		return location;
	}
}