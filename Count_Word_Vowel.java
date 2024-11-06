package ipa;
/* Count the words in a sentence which are start with vowel. 
 * 
 * Input: Arijit is student of MCA
 * Output: 3
 * 
 * Input: Sara plays tennis
 * Output: No such words
*/
import java.util.*;
public class Count_Word_Vowel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String[] arr=str.split("\\s+");
		List<Character>vowels=new ArrayList<>(Arrays.asList('a','e','i','o','u','A','E','I','O','U'));
		int cnt=0;
		for(int i=0;i<arr.length;i++) {
			if(!arr[i].isEmpty()) {
				if(vowels.contains(arr[i].charAt(0))) {
					cnt++;
				}
			}
		}
		if(cnt==0) {
			System.out.println("No such words");
			return;
		}
		System.out.println(cnt);
	}

}
