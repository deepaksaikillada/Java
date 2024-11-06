package ipa;
/* Find number of lower case in a string
 * AriJIt = 3
 */
import java.util.*;
public class Count_LowerCase {
/*
 * 'a' -> 'z' = [97,122]
 * 'A' -> 'Z' = [65,90]
 * '0' -> '9' = [48,57]
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String x=sc.nextLine();
		int cnt=0;
		for(int i=0;i<x.length();i++) {
//			if(x.charAt(i)>='a' && x.charAt(i)<='z') {
			if(x.charAt(i)>=97 && x.charAt(i)<=122) {
//			if(Character.isLowerCase(x.charAt(i))){
				cnt++;
			}
		}
		System.out.println(cnt);
	}

}
