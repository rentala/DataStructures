package test;

import java.util.Hashtable;

import ds.*;

public class TestCases {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//LinkedListTest();
		//StackTest();
		BalancedBracketSolution();
	}
	
	public static void LinkedListTest()
	{
		LinkedList ll = new LinkedList();
		ll.add(1);
		ll.add(2);
		ll.add(3);
		ll.add(4);
		
		Node node = ll.find(1);
		if(node != null)
			System.out.println(node.getData());
		ll.print();
		ll.remove(2);
		ll.print();
		ll.remove(0);
		ll.print();
		System.out.println("// Duplicate bit //");
		ll.add(1);
		ll.add(3);
		ll.add(4);
		ll.add(3);
		ll.add(4);
		ll.add(4);
		ll.add(4);
		ll.add(1);
		ll.print();
		ll.removeDuplicates();
		ll.print();
		System.out.println("---------------End of LinkedList Tests -------------");
	}
	
	public static void HashTableTest()
	{
		System.out.println("---------------End of HashTable Tests -------------");
	}
	public static void StackTest()
	{
		System.out.println("// Basic Stack test");
		Stack stack = new Stack(5);
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);
		stack.pop();
		stack.pop();
		stack.pop();
		stack.pop();
		stack.pop();
		stack.pop();
		stack.pop();
		stack.pop();
		stack.pop();
		stack.push(5);
		stack.pop();
		stack.print();
		System.out.println("---------------End of Stack Tests -------------");
		
	}
	public static void BalancedBracketSolution()
	{
		System.out.println("--------------- Balanced Bracket Stack Tests -------------");
		String str = "[{]}{[]}{}";
		String[] strArr = str.split("");
		java.util.Stack<String> st = new java.util.Stack<String>();
		
		for(String s : strArr)
		{
			if(s.equalsIgnoreCase("{") || s.equalsIgnoreCase("(") || 
					s.equalsIgnoreCase("["))
			{
				st.push(s); 
			} 
			else 
			{
				
				if((s.equalsIgnoreCase("}") && st.peek().equalsIgnoreCase("{"))
						|| (s.equalsIgnoreCase(")") && st.peek().equalsIgnoreCase("("))
						|| (s.equalsIgnoreCase("]") && st.peek().equalsIgnoreCase("[")))
					st.pop();
				else
					break;
			}
			
		}
		System.out.println(str);
		if(st.isEmpty())
			System.out.println("Balanced");
		else
			System.out.println("Unbalanced");
		System.out.println("---------------End of Stack Tests -------------");
	}

}
