import java.util.ArrayList;
import java.util.Arrays;

public class car implements Inter_face
{
	private double[] location = {0,0};
	private int ID;
	
	public void createID()
	{
		for (int i = 0; i < 6; i++)
		{
			ID = ID * 10 + ((int)(Math.random() * 9));
		}
	}
	
	
	public car()
	{
		createID();
	}
	
	public car(double x1, double y1)
	{
		location[0] = x1;
		location[1] = y1;
		createID();
	}
	
	public car(String coordinates)
	{
		String[] parts = coordinates.split(",");
		location[0] = Double.parseDouble(parts[0]);
		location[1] = Double.parseDouble(parts[1]);
		createID();
	}
	
	public car(double[] coordinates)
	{
		location[0] = coordinates[0];
		location[1] = coordinates[1];
		createID();
	}

	public int getID()
	{
		return ID;
	}
	
	public void move(double x1, double y1)
	{
		location[0] = x1;
		location[1] = y1;
	}
	
	public double[] getLoc()
	{
		return location;
	}
}
	