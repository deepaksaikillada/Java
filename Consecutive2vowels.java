package ipa;
import java.util.*;
/*Count the number of words in a sentence that contain at least two consecutive vowels (a, e, i, o, u) in them.
Here's a sample input and output:

Input: I enjoy eating spaghetti and meatballs for dinner
Output: 2

Explanation: There are two words in the sentence that contain at least two consecutive vowels - "eating" and "meatballs".
 */

public class Consecutive2vowels {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String[] arr=str.split(" ");
		int cnt=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i].length() >=2 && consecutiveVowels(arr[i])) {
				System.out.println(arr[i]);
				cnt++;
			}
		}
		System.out.println(cnt);
	}
	public static boolean consecutiveVowels(String s) {
		
		int n=s.length();
		char[] nums= {'a','e','i','o','u','A','E','I','O','U'};
		List<Character>arr=new ArrayList<>();
		for(char ch:nums) {
			arr.add(ch);
		}
		s+=" ";
		for(int i=0;i<n;i++) {
			if(arr.contains(s.charAt(i)) && arr.contains(s.charAt(i+1))) {
				return true;
			}
		}
		return false;
	}
}
