public class MarkleyArrayList 
{
	int[] myInternalArray;
	int size;
	int count;
	int begin, end;
	
	public MarkleyArrayList()
	{
		this.myInternalArray = new int[10];
		this.size = 10;
		this.count = 0;
		this.begin = 0;
		this.end = this.myInternalArray.length - 1;
	}
	
	public void AddAtEnd(int dataItem)
	{
		if(this.count == this.size)
		{
			int[] temp = new int[this.size * 2];
			
			for(int i = 0; i < this.size; i++)
			{
				temp[i] = this.myInternalArray[i];
			}
			
			this.myInternalArray = temp;
			this.size *= 2;
			this.end = temp.length - 1;
		}
		
		
		this.myInternalArray[this.end] = dataItem;
		this.count++;
		this.end = Math.abs((this.end - 1)) % this.size;
		
//		for(int i = myInternalArray.length - 1; i > 0; i--)
//		{
//			if(this.myInternalArray[i] == 0)
//			{
//				this.myInternalArray[i] = dataItem;
//				this.count++;
//				return;
//			}
//		}
	}
	
	public void RemoveAtEnd()
	{
		this.myInternalArray[this.end] = 0;
		this.count--;
		this.end = Math.abs(this.end + 1) % this.size;
		
//		for(int i = myInternalArray.length - 1; i > 0; i--)
//		{
//			if(this.myInternalArray[i] != 0)
//			{
//				this.myInternalArray[i] = 0;
//				this.count--;
//				break;
//			}
//		}
	}
	
	public int Get(int index)
	{
		for(int i = index; i < myInternalArray.length; i++)
		{
			if(this.myInternalArray[i] != 0)
			{
				return this.myInternalArray[i];
			}
		}
		return 0;
	}
}
