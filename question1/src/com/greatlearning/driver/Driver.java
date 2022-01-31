package com.greatlearning.driver;

import java.util.Scanner;
import com.greatlearning.services.BalancingBrackets;

public class Driver {

	public static void main(String[] args) {
		try (Scanner in = new Scanner(System.in)) {
			System.out.println("Enter the string containing brackets:");
			String bracketvalue = in.nextLine();

			String bracketExpression = bracketvalue;
			Boolean result;
			result = BalancingBrackets.bracketsBalanced(bracketExpression);
			if (result)
				System.out.println("The entered String has Balanced Brackets");
			else
				System.out.println("The entered Strings do not contain Balanced Brackets ");
		}
	}

}
