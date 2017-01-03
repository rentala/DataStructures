package ds;

import java.util.Hashtable;

public class LinkedList {
	Node head;
	public LinkedList(Node head)
	{
		this.head = head;
	}
	public LinkedList()
	{
	}
	public void add(int data)
	{
		Node node = new Node(data);
		if(this.head == null)
			this.head = node;
		else
		{
			Node nextNode = this.head;
			while(nextNode.hasNext())
			{
				nextNode = nextNode.next;
			}
			nextNode.next = node;
		}
	}
	public void print()
	{
		if(this.head == null)
			System.out.println("empty list");
		else 
		{
			Node nextNode = this.head;
			String str = Integer.toString(nextNode.data) + " ";
			while(nextNode.hasNext())
			{
				nextNode = nextNode.next;
				str = str +  Integer.toString(nextNode.data) + " ";
			}
			System.out.println(str);
		}
		
	}
	public Node find(int p)
	{
		if(this.head == null)
			return null;
		
		Node nextNode = this.head;
		int counter = 0;
		while(nextNode.hasNext() && counter != p)
		{
			nextNode = nextNode.next;
			counter++;
		}
		if(counter == p)
			return nextNode;
		else 
			return null;
	}
	public void remove(int p)
	{
		if(p == 0)
		{
			this.head = this.head.next;
		} 
		else
		{
			Node nextNode = this.head;
			int counter = 0;
			while(nextNode.hasNext() && counter < p -1)
			{
				nextNode = nextNode.next;
				counter++;
			}
			if(nextNode != null)
			{
				if(nextNode.next !=null)
					nextNode.next = nextNode.next.next;
				else
					nextNode.next = null;
			}
			
			
		}
		
		
	}

	//Write code to remove duplicates from an unsorted linkedList
	public void removeDuplicates()
	{
		Hashtable<Integer, Integer> hashtable = new Hashtable<>();
		hashtable.put(this.head.getData(), this.head.getData());
		Node nextNode = this.head;
		int index = 1;
		while(nextNode.hasNext() && nextNode.next !=null)
		{
			//System.out.println("ct " + index);
			nextNode = nextNode.next;
			Integer v = hashtable.get(nextNode.getData());
			if(v !=null)
			{
				//System.out.print("Inital: ");
				//this.print();
				remove(index);
				//System.out.println("Removed and updated to v = " + v + " of index " + index );
				//this.print();
			}
			else
			{
				hashtable.put(nextNode.getData(), nextNode.getData());
				//System.out.println("Inserted " + hashtable.get(nextNode.getData()));
				index++;
			}
			
			//System.out.println("---------- ///----------");
		}
	}
}
