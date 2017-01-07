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
	public void preOrderTraversal()
	{
		
	}
}
