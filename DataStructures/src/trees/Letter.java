package trees;

import java.util.HashMap;

public class Letter {

	public HashMap<String, Letter> children;
	public String data;
	
	public Letter(String data)
	{
		this.data = data;
	}
	public Letter(String data, HashMap<String, Letter> children)
	{
		this.data = data;
		this.children = children;
	}
}

