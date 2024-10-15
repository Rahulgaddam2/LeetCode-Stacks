package Stacks;

import java.util.Stack;
import java.util.Arrays;
public class LeetCode739 {

	public static void main(String[] args) {
		LeetCode739 Object = new LeetCode739();
		
		int[] temperatures = {73,74,75,71,69,72,76,73}; 
		
		int[] finalresult = Object.DailyTemperatures(temperatures);
		
		System.out.println(Arrays.toString(finalresult));

	}
	public int[] DailyTemperatures(int[] temperatures) {
		
		Stack<Integer> Temp = new Stack<>();
		int n= temperatures.length;
		int[] result = new int[n];
		
		for(int index=n-1;index>=0;index--) {
			
			while(!Temp.isEmpty() && temperatures[index] >= temperatures[Temp.peek()]) {
				Temp.pop();
			}if(!Temp.isEmpty()) {
				result[index] = Temp.peek() - index; 
			}
			Temp.push(index);
		}
		return result;
	}

}
