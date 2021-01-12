/*
 * Written by Vivian D'Souza
 */
public class GenLL<T>{

	private class ListNode
	{
		T data; 
		ListNode link; 
		
		public ListNode()
		{
			this.data = null;
			this.link = null; 
		}
		
		public ListNode(T aData, ListNode aLink)
		{
			this.data = aData;
			this.link = aLink; 
		}
	}
	
	private ListNode head;
	private ListNode current; 
	private ListNode previous; 
	
	public GenLL()
	{
		head = current = previous = null; 
	}
	
	public void addNew(T aData)
	{
		ListNode newNode = new ListNode(aData, null);
		if(head == null)
		{
			head = current = newNode;
			return;
		}
		
		ListNode temp = head; 
		while(temp.link!=null) {
			temp = temp.link; 
		}
		temp.link = newNode; 
		this.goToNext();
	}
	
	public void remove(T aData)
	{
		 if(current.data.equals(aData))
		 {
			this.removeCurrent(); 
		 }
		 else if(head.data.equals(aData))
		 {
			 head = head.link; 
			 System.out.print("yes"); 
		 }
		 else
		 {
			 ListNode temp = head;
			 
			 while(temp!=null)
			 {
				 if(temp.data.equals(aData))
				 {
					 break; 
				 }
				 temp = temp.link; 
			 }
			 
			 current = head; 
			 
			 while(current!=temp)
			 {
				 System.out.print("no");
				 this.goToNext(); 
			 }
			 this.removeCurrent(); 
			 
		 }
	}
	
	public void removeCurrent()
	{
		if(current == head)
		{
			head = head.link;
			current = head; 
		}
		else
		{
			if(current != null && previous != null)
			{
				previous.link = current.link;  
				current = current.link;
			} 
		}	
	}
	
	public boolean contains(T aData)
	{
		for(ListNode temp = head; temp!=null; temp = temp.link)
		{
			if(temp.data.equals(aData))
			{
				return true; 
			}
		}
		return false; 
	}
	
	public T returnCurrent()
	{
		return current.data; 
	}
	
	public T returnPrevious()
	{
		return previous.data; 
	}
	
	public void goToNext()
	{
		previous = current;
		current = current.link; 
	}
	
	public void reset()
	{
		current = head; 
	}
	
	public void print()
	{
		for(ListNode temp=head; temp!=null; temp = temp.link)
		{
			System.out.println(temp.data);
		}
	}
	
	public String returnAll()
	{
		return "Previous" + previous.data + previous.link + "Current:" + current.data + current.link; 
	}
	
}
