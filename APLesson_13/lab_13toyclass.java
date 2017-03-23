public abstract class lab_13toyclass
{
	private String name;
	private int count;
	
	public lab_13toyclass()
	{
		this.name = "";
		this.count = 1;
	}
	
	public lab_13toyclass(String N)
	{
		this.name = N;
		this.count = 1;
	}
	
	public String getName()
	{
		return name;
	}
	
	public int getCount()
	{
		return count;
	}
	
	public void setName(String N)
	{
		name = N;
	}
	
	public void setCount(int C)
	{
		count = C;
	}
	
	public abstract String getType();
	
	public String toString()
	{
		return name + " " + count;
	}
}
	