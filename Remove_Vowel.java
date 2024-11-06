package ipa;
/* Remove Vowel From A String 

 * Input : Arijit Ghosh
 * Output : rjt Ghsh
 */
import java.util.*;
public class Remove_Vowel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String as="";
        List<Character>vowels=new ArrayList<>(Arrays.asList('A','E','I','O','U','a','e','i','o','u'));
        for(int i=0;i<str.length();i++) {
        	if(!vowels.contains(str.charAt(i))) {
        		as+=str.charAt(i);
        	}
        }
        System.out.println(as);
	}

}
