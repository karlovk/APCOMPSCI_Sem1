import java.util.ArrayList;
import java.util.Arrays;
public class lab_13toysore
{
	private ArrayList<lab_13toyclass> toyList = new ArrayList<>();
	
	public lab_13toysore() {}
	
	public lab_13toysore(String ts)
	{
		loadToys(ts);
	}
	
	public void loadToys(String ts)
	{
		ArrayList<String> toys = new ArrayList<>(Arrays.asList(ts.split(", ")));
		//System.out.println(toys);
		for(int i = 0; i < toys.size(); i+=2)
		{
			String name = toys.get(i);
			String type = toys.get(i + 1);
			lab_13toyclass t = this.getThatToy(name);
			if(t == null)
			{
				if(type.equals("car"))
					toyList.add(new lab_13carclass(name));
				else if(type.equals("afigure"))
					toyList.add(new lab_13afigure(name));
			}
			else
				t.setCount(t.getCount() + 1);
		}
	}
	
	public lab_13toyclass getThatToy(String nm)
	{
		for(lab_13toyclass t : toyList)
		{
			if(t.getName().equals(nm))
			{
				return t;
			}
		}
		return null;
	}
	
	public String getMostFrequentToy()
	{
		String name = "";
		int max = Integer.MIN_VALUE;
		for(lab_13toyclass t : toyList)
		{
			if(max < t.getCount())
			{
				max = t.getCount();
				name = t.getName();
			}
		}
		return "Most Frequent Toy: " + name;
	}
	
	public String getMostFrequentType()
	{
		int cars = 0;
		int figures = 0;
		
		for(lab_13toyclass t : toyList)
		{
			if(t.getType().equals("car"))
			{
				cars ++;
			}
			if(t.getType().equals("afigure"))
			{
				figures ++;
			}
		}
		
		if(cars > figures)
			return "Most Frequent Type of Toy: Cars";
		if(figures > cars)
			return "Most Frequent Type of Toy: Action Figures";
		else
			return "Equal amounts of action figures and cars!";
	}
	
	public String toString()
	{
		return toyList + "";
	}
}