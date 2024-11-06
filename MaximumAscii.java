package ipa;
/* Find the Maximum Ascii valued character in a String
 * Arijit = t
 * priyanka = y
 * Aa = a
 */
import java.util.*;
public class MaximumAscii {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		Character ch=str.charAt(0);
		for(int i=0;i<str.length();i++) {
			if((int)ch<(int)str.charAt(i)) {
				ch=str.charAt(i);
			}
		}
		System.out.println(ch);
		System.out.println((int)ch); //y=121
	}

}
