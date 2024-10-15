package Stacks;

import java.util.*;

public class LeetCode682 {

	public static void main(String[] args) {
		
		LeetCode682 Object = new LeetCode682();
		
		String[] words= {"5","2","C","D","+"};
		
		System.out.println(Object.BaseballGame(words));

	}
	public int BaseballGame(String [] words) {
		
		Stack<Integer> game = new Stack<>();
		int score = 0;
		
		for(int i=0;i<words.length; i++) {
			String s = words[i];
			
			if(s.equals("C")) {
				int remove = game.pop();
				score = score-remove;
			}else if(s.equals("D")) {
				int newscore = game.peek()*2;
				score = score+newscore;
			}else if(s.equals("+")) {
				int back = game.peek();
				int back1 = game.peek();
				game.push(back1);
				game.push(back);
				int sum = back1 + back;
				game.push(sum);
				score = score + sum;
			}else {
				int value = Integer.parseInt(s);
				game.push(value);
				score = score+value;
			}
			
		}
		return score;
	}

}
