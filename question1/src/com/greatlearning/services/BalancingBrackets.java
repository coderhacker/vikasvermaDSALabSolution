package com.greatlearning.services;

import java.util.Stack;

public class BalancingBrackets {

	// function to check if brackets are balanced
	public static boolean bracketsBalanced(String bracketExpression) {
		Stack<Character> stack = new Stack<Character>();
		for (int i = 0; i < bracketExpression.length(); i++) {
			char character = bracketExpression.charAt(i);
			if (character == '(' || character == '[' || character == '{') {
				stack.push(character);
				continue;
			}
			if (stack.isEmpty())
				return false;

			char c;
			switch (character) {
			case '}':
				c = stack.pop();
				if (c == '(' || c == '[')
					return false;
				break;
			case ')':
				c = stack.pop();
				if (c == '{' || c == '[')
					return false;
				break;
			case ']':
				c = stack.pop();
				if (c == '(' || c == '{')
					return false;
				break;
			}
		}
		return stack.isEmpty();
	}

}
