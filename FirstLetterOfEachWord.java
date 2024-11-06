package ipa;
/* Find first letter of each word in a string 
Input : Kalyani Govt. Eng. College
Output : KGEC
*/ 
import java.util.*;
public class FirstLetterOfEachWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String[] arr=str.split("\\W+");
		String ans="";
		for(String s:arr) {
			ans+= s.charAt(0);
		}
		System.out.println(ans);
	}

}
