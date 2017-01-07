package trees;

public class TestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 TreeTest();
		
	}
	public static void TreeTest()
	{
		
		//not binary tree test case
		NotBinaryTreeTestCase();
		
		
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
		Tree tree = setUp();
		
	}
}
