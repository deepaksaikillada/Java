package ipa;
//Majority of an element means if an element is present in an array for more than n/2 times, 
//where n is the length of the Array
//Array = {3, 3, 4, 2, 4, 4, 2, 4, 4} => 4
import java.util.*;
public class Majority {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
//			int x=sc.nextInt();
			arr[i]=sc.nextInt();
		}
		TreeMap<Integer,Integer>ans=new TreeMap<>();
		for(int i=0;i<n;i++) {
			ans.put(arr[i], ans.getOrDefault(arr[i], 0)+1);
		}
		for(Map.Entry<Integer, Integer> entry:ans.entrySet()) {
			if(entry.getValue()>n/2){
				System.out.println(entry.getKey());
			}
		}
	}

}
