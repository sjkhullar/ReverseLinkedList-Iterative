package org.learn.Client;

import org.learn.List.Node;
import org.learn.Question.ReverseList;

public class App 
{
	public static void main( String[] args )
    {
		int[] data = {1, 2, 3, 4, 5};
		Node head = new Node(data[0]);
		for(int count = 1; count < data.length; count++)
			ReverseList.insert(head,data[count]);
		System.out.println("Link list before reversal");
		ReverseList.print(head);
		head = ReverseList.reverseList(head);
		System.out.println("Link list after reversal");
		ReverseList.print(head);    	
    }
}
