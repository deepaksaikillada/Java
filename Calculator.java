package ipa;
import java.math.BigInteger;
/*
Write a Java program to implement a simple calculator. The program should prompt the user to enter two numbers and an 
operator (+, -, *, or /) and then perform the corresponding operation and display the result.

For example, if the user enters 4, 5, and +, the program should display 9 as the result. Similarly, if the user enters 10, 3, 
and *, the program should display 30 as the result.

Your program should handle invalid inputs gracefully, for example, if the user enters an operator that is not one of the four 
allowed operators or if the user enters non-numeric inputs. 
*/
import java.util.*;
public class Calculator {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		BigInteger num1=sc.nextBigInteger();
		sc.nextLine();
		BigInteger num2=sc.nextBigInteger();
		sc.nextLine();
		char operator=sc.nextLine().charAt(0);
		BigInteger ans=BigInteger.ZERO;
		if(operator=='+') {
			ans= num1.add(num2);
			System.out.println(ans);
		}else if(operator=='-') {
			ans= num1.subtract(num2);
			System.out.println(ans);
		}else if(operator=='*') {
			ans=num1.multiply(num2);
			System.out.println(ans);
		}else if(operator=='/') {
			if(!num2.equals(BigInteger.ZERO)) {
				ans=num1.divide(num2);
				System.out.println(ans);				
			}
		}else {
			System.out.println("Invalid Operator");
		}
	}
}
