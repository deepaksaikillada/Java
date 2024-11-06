package ipa;
/* Last Character of each word of a sentence

 * Input: Kalyani Government Engineering College
 * Output: itge
 */
import java.util.*;
public class LastChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String ans="";
		String[] arr=str.split("\\s+");
		for(String s:arr) {
			ans+= String.valueOf(s.charAt(s.length()-1)) ;
		}
		System.out.println(ans);
	}

}
