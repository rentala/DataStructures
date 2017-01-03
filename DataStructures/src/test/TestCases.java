package test;

import ds.*;

public class TestCases {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList ll = new LinkedList();
		ll.add(1);
		ll.add(2);
		ll.add(3);
		ll.add(4);
		
		Node node = ll.find(1);
		if(node != null)
			System.out.println(node.getData());
		ll.print();
	}

}
