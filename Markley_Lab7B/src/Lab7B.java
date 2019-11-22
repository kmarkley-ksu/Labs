import java.io.*;
import java.util.concurrent.*;

public class Lab7B
{
	public static void main(String[] args) 
	{
		File file = new File("alice.txt");
		BufferedReader br;
		String[] fullFile = new String[10000]; //10,000
		try
		{
			br = new BufferedReader(new FileReader(file));
			String st = br.readLine();
			int counter = 0;
		    while (st != null)
		    {
		    	fullFile[counter] = st;
		    	System.out.println(st); 
		    	st = br.readLine();
		    	counter++;
		    }
		    br.close();
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	    
	    //Threading - 7B
	    //Made a pool for the threads.
	    ForkJoinPool forkObject = new ForkJoinPool();
	    int count = 0;
	    
	    //Made a thread.
	    //fullFile[0 - x], fullFile[x - x * 2 (or x + x)], etc.
	    DataParallelThread t = new DataParallelThread(fullFile);
	    
	    //Called the run method and joined our pool.
	    forkObject.execute(t);
	    
	    try
	    {
	    	forkObject.shutdown();
	    	forkObject.awaitTermination(1000000, TimeUnit.MINUTES);
	    }
	    catch(Exception e)
	    {
	    	e.printStackTrace();
	    }
	    
	    count += t.Count();
	    
	    System.out.println("Count of \"the\" is " + count);
	}
}
