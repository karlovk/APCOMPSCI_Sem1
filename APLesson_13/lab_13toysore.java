import java.util.ArrayList;
import java.util.Arrays;

public class lab_13toysore
{
	private ArrayList<lab_13toyclass> toyList = new ArrayList<lab_13toyclass>();
	
	public lab_13toysore()
	{
		
	}
	
	public lab_13toysore(String ts)
	{
		this.loadToys(ts);
	}
	
	public void loadToys(String ts)
	{
		ArrayList<String> toys = new ArrayList<String>(Arrays.asList(ts.split(", ")));
		for (int i = 0; i < toys.size(); i+=2)
		{
			String name = toys.get(i);
			String type = toys.get(i + 1);
			lab_13toyclass object = this.getThatToy(name);
			
			if (object == null)
			{
				if (type.equals("Car"))
				{
					toyList.add(new lab_13carclass(name));
				}
				else if (type.equals("AF"))
				{
					toyList.add(new lab_13afigure(name));
				}
				else {
					//Wtf is this type
				}
			}
			else 
			{
				object.setCount(object.getCount() + 1);
			}
		}
		
	}
	
	public lab_13toyclass getThatToy(String nm)
	{
		for (lab_13toyclass x : toyList)
		{
			if (x.getName().equals(nm))
			{
				return x;
			}
		}
		return null;
	}
	
	public String getMostFrequentToy()
	{
		String name = "";
		int max = 0;
		for (lab_13toyclass x : toyList)
		{
			if (max < x.getCount())
			{
				max = x.getCount();
				name = x.getName();
			}
		}
		return name;
	}
	
	public String getMostFrequentType()
	{
		int cars = 0;
		int figures = 0;
		for (lab_13toyclass x : toyList)
		{
			if (x.getType().equals("Car"))
			{
				cars++;
			}
			else
			{
				figures++;
			}
		}
		if (cars > figures)
		{
			return "cars";
		}
		else if (figures > cars)
		{
			return "action figures";
		}
		else
		{
			return "same";
		}
		
	}
	
	public String toString()
	{
		return toyList + "";
	}
}
	