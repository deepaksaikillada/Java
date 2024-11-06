package hackathon;
import java.util.*;
/*
 * input1:- 123456
 * output1:- True;
 * 
 * input2:- 123
 * output2:- False;
 * 
 * input3:- 24680
 * output3:- False;
 * 
 * input4:- 135
 * output4:- True;
 */
public class demo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int cnt=0;
//		String str=String.valueOf(n);
//		for(int i=0;i<str.length();i++) {
//			if(Integer.parseInt(str.valueOf(str.charAt(i)))%2!=0) {
//				cnt++;
//			}
//		}
		while(n>0) {
			int rem=n%10;
			if(rem%2!=0) {
				cnt++;
			}
			n/=10;
		}
		if(cnt>=3) {
			System.out.println("TRUE");
		}else {
			System.out.println("FALSE");
		}
		System.out.println();
	}

}
