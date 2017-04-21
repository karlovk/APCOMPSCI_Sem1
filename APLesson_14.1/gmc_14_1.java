import java.util.ArrayList;
import java.util.Arrays;

public class gmc_14_1 implements interface_14_1
{
	private double x,y;
	private int ID;
	
	public void createID()
	{
		for (int i = 0; i < 6; i++)
		{
			ID = ID * 10 + ((int)(Math.random() * 9));
		}
	}
	
	public gmc_14_1()
	{
		x = 0;
		y = 0;
		createID();
	}
	
	public gmc_14_1(double x1, double y1)
	{
		x = x1;
		y = y1;
		createID();
	}
	
	public gmc_14_1(String coordinates)
	{
		String[] parts = coordinates.split(",");
		x = Double.parseDouble(parts[0]);
		y = Double.parseDouble(parts[1]);
		createID();
	}
	
	public gmc_14_1(double[] coordinates)
	{
		x = coordinates[0];
		y = coordinates[1];
		createID();
	}
	
	public int getID()
	{
		return ID;
	}
	
	public void move(int x1, int y1)
	{
		x = x1;
		y = y1;
	}
	
	public double[] getLoc()
	{
		
		return (new double[]{x,y});
		
	}
}