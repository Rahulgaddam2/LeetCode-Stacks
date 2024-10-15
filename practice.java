package Stacks;

import java.util.Stack;

public class practice {

	public static void main(String[] args) {
            
		// LIFO - Last in first out (Stack)
		// FIFO - First in first out (queue )
		
		/*
		 Stack Operations:
		 
		 Create Stack
		 Push
		 Pop
		 Peek
		 isEmpty
		 isFull
		 DeleteStack
		 
		*/
		
		Stack<String> Books = new Stack<>(); 
		
		Books.push("red");
		Books.push("Green");
		Books.push("white");
		Books.push("yellow");
		System.out.println(Books);
		
		//String first = Books.pop();
		//ring Second = Books.pop();
		System.out.println(Books);
		

	}

}
