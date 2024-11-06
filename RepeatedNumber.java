package ipa;
//a2b3c1 = aabbbc
import java.util.*;
public class RepeatedNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String ans="";
        char prev='\0';
        for(int i=0;i<str.length();i++) {
        	char ch=str.charAt(i);
        	if(Character.isAlphabetic(ch)) {
        		prev=ch;
        		ans+=ch;
        	}else if(Character.isDigit(ch) && Character.isAlphabetic(prev)) {
        		int x=Integer.parseInt(String.valueOf(ch));
        		while(x-->1){
        			ans+=prev;
        		}
        	}
        }
        System.out.println(ans);
	}

}
