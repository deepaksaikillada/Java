package ipa;
import java.util.*;
import java.lang.*;
//aabbbcc = a2b3c2
//abbccc = a1b2c3
public class CharRepeat {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		char ch=str.charAt(0);				
		String s="";
		int cnt=1;
		for(int i=1;i<str.length();i++) {
			if(str.charAt(i)==str.charAt(i-1)) {
				cnt++;
			}else {
				s= s+ch+cnt;
				cnt=1;
				ch=str.charAt(i);
			}
		}
		System.out.println(s+ch+cnt);
	}
}
