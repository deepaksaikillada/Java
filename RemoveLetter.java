package ipa;
/* Remove a character from a string
 * Input
 * --------------
 * Arijit
 * i
 * Output
 * ---------------
 * Arjt
 */
import java.util.*;
public class RemoveLetter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        
        char ch=sc.nextLine().charAt(0);
//        String s="";
//        for(int i=0;i<str.length();i++) {
//        	if(str.charAt(i)!=ch) {
//        		s+=str.charAt(i);
//        	}
//        }
        
        String s=str.replace(ch, '\0');
        
//        String ch=sc.nextLine();
//        String s=str.replace(ch, "");
        System.out.println(s);
	}

}
