public class ArrayList
{
	int[] elementData;
	
	public ArrayList(int initialCapacity) 
	{
	     if (initialCapacity > 0)
	     {
	    	 //https://stackoverflow.com/questions/529085/how-to-create-a-generic-array-in-java
	        this.elementData = new int[initialCapacity];
	     }
	     else if (initialCapacity == 0)
	     {
	        this.elementData = null;
	     }
//	     else
//	     {
//	        throw new IllegalArgumentException("Illegal Capacity: "+
//	                                               initialCapacity);
//	     }
	}
	
	public boolean add(E e)
	{
	     ensureCapacityInternal(size + 1);  // Increments modCount!!
	     elementData[size++] = e;
	     return true;
	}
	
	private void ensureCapacityInternal(int minCapacity)
	{
	    if (elementData == DEFAULTCAPACITY_EMPTY_ELEMENTDATA)
	    {
	        minCapacity = Math.max(DEFAULT_CAPACITY, minCapacity);
	    }
	    ensureExplicitCapacity(minCapacity);
	}
}
