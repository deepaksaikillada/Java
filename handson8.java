package handson;
import java.util.*;
public class handson8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		sc.nextLine();
		Shirt[] shirt=new Shirt[n];
		for(int i=0;i<n;i++) {
			int a=sc.nextInt();
			sc.nextLine();
			String b=sc.nextLine();
			double c=sc.nextDouble();
			sc.nextLine();
			char d=sc.nextLine().charAt(0);
			shirt[i]=new Shirt(a,b,c,d);
		}
		double price=sc.nextDouble();
		for(Shirt discount:shirt) {
			System.out.println(getDiscountPrice(discount));
		}
//		double discount=getDiscountPrice(shirt);
		Shirt[] ans=getShirtWithMoreThanSpecificPrice(shirt,price);
		for(Shirt s:ans) {
			System.out.println(s);
		}
	}
	public static double getDiscountPrice(Shirt shirt) {
		double ans=0;
//		for(int i=0;i<4;i++) {
			if(shirt.getGender()=='m') {
				ans=(1-0.1)*(shirt.getPrice());
			}else if(shirt.getGender()=='f') {
				ans=(1-0.2)*(shirt.getPrice());
			}else if(shirt.getGender()=='u') {
				ans=(1-0.3)*(shirt.getPrice());
			}
//		}
		return ans;
	}
	public static Shirt[] getShirtWithMoreThanSpecificPrice(Shirt[] shirt,double price) {
//		int cnt=0;
		List<Shirt>ans=new ArrayList<>();
		for(int i=0;i<shirt.length;i++) {
			if(shirt[i].getPrice()>price) {
				ans.add(shirt[i]);
			}
		}
//		Shirt[] s=ans.toArray(new Shirt[0]);
//		Arrays.sort(s,(a,b)->Double.compare(a.getPrice(),b.getPrice()));
//		return s;
		ans.sort((a,b)->Double.compare(a.getPrice(), b.getPrice()));
//		-- Shirt[] ans=new Shirt[cnt];
	
		return ans.toArray(new Shirt[0]);
	}
}

class Shirt{
	int tag;
	String brand;
	double price;
	char gender;
	Shirt(int tag,String brand,double price,char gender){
		this.tag=tag;
		this.brand=brand;
		this.price=price;
		this.gender=gender;
	}
	public void setTag(int tag) {
		this.tag=tag;
	}
	public int getTag() {
		return this.tag;
	}
	
	public void setBrand(String brand) {
		this.brand=brand;
	}
	public String getBrand() {
		return this.brand;
	}
	
	public void setPrice(double price) {
		this.price=price;
	}
	public double getPrice() {
		return this.price;
	}
	
	public void setGender(char gender) {
		this.gender=gender;
	}
	public char getGender() {
		return this.gender;
	}
	@Override
	public String toString() {
		return tag+" "+price+" "+brand;
	}
}
