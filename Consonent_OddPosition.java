package ipa;
/* Find the characters in odd position of a string which are consonent
 * 
 * Input: Arijit Ghosh
 * Output: hs
 */
import java.util.*;
public class Consonent_OddPosition {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String fina="";
		List<Character>ans=new ArrayList<>(Arrays.asList('a','e','i','o','u','A','E','I','O','U'));
		for(int i=0;i<str.length();i++) {
			if( (i+1) % 2 != 0 && !ans.contains(str.charAt(i)) && str.charAt(i)!=' ') {
				fina= fina+ str.charAt(i);
			}
		}
		System.out.println(fina);
	}
}
