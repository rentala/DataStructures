package trees;

public class TestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 TreeTest();
		
	}
	public static void TreeTest()
	{
		
		//not binary tree test case
		//NotBinaryTreeTestCase();
		InOrderTraversal();
		PreorderTraversal();
		HeightOfTree();
		//
	}
	public static Tree setUp()
	{
		Node root = new Node(1);
		Node[] children = new Node[2];
		children[0] = new Node(2);
		children[0].children = new Node[3];
		children[0].children[0] = new Node(12);
		children[0].children[1] = new Node(15);
		children[0].children[2] = new Node(10);
		children[1] = new Node(3);
		root.children = children ;
		/*
		 * 			1
		 * 		2		3
		 * 12 15 10
		 */
		return new Tree(root);
	}
	public static Tree setUpBST()
	{
		Node root = new Node(8);
		Node[] children = new Node[2];
		
		children[0] = new Node(5);
		children[0].children = new Node[2];
		children[0].children[0] = new Node(2);
		children[0].children[1] = new Node(12);

		children[1] = new Node(10);
		children[1].children = new Node[2];
		children[1].children[0] = new Node(9);
		children[1].children[1] = new Node(20);

		root.children = children ;
		/*
		 * 			8
		 * 		5		   10
		 * 2		12  9		20
		 */
		System.out.println("------------------------------");
		System.out.println("BST Tree: ");
		System.out.println("	   	8");
		System.out.println("	5	    10");
		System.out.println(" 2	   12    9	  20");
		System.out.println("------------------------------");
		return new Tree(root);
	}
	public static Tree setUpTallTree()
	{
		Node root = new Node(8);
		Node[] children = new Node[2];
		
		children[0] = new Node(5);
		children[0].children = new Node[2];
		children[0].children[0] = new Node(2);
		children[0].children[1] = new Node(12);
		
		children[0].children[1].children = new Node[1];
		children[0].children[1].children[0] = new Node(2);
				
		children[1] = new Node(10);
		children[1].children = new Node[2];
		children[1].children[0] = new Node(9);
		children[1].children[1] = new Node(20);

		root.children = children ;
		/*
		 * 			8
		 * 		5		   10
		 * 2		12  9		20
		 * 		2
		 */
		System.out.println("------------------------------");
		System.out.println("BST Tree: ");
		System.out.println("	   	8");
		System.out.println("	5	    10");
		System.out.println(" 2	   12    9	  20");
		System.out.println("	  2    ");
		System.out.println("------------------------------");
		return new Tree(root);
	}
	public static void NotBinaryTreeTestCase()
	{
		//not binary tree test case
		Tree tree = setUp();
		System.out.println(tree.Is(new BinaryTree()));
	}

	public static void PreorderTraversal()
	{
		Tree tree = setUpBST();
		System.out.print("PreOrder Traversal: ");
		tree.preOrderTraversal();
		System.out.println();
		
	}
	public static void InOrderTraversal()
	{
		Tree tree = setUpBST();
		System.out.print("InOrder Traversal: ");
		tree.inOrderTraversal();
		System.out.println();
	}
	public static void HeightOfTree()
	{
		System.out.println("Heighrt of Tree: " + setUpTallTree().height());
	}
}
