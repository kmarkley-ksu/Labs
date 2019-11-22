import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;

public class DataParallelThread extends RecursiveTask<AtomicInteger>
{
	String threadData;
	AtomicInteger numberOfThe = new AtomicInteger(0);
	
	public DataParallelThread(String data)
	{
		this.threadData = data;
	}
	
	@Override
	public AtomicInteger compute()
	{
		for(int i = 0; i < this.threadData.length() - 2; i++)
		{
			if( this.threadData.substring(i, i + 3)
					.equalsIgnoreCase("the") )
			{
				this.numberOfThe.getAndAdd(1);
			}
		}
		return this.numberOfThe;
	}
}