package ipa;
/* Check a number is perfect or not

 * Input : 6
 * Output : Perfect Number
 * 
 * Explaination
 * --------------------------
 * The divisors of 6 = 1,2,3. 1+2+3 = 6
 * Sum of the factors is equal to the given number. So this is perfect
 * 
 * Input : 8
 * Output : Not Perfect Number
 * 
 * Explaination
 * -------------------------
 * Factors of 8 = 1,2,4, but 1+2+4 = 7 not equal to 8.
 */
import java.util.*;
public class PerfectNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int sum=0;
		for(int i=1;i<Math.sqrt(n);i++) {
			if(n%i==0 ) {
				sum+=i;
				if(i!=1) {
					sum+= (n/i);					
				}
			}
		}
		if(sum==n) {
			System.out.println("Perfect");
		}else {
			System.out.println("Not Perfect");
		}
	}

}
