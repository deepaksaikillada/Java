package ipa;
/*
 * You are given a string S consisting of lowercase letters. Your task is to remove all the consecutive duplicates from
 * the string and output the result. For example, if the input string is "abbcddeff", the output should be "abcdef".
 * 
 * Input: abbcddeff
 * Output: abcdef
 */
import java.util.*;
public class Remove2ConsecutiveLetter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		char ch=str.charAt(0);
		String s="";
		for(int i=0;i<str.length();i++) {
			if(i==0) {
				s+=ch;
			}else {
				if(ch!=str.charAt(i)) {
					s+=str.charAt(i);
					ch=str.charAt(i);
				}
			}
		}
		System.out.println(s);
	}

}
