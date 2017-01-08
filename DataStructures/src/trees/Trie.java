package trees;

public class Trie {

	Letter root;
	//contains children A, B, C .. . . .
	public Trie(Letter root)
	{
		this.root = root;
	}
	public boolean doesPrefixExist()
	{
		return false;
	}
	public boolean noOfPrefix(String prefix)
	{
		//String[] prefixArray =prefix.toUpperCase().split("");
		//getPrefix(this.root, prefixArray);
		return false;
		
	}
	private int occuranceCounter = 0;
	private int getPrefix(Letter root, String pref )
	{
		//if(root.children.containsKey(pref))
		//	getPrefix(root.children.get(pref), prefixArray);
		//else
			return 0;
	}
	
}
