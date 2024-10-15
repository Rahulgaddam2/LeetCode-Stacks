package Stacks;

import java.util.*;

public class LeetCode20 {

	public static void main(String[] args) {
		LeetCode20 Object = new LeetCode20();
		
		String S = "(){]";
		
		System.out.println(Object.validparenthese(S));

	}public boolean validparenthese(String S) {
		
		Stack<Character> match = new Stack<>();
		
		for(int i=0; i<S.length();i++) {
			char c = S.charAt(i);
			
			if(c == '(') {
				match.push(')');
			}else if(c == '{') {
				match.push('}');
					
			}else if(c == '[') {
				match.push(']');
			}else if(match.isEmpty() || match.pop() != c) {
				return false;
			}
		}
		return match.isEmpty();
	}
	
	

}

