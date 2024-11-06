package ipa;
/* Minimum Ascii valued character in a String */
import java.util.*;
public class Smallest_Character {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	     String s =sc.nextLine();
//	     char ch=128;
	     char ch=s.charAt(0);
	     for(int i=0;i<s.length();i++) {
	    	 if(ch>s.charAt(i)) {
	    		 ch=s.charAt(i);
	    	 }
	     }
	     System.out.println(ch);
	}

}
