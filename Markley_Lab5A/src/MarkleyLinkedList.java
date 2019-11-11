public class MarkleyLinkedList 
{
	Node first;
	int count;
	
	public MarkleyLinkedList()
	{
		this.first = null;
		this.count = 0;
	}
	
	public void AddAtEnd(int dataItem)
	{
		if(this.first == null)
		{
			this.first = new Node(dataItem);
			this.count++;
			return;
		}
		
		Node current = this.first;
		
		while(current.next != null)
		{
			current = current.next;
		}
		
		current.next = new Node(dataItem);
		this.count++;
	}
	
	public void RemoveAtEnd()
	{
		if(this.first == null)
		{
			//this.count--;
			return;
		}
		
		Node current = this.first;
		Node parentOfCurrent = current;
		
		while(current.next != null)
		{
			parentOfCurrent = current;
			current = current.next;
		}
		
		parentOfCurrent.next = null;
		current = null;
		this.count--;
	}
	
	public int Get(int index)
	{
		Node current = this.first;
		
		int counter = 0;
		
		//Return 0 when the index given is outside of our list.
		if(this.count <= index)
		{
			return 0;
		}
		
		while(current.next != null && counter < index)
		{
			current = current.next;
			counter++;
		}
		
		if(current != null)
			return current.data;
		
		return 0;
		
//		for(int i = 0; i <= index; i++)
//		{
//			if(current != null)
//			{
//				return current.data;
//			}
//			current = current.next;
//		}
//		return 0;
	}
	
	public class Node
	{
		int data;
		Node next;
		
		public Node(int data)
		{
			this.data = data;
			this.next = null;
		}
	}
}
