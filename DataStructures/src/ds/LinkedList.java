package ds;

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
}
