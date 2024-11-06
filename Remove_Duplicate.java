package ipa;
/* Remove duplicate characters in a string
 * 
 * Input : Arijit Ghosh
 * Output : Arijt Ghos
 */
import java.util.*;
public class Remove_Duplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String as="";
        Set<Character>ans=new HashSet<>();
        for(int i=0;i<str.length();i++) {
        	if(!ans.contains(str.charAt(i))) {
        		ans.add(str.charAt(i));
        		as+=str.charAt(i);
        	}
        }
        System.out.println(as);
	}

}
