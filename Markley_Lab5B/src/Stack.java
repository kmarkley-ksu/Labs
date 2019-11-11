public class Stack
{
	Clothes[] myInternalArray;
	int rear;
	
	public Stack()
	{
		this.myInternalArray = new Clothes[10];
		this.rear = 0;
	}
	
	public void Push(Clothes dataItem)
	{
		if (this.rear >= this.myInternalArray.length)
		{
			Clothes[] temp = new Clothes[this.myInternalArray.length * 2];
			
			for (int i = 0; i < this.myInternalArray.length; i++)
			{
				temp[i] = this.myInternalArray[i];
			}
			
			this.myInternalArray = temp;
		}
		
		this.myInternalArray[this.rear] = dataItem;
		
//		if(this.rear > this.myInternalArray.length)
//			this.myInternalArray[this.rear] = dataItem;
		
		this.rear++;
	}
	
	public Clothes Pop()
	{
		if(this.rear >= 0)
		{
			this.rear--;
			Clothes temp = this.myInternalArray[this.rear];
			this.myInternalArray[this.rear] = null;
			return temp;
		}
		else
			return null;
	}
	
	public Clothes Peek()
	{
		return this.myInternalArray[this.rear - 1];
	}
	
	public String Display()
	{
		String output = "";
		
		//for(int i = 0; i < this.myInternalArray.length; i++)
		for(int i = 0; i < this.rear; i++)
		{
			output += this.myInternalArray[i] + "\n------------\n";
			//System.out.println(new Clothes() x)
		}
		
		return output;
	}
	
//	Node<Clothes> first;
//	int count;
//	
//	public Stack()
//	{
//		this.first = null;
//	}
//	
//	public void Push(Clothes dataItem)
//	{
//		if(this.first == null)
//		{
//			this.first = new Node<Clothes>(dataItem);
//			this.count++;
//			return;
//		}
//		
//		Node<Clothes> current = this.first;
//		
//		while(current.next != null)
//		{
//			current = current.next;
//		}
//		
//		current.next = new Node<Clothes>(dataItem);
//		this.count++;
//	}
//	
//	public void Pop()
//	{
//		if(this.first == null)
//		{
//			this.first = null;
//			this.count--;
//			return;
//		}
//		
//		Node<Clothes> current = this.first;
//		Node<Clothes> parentOfCurrent = current;
//		
//		while(current.next != null)
//		{
//			parentOfCurrent = current;
//			current = current.next;
//		}
//		
//		parentOfCurrent.next = null;
//		current = null;
//		this.count--;
//	}
//	
//	public Clothes Peek()
//	{
//		if(this.first == null)
//		{
//			return null;
//		}
//		
//		Node<Clothes> current = this.first;
//		
//		while(current.next != null)
//		{
//			current = current.next;
//		}
//		
//		return current.data;
//	}
//	
//	public String Display()
//	{
//		String output = "";
//		
//		Node<Clothes> current = this.first;
//		
//		while(current != null)
//		{
//			output += current.data + "\n------------\n";
//			current = current.next;
//		}
//		
//		return output;
//	}
//	
//	public class Node<DataClothes>
//	{
//		DataClothes data;
//		Node<DataClothes> next;
//		
//		public Node(DataClothes data)
//		{
//			this.data = data;
//			this.next = null;
//		}
//	}
}
