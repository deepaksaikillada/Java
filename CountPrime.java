package ipa;
import java.math.BigInteger;
/* Count number of prime digit in a Number 
 * Input : 254786135
 * Output : 5
*/
import java.util.*;
public class CountPrime {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
//		String ans=sc.nextLine();
//		int cnt=0;
//		for(int i=0;i<ans.length();i++) {
//			int num=Integer.parseInt(String.valueOf(ans.charAt(i)));
//			if(isPrime(num)) {
//				cnt++;
//			}
//		}
//		System.out.println(cnt);
//		BigInteger num=BigInteger.ONE;
//		String num1=num.toString();
		int cnt=0;
		String x=sc.nextLine();
		for(int i=0;i<x.length();i++) {
			BigInteger num=BigInteger.ONE;
			num= new BigInteger(String.valueOf(x.charAt(i)));
			if(num.isProbablePrime(20)) {
				cnt++;
			}	
		}
		System.out.println(cnt);
	}
//	public static boolean isPrime(int num) {
//		if(num<2) {
//			return false;
//		}
//		for(int i=2;i*i<=num;i++) {
//			if(num%i==0) {
//				return false;
//			}
//		}
//		return true;
//	}
//	
}	
