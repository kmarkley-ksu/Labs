public class TimeFormatException extends Exception
{
	Exception e = new Exception("There is no such time as: 10:65");
	
	public TimeFormatException(String message)
	{
		super(message);
	}
}
