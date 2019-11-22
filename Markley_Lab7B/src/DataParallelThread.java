public class DataParallelThread extends Thread
{
	private String[] partOfFile;
	private int count = 0;
	
	public DataParallelThread(String[] partOfFile)
	{
		this.partOfFile = partOfFile;
	}
	
	public int Count()
	{
		return this.count;
	}
	
	@Override
	public void run()
	{
	    for(int lineNum = 0; lineNum < partOfFile.length; lineNum++)
	    {
		    for(int i = 0; i < partOfFile[lineNum].length() - 3; i++)
		    {
		    	if(partOfFile[lineNum].substring(i, i + 3).
		    			equalsIgnoreCase("the"))
		    	{
		    		count++;
		    	}
		    }
	    }
	}
}
