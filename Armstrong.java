package ipa;
/*Write a Java program to check if a given number is an Armstrong number or not.

Here's an example of the expected input and output:

Input number: 153
Output: "Yes, the number is an Armstrong number."

*/

import java.util.*;
import java.lang.*;
public class Armstrong {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		long n=sc.nextLong();
		sc.nextLine();
		
		long original=n;
		int k=String.valueOf(n).length();
			
		long sum=0;
		while(n>0) {
			long unitsDigit = n % 10;
			sum+= Math.pow(unitsDigit ,k);
			n /= 10;
		}
		if(sum==original) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
		sc.close();
//		String str=Long.toString(n);
//
//		long ans=0;
//		for(int i=0;i<str.length();i++) {
//			ans+= (Math.pow(Integer.parseInt(String.valueOf(str.charAt(i))), str.length()));
//		}
////		String x=Integer.toString(ans);
////		if(x.equals(str)) {
//		if(ans==n) {
//			System.out.println("Yes");
//		}else {
//			System.out.println("No");
//		}
	}
}
