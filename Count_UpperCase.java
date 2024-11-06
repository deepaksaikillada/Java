package ipa;
/* Find number of upper case in a string
 * AriJIt = 3
 */
import java.util.*;
public class Count_UpperCase {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		int cnt=0;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)>=65 && str.charAt(i)<=90) {
//				if(x.charAt(i)>='A' && x.charAt(i)<='Z') {
//				if(Character.isUpperCase(str.charAt(i))){
				cnt++;
			}
		}
		System.out.println(cnt);
	}
}
