package ipa;
/*Given a sentence, Find words that start with a capital letter.

For example, in the sentence "The quick Brown Fox jumps over the lazy dog",
 there are three words that start with a 
capital letter: "The", "Brown", and "Fox". */
import java.util.*;
public class Find_UpperCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String[] arr=str.split("\\s+");
		List<String>ans=new ArrayList<>();
		
		for (String s : arr) { 
			if (s.charAt(0) >= 65 && s.charAt(0) <= 90) { 
				ans.add("\"" + s + "\""); 
			} 
		} 
		
		if (!ans.isEmpty()) { 
			System.out.print(String.join(", ", ans) + "."); 
		} else { 
				System.out.println("No words start with a capital letter.");
		}
	
//		for(String s:arr) {
//			if(s.charAt(0)>=65 && s.charAt(0)<=90) {
////				ans.add(s);
//				System.out.printf('"'+"%s",s + '"'+", ");
//			}
//			
//		}
//		
	}

}
