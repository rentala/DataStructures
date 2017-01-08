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
	private void POT(Node node)
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
	private void IOT(Node node)
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
	public int height()
	{
		return getMaxHeight(this.root);
	}
	private int getMaxHeight(Node root)
	 {
		 if(root.children != null)
		 {
			 int[] heights = new int[root.children.length];
		        int i=0;
		        for(Node node : root.children)
		        {
		        	heights[i] = 1 + getMaxHeight(node);
		        	i++;
		        }
		 
		       return getMaxOfArray(heights);   
		 }
	         return 0;
	  }
	private int getMaxOfArray(int[] arr)
	 {
		 int max = arr[0];
		 for(int i: arr)
		 {
			 if(max<i)
				 max = i;
		 }
		 return max;
	 }
}
