package handson;
import java.util.Scanner;
public class handson4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		int mini=Integer.MAX_VALUE;
		
		for(int i=0;i<s.length();i++) {
			int x=(int)s.charAt(i);
//			mini=Math.min(mini, x);
			if(mini>x) {
//				ch=s.charAt(i);
				mini=x;
			}
		}
		System.out.println((char)mini);
		
		
//		Scanner sc=new Scanner(System.in);
//		String s=sc.next();
//		int[] nums=new int[s.length()];
//		for(int i=0;i<s.length();i++) {
//			nums[i]=(int)s.charAt(i);
//		}
//		int mini=nums[0];
//		for(int i=1;i<nums.length;i++) {
//			mini=Math.min(mini, nums[i]);
//		}
//		char ch=(char)mini;
//		System.out.println(ch);
	}

}
