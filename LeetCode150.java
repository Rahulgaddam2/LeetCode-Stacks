package Stacks;

import java.util.Stack;

public class LeetCode150 {

	public static void main(String[] args) {
		LeetCode150 Object = new LeetCode150();
		
		String[] S = {"2","1","+","3","*","6","+","10","30","*"};
		
		System.out.println(Object.EvaluateReversePolishNotation(S));

	}
	public int EvaluateReversePolishNotation(String [] S) {
		Stack<Integer> polish = new Stack<>();
		
		for(int i=0;i<S.length;i++) {
			String SS = S[i];
			
			if(SS == "+" || SS == "-" || SS == "*" || SS == "/") {
				int value2 = polish.pop();
				int value1 = polish.pop();
				
				int result = 0;
				switch(SS) {
				case "+": 
					result = value1 + value2;
					break;
				case "-":
					result = value1 - value2;
					break;
				case "*":
					result = value2*value1;
					break;
				case "/":
					result = value1/value2;
					break;
					
				}
				polish.push(result);
			}
			else{
				int val = Integer.parseInt(SS);
				polish.push(val);
			}
			
		}
		return polish.pop();
		 
			
		
		
		
	}

}
