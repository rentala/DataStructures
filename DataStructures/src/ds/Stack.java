package ds;

public class Stack {
	int[] arr;
	int pointer;
	public Stack(int capacity)
	{
		arr = new int[capacity];
	}
	public void push(int data)
	{
		if(pointer < arr.length)
		{  
			arr[pointer] = data;
			pointer++;
		}
	}
	public int pop()
	{
		if(pointer >= 0)
		{
			arr[--pointer] = 0;
			return arr[pointer];
		}
		else
			return 0; //exception case
	}
	public int peek()
	{
		return arr[pointer];
	}
	public void print()
	{
		String str = "";
		for(int i =0; i < arr.length ; i++)
		{
			str = str + arr[i] + " ";
		}
		System.out.println(str);
	}

}
