package ipa;

import java.util.*;
/* Count number of vowel, consonent and digit into a string */
/*
 * 'a' -> 'z' = [97,122]
 * 'A' -> 'Z' = [65,90]
 * '0' -> '9' = [48,57]
 */
public class CountVowel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		List<Character>vowels=new ArrayList<>(Arrays.asList('a','e','i','o','u','A','E','I','O','U'));
		int cntv=0,cntc=0,cntd=0;
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(Character.isLetterOrDigit(ch)) {
				if(Character.isLetter(ch)) {
					if(vowels.contains(ch)) {
						cntv++;
					}else {
						cntc++;
					}					
				}else {
					cntd++;
				}
			}
		}
		System.out.println("Vowel : "+cntv);
        System.out.println("Consonant : "+cntc);
        System.out.println("Number : "+cntd);
	}

}
