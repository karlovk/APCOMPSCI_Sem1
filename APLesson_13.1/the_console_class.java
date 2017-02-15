public abstract class the_console_class extends the_gamesystem_class
{
	public the_console_class()
	{
		super();
	}
	
	public the_console_class(String p)
	{
		super(p);
	}
	
	public abstract String getController();
	
	public String toString()
	{
		return "Platform: " + super.getPlatform() + "\n Serial #: " + super.getserialNo() + "\n Controller: " + getController();
	}
}