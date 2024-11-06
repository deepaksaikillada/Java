package ipa;
import java.util.*;
/* Input : Home, Sweet Home
 * 
* 		   Home
* 
* Output : Number of that word present in the sentence : 2
* 
* Process
* ----------
* The word Home present in the sentence 2 times
*/
public class Find_CountWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String ans=sc.nextLine();
		String[] arr=str.split("\\W+");
		int cnt=0;
		for(String word:arr) {
			if(word.equalsIgnoreCase(ans)) {
				cnt++;
			}
		}
		System.out.printf("Number of that %s present in the sentence : %d",ans,cnt);
	}

}
