package ipa;
/* Count number of word in a string
*Note : Always ignore the spaces if more than 1 space given between two word

Sample Input : 1
------------------------
Kalyani Goverment Engineering College

Process
---------------------------
[Kalyani, Goverment, Engineering, College]

Output
---------------------------
Number of word : 4
*************************************
Sample Input : 2
------------------------
Kalyani Goverment  Engineering College

Process
---------------------------
[Kalyani, Goverment, , Engineering, College]

Output
---------------------------
Number of word : 4
*/
import java.util.*;
public class Count_Word {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
//		String[] arr=str.split(" ");//for single space
		//String[] arr=str.split("\\s"); //for single space 
		String[] arr=str.split("\\s+"); //for single or multiple or infinite space
		int cnt=0;
		for(int i=0;i<arr.length;i++) {
//			if(arr[i]!=" " && arr[i]!="") { //for single or double space words checking
			if(!arr[i].isEmpty()) {
				cnt++;
			}
		}
		System.out.println(arr.length);
		System.out.println(cnt);
	}
}
