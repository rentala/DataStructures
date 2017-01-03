package ds;

public class Node {
	int data;
	Node next;
	Node(int data, Node next)
	{
		this.data = data;
		this.next = next;
	}
	Node(int data)
	{
		this.data = data;
	}
	boolean hasNext()
	{
		return next != null;
	}
	public int getData()
	{
		return this.data;
	}
}
