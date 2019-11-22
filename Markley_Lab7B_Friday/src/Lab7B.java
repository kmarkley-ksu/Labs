import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.atomic.AtomicInteger;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Lab7B
{
	public static void main(String[] args)
	{
		//String[] fullFile = new String[10000];
		String fullFile = "";
		int lineAmount = 0;
		try
		{
			BufferedReader br = new BufferedReader(
					new FileReader("alice.txt"));
			
			String st = br.readLine();
			//int counter = 0;
		    while (st != null)
		    {
		    	//fullFile[counter] = st;
		    	fullFile += st;
		    	//System.out.println(st);
		    	st = br.readLine();
		    	lineAmount++;
		    	//counter++;
		    }
		    br.close();
		}
		catch(FileNotFoundException ex)
		{
			ex.printStackTrace();
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
		
		int processors = Runtime.getRuntime().availableProcessors();
		System.out.println("Num of processors: " + processors);
		
		ForkJoinPool forkJoinPool = new ForkJoinPool(processors);
		
		int x = fullFile.length() / processors;
		
//		int count = 0;
//		int stoppingPointForLastThread = 0;
		
//		for(int i = 0; i < fullFile.length(); i++)
//		{
//			if(fullFile.charAt(i) == '\n')
//			{
//				count++;
//			}
//			
//			if(count >= processors)
//			{
//				Thread t = new Thread( fullFile.substring(
//						stoppingPointForLastThread, i) );
//				
//				stoppingPointForLastThread = i;
//				count = 0;
//			}
//		}
		
		int divisionOfWork = (lineAmount * 40) / processors;
		
//		Thread t = new Thread( fullFile.substring(0, 
//				divisionOfWork) );
//		Thread t = new Thread( 
//				fullFile.substring(divisionOfWork, 
//				divisionOfWork * 2) );
		
		//FORKJOIN
		AtomicInteger wordCount = new AtomicInteger(0);
		for(int i = 0; i < processors; i++)
		{
			DataParallelThread t = new DataParallelThread( 
					fullFile.substring(divisionOfWork * i, 
					divisionOfWork + (divisionOfWork * i)) );
			
			wordCount.getAndAdd(
					forkJoinPool.invoke(t).get()
					);
		}
		System.out.println("Word count of \"the\" is: " + 
				wordCount);
		
		//THREAD
		MyThread[] threads = new MyThread[processors];
		for(int i = 0; i < processors; i++)
		{
			MyThread t = new MyThread( 
					fullFile.substring(divisionOfWork * i, 
					divisionOfWork + (divisionOfWork * i)) );
			
			t.run();
			threads[i] = t;
		}
		
		int wordCount2 = 0;
		for(int i = 0; i < processors; i++)
		{
			wordCount2 += threads[i].WordCount();
		}
		
		System.out.println("Word count of \"the\" is: " + 
					wordCount2);
		
		
		
//		int wordCount = 0;
//		for(int i = 0; i < processors; i++)
//		{
//			wordCount += forkJoinPool.
//		}
	}
}


//try
//{
//	Thread.sleep(1000);
//}
//catch(InterruptedException ex)
//{
//	ex.printStackTrace();
//}

//ForkJoinPool forkJoinPool = new ForkJoinPool(processors);

//RecurAction myRecursiveAction = new RecurAction(80);
//
//forkJoinPool.invoke(myRecursiveAction);

//System.out.println("\nDONE WITH ACTIONS");
//System.out.println("-----------------------------------------------\n");
//
//RecurTask myRecursiveTask = new RecurTask(128);
//
//long mergedResult = forkJoinPool.invoke(myRecursiveTask);
//
//System.out.println("mergedResult = " + mergedResult); 