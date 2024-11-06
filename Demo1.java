package ipa;
//count of odd digits in the given integer number >3 then true other wise false
import java.util.*;
public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		int cnt=0;
		while(x>0) {
			int rem=x%10;
			if(rem%2!=0) {
				cnt++;
			}
			x/=10;
		}
//		System.out.println(cnt);
		if(cnt>=3) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
	}

}
