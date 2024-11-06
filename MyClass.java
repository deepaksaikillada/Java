package hackathon;

import java.util.Scanner;
public class MyClass{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Projector[] proj=new Projector[4];
		for(int i=0;i<4;i++) {
			int a=sc.nextInt(); sc.nextLine();
			String b=sc.nextLine();
			int c=sc.nextInt();sc.nextLine();
			int d=sc.nextInt();sc.nextLine();
			String e=sc.nextLine();
			proj[i]=new Projector(a,b,c,d,e);
		}
		int given=sc.nextInt(); sc.nextLine();
		Projector ans=findMaximumPriceByRating(proj,given);
		if(ans==null) {
			System.out.println("No such Projector");
		}else {
			System.out.println(ans.projectorId);
		}
		sc.close();
	}
	public static Projector findMaximumPriceByRating(Projector[] proj,int given){
		Projector ans=null;
		int maxi=Integer.MIN_VALUE;
		for(int i=0;i<4;i++) {
			if(proj[i].rating > given && proj[i].availableIn.equalsIgnoreCase("TataCliq")) {
				maxi=Math.max(maxi,proj[i].price);
				ans=proj[i];
			}
		}
		return ans;
	}
}
class Projector{
	 int projectorId;
	private String projectorName;
	 int price;
	 int rating;
	 String availableIn;
	Projector(int projectorId,String projectorName,int price,int rating,String availableIn){
		this.projectorId=projectorId;
		this.projectorName=projectorName;
		this.price=price;
		this.rating=rating;
		this.availableIn=availableIn;
	}
	
}
/*
 1001
Epson
30000
5
TataCliq
1002
BenQ
40000
4
Amazon
1003
Sony
80000
5
TataCliq
1004
Optomo
7000
3
Flipkart
3
 */
//output :- 1003