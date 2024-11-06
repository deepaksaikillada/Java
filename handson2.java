package handson;
import java.util.Scanner;
import java.math.*;
public class handson2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Point p1=new Point(sc.nextInt(),sc.nextInt());
		Point p2=new Point(sc.nextInt(),sc.nextInt());
		
		double ans=findDistance(p1,p2);
		System.out.printf("%.3f",ans);
	}
	
	public static double findDistance(Point p1,Point p2) {
		
		double ans=Math.sqrt((p2.x-p1.x)*(p2.x-p1.x)+(p2.y-p1.y)*(p2.y-p1.y));
		/*
		double ans2=Math.hypot(p2.x-p1.x, p2.y-p1.y);
		*/
		//both ans and ans2 are equal i.e, ans=ans2
		return ans;
	}

}
class Point{
	int x;
	int y;
	Point(int x,int y){
		this.x=x;
		this.y=y;
	}
}