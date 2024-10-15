package Stacks;
	
import java.util.Stack;

public class LeetCode155 {
	 public static void main(String[] args) {
	    	LeetCode155 minStack = new LeetCode155();
	        minStack.push(-2);
	        minStack.push(0);
	        minStack.push(-3);
	        System.out.println(minStack.getMin()); 
	        minStack.pop();
	        System.out.println(minStack.top());    
	        System.out.println(minStack.getMin()); 
	    }
	 
	Stack<Integer> mainStack = new Stack<>();
    Stack<Integer> minStack = new Stack<>();

    
    public void push(int val) {
        mainStack.push(val);
        if (minStack.isEmpty() || val <= minStack.peek()) {
            minStack.push(val);
        }
    }
    public void pop() {
        if (!mainStack.isEmpty()) {
            int top = mainStack.pop();
            if (top == minStack.peek()) {
                minStack.pop();
            }
        }
    }

    
    public int top() {
        if (!mainStack.isEmpty()) {
            return mainStack.peek();
        }
        throw new RuntimeException(); 
    }

    
    public int getMin() {
        if (!minStack.isEmpty()) {
            return minStack.peek();
        }
        throw new RuntimeException(); 
    }

   
}
	
	