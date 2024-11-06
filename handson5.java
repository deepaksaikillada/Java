package handson;
import java.util.Arrays;
import java.util.Scanner;
import java.math.*;
public class handson5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
//		sc.nextLine();
		int[] nums=new int[n];
		for(int i=0;i<n;i++) {
			nums[i]=sc.nextInt();
			System.out.println(fact(nums[i]));
//			sc.nextLine();
			
		}
		
//		int[] arr=Arrays.copyOf(nums, n);
//		for(int it:arr) {
//			System.out.println(it);
//		}
		
//		Arrays.sort(nums);
//		System.out.println("\nThe sorted array is: ");
//        for (int num : nums) {
//            System.out.print(num + " ");
//        }
        
        
//        Arrays.binarySearch(nums, 2);
		
	}
	public static BigInteger fact(long num) {
		BigInteger x=BigInteger.ONE;
		
		if(num<=1) {
			return BigInteger.ONE;
		}
		
		while(num>1) {
//			x=x.multiply(new BigInteger(num+""));
			x=x.multiply(BigInteger.valueOf(num));
			num--;
		}
//		x.longValue();
//		x.intValue();
//		x.abs();
//		x.isProbablePrime(0); //0 or 1 is low certainty level it shouldn't identify correctly, like composite as primes
//		x.isProbablePrime(20); //20 is best and high certainty level to identify correctly primes
//		x.nextProbablePrime();
//		x.add(x);
//		x.subtract(x);
//		x.multiply(x);
//		x.divide(x);
//		x.gcd(x);
//		x.divideAndRemainder(x);
//		BigInteger.valueOf(1);
		return x;
		
	}

}
