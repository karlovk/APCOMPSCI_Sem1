public class the_pc_class extends the_gamesystem_class
{
	public the_pc_class()
	{
		super();
	}
	
	public the_pc_class(String p)
	{
		super(p);
	}
	
	public String systemInput()
	{
		return "Keyboard and Mouse";
	}
	
	public String toString()
	{
		return "Platform: " + super.getPlatform() + "\n Serial #: " + super.getserialNo() + "\n System Input: " + systemInput();
	}
}