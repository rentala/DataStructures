package trees;

public class Node {

	public Node[] children;
	public int data;
	
	public Node(int data)
	{
		this.data = data;
	}
	public Node(int data, Node[] children)
	{
		this.data = data;
		this.children = children;
	}
}
