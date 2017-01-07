package trees;

public class BinaryTree implements ITreeType {

	//each node does not have more than two children
	public BinaryTree()
	{
		
	}
	@Override
	public boolean evaluate(Tree tree) {
		if(tree.root == null)
			return false;
		if(tree.root.children == null)
			return false;
		return IsBT(tree.root);
	}
	public boolean IsBT(Node root)
	{
		if(root.children == null)
			return false;
		if(root.children.length > 2)
			return false;
		else
		{
			for(Node node: root.children)
			{
				if(IsBT(node))
					continue;
				else
				{
					return false;
				}
			}
		}
		return true;
	}
	

}
