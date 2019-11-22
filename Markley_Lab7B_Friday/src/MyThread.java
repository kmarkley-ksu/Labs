import java.util.concurrent.atomic.AtomicInteger;

public class MyThread extends Thread
{
	String threadData;
	AtomicInteger numberOfThe = new AtomicInteger(0); 
	
	public MyThread(String data)
	{
		this.threadData = data;
	}
	
	public int WordCount()
	{
		return this.numberOfThe.get();
	}
	
	@Override
	public void run()
	{
		for(int i = 0; i < this.threadData.length() - 2; i++)
		{
			if( this.threadData.substring(i, i + 3)
					.equalsIgnoreCase("the") )
			{
				numberOfThe.getAndIncrement();
			}
		}
	}
}