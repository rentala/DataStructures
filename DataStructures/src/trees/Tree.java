package trees;


public class Tree {
	
	Node root;
	String data;
	public Tree(Node node)
	{
		this.root = node;
	}
	public boolean Is(ITreeType treeType)
	{
		return treeType.evaluate(this);
	}
	//print visited node first left to right - but parent before child
	public void preOrderTraversal()
	{
		Node node = this.root;
		POT(node);
	}
	public void POT(Node node)
	{
		System.out.print(node.data + " ");
		if(node.children!= null && node.children.length>0)
		{
			for(Node child : node.children)
			{
				POT(child);
				//System.out.println(child.data);
			}
			
		}
	}
	//print nodes first left to right - ascending order for BST
	public void inOrderTraversal()
	{
		Node node = this.root;
		IOT(node);
	}
	public void IOT(Node node)
	{
		if(node.children!= null && node.children.length>0)
		{
			IOT(node.children[0]);
			
		}
		System.out.print(node.data + " ");
		if(node.children!= null && node.children.length>0)
		{
			IOT(node.children[1]);
			
		}
	}
}
