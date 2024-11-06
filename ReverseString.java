package ipa;
/* Reverse of a string
 * Arijit = tijirA
 */
import java.util.*;
public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        StringBuilder ans=new StringBuilder(str).reverse();
        System.out.println(ans);
	}

}
