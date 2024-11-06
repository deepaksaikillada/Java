package ipa;
/*
Write a program that reads in a list of integers and prints out the smallest and largest integer in the list.

Your program should first ask the user to enter the number of integers they want to input. Then it should prompt the user to 
enter each integer one by one.

After all the integers have been entered, the program should output the smallest and largest integer in the list.

Input
-------------------------
Enter the number of integers: 5
Enter integer 1: 10
Enter integer 2: -5
Enter integer 3: 20
Enter integer 4: 0
Enter integer 5: 15

Output
-------------------------
Smallest integer: -5
Largest integer: 20

 */
import java.util.*;
public class Large_Small {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 *  Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of integers: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) 
        {
            System.out.print("Enter integer "+(i+1)+": ");
            arr[i] = sc.nextInt();sc.nextLine();
        }
        Arrays.sort(arr);
        System.out.println("Smallest integer: "+arr[0]);
        System.out.println("Largest integer: "+arr[n-1]);
		 */
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		List<Integer>ans=new ArrayList<>();
		for(int i=0;i<n;i++) {
			int x=sc.nextInt();
			ans.add(x);
		}
		//
//		ans.reversed();
		Collections.reverse(ans);
//		ans.sort(null);
		System.out.println(ans.get(0));
		System.out.println(ans.get(n-1));
		
//		//1st sol
//		ans.sort(null);
//		System.out.println(ans.getFirst());
//		System.out.println(ans.getLast());
		
		
		//2nd sol
//		ans.sort(null);
//		for(Integer i:ans) {
//			System.out.println(i);
//			break;
//		}
//		ans.sort((a,b)->Integer.compare(b, a));
//
//		for(Integer i:ans) {
//			System.out.println(i);
//			break;
//		}
	}

}
