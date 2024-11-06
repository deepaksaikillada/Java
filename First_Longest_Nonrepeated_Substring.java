package ipa;
//Find the first non repeated character substring
//Arijit = Arij
import java.util.*;
public class First_Longest_Nonrepeated_Substring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		int n=str.length();
		str+=" ";
		String ans="";
		int cnt=0;
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<str.length();j++) {
				if(str.charAt(i)==str.charAt(j)) {
					cnt++;
					ans=str.substring(0,j);
					System.out.println(ans);
					return;
//					break;
				}
			}
//			if(cnt>0) {
//				break;
//			}
		}
		
	}

}
