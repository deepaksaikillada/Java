package ipa;
/* Write a Java program that takes a user input integer n and prints the Fibonacci series up to n.

The Fibonacci series is a series of numbers in which each number is the sum of the two preceding numbers. 
The first two numbers in the series are 0 and 1. For example, the first 10 numbers in the Fibonacci series are: 
0, 1, 1, 2, 3, 5, 8, 13, 21, 34.

The program should use a for loop to generate the series.

Sample Input:
20

Sample Output:
0 1 1 2 3 5 8 13

Explanation:
The Fibonacci series up to 20 is: 0, 1, 1, 2, 3, 5, 8, 13. Therefore, the output is "0 1 1 2 3 5 8 13". 
*/

import java.util.*;
public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		List<Integer>ans=fib(n);
		System.out.println(ans);
		for(Integer i:ans) {
			System.out.print(i+ " ");
		}
		System.out.println();
		sc.close();
	}
	public static List<Integer> fib(int n) {
		List<Integer>ans=new ArrayList<>();
		int x1=0;
		ans.add(x1);
		if(n<1) {
			return ans;
		}
//		int x2=1;
//		ans.add(x2);
		int num=1;
		while(num<=n) {
			ans.add(num);
			int num2=num;
			num=num+x1;
			x1=num2;
		}
		return ans;
	}
}
