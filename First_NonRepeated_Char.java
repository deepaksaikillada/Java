package ipa;
/*Write a Java program to find the first non-repeated character in a given string.

Here's an example of the expected input and output:

Input string: "minimum"
Output: "n"

*/
import java.util.*;
public class First_NonRepeated_Char {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
//		str+=" ";
		HashMap<Character,Integer>ans=new LinkedHashMap<>();
		Character ch;
		for(int i=0;i<str.length();i++) {
//			for(int j=i+1;j<str.length();j++) {
//				if(!ans.contains(str.charAt(i))) {
//					ch=str.charAt(i);
//				}
			
//			}
			ans.put(str.charAt(i),ans.getOrDefault(str.charAt(i),0)+1);
		}
		for(Map.Entry<Character,Integer> entry: ans.entrySet()) {
			if(entry.getValue()==1) {
				System.out.println(entry.getKey());
				return;
			}
		}
		/*
		 *  for (int i = 0; i < s.length(); i++) 
        {
            int count=0;
            for (int j = 0; j < s.length(); j++) 
            {
                if(i!=j && s.charAt(i)==s.charAt(j))
                {
                    count++;
                    break;
                }
            }
            if(count==0)
            {
                System.out.println(s.charAt(i));
                break;
            }
        }
		 */
	}

}
