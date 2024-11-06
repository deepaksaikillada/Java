package TCS;
import java.util.Scanner;
public class first {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello This is my first code!!.. "); //Hello This is my first code!!.. 
		
		System.out.println("Enter your input: "); //Enter your input: 
		
		Scanner sc1=new Scanner(System.in); //asks input:- Deepak Sai Killada
		String name_upto_space=sc1.next(); //takes input upto next space only not nextline:- Deepak 
		
		System.out.println("Name-Upto-Space: "+name_upto_space);	//Name-Upto-Space: Deepak
//		sc1.close();
		
		System.out.println("Enter your input: "); //Enter your input: 
		
		Scanner sc2=new Scanner(System.in); //asks input:- Deepak Sai Killada
		String fullname=sc2.nextLine(); //takes input upto next line so:- Deepak Sai Killada
		
		System.out.println("Full-Name: "+fullname); //		Full-Name: Deepak Sai Killada
		sc2.close();
		
		
//		Hello This is my first code!!.. 
//		Enter your input: 
//		Deepak Sai Killada
//		Name-Upto-Space: Deepak
//		Enter your input: 
//		Deepak Sai Killada
//		Full-Name: Deepak Sai Killada

	}

}
