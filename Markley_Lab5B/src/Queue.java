public class Queue
{
	Food[] myInternalArray;
	int front, rear;
	
	public Queue()
	{
		this.myInternalArray = new Food[10];
		this.front = 0;
		this.rear = 0;
	}
	
	public void Enqueue(Food dataItem)
	{
		if (this.rear >= this.myInternalArray.length)
		{
			Food[] temp = new Food[this.myInternalArray.length * 2];
			
			for (int i = 0; i < this.myInternalArray.length; i++)
			{
				temp[i] = this.myInternalArray[i];
			}
			
			this.myInternalArray = temp;
		}
		
		this.myInternalArray[this.rear] = dataItem;
		
		this.rear = (this.rear + 1) % this.myInternalArray.length;
	}
	
	public Food Dequeue()
	{
		if(this.rear == this.front)
		{
			Food temp = this.myInternalArray[this.front];
			this.myInternalArray[this.front] = null;
			
			this.front = (this.front + 1) % this.myInternalArray.length;
			
			return temp;
		}
		else
			return null;
	}
	
	public Food Peek()
	{
		return this.myInternalArray[this.front];
	}
	
	public String Display()
	{
		String output = "";
		
		for(int i = 0; i < this.myInternalArray.length; i++)
		{
			output += this.myInternalArray[i] + "\n------------\n";
		}
		
		return output;
	}
}
