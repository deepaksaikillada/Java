package handson;
import java.util.Scanner;
public class handson3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Point1 p1=new Point1(sc.nextDouble(),sc.nextDouble());
		Point1 p2=new Point1(sc.nextDouble(),sc.nextDouble());
		Point1 p3=new Point1(sc.nextDouble(),sc.nextDouble());
		
		Point1 ans=pointHighOrigin(p1,p2,p3);
		System.out.printf("%.1f",ans.x);
		System.out.println();
		System.out.printf("%.1f",ans.y);
	}
	
	public static Point1 pointHighOrigin(Point1 p1,Point1 p2,Point1 p3) {
		
		double dist1=Math.sqrt((p1.x)*(p1.x)+(p1.y)*(p1.y));
		double dist2=Math.sqrt((p2.x)*(p2.x)+(p2.y)*(p2.y));
		double dist3=Math.sqrt((p3.x)*(p3.x)+(p3.y)*(p3.y));
		double ans=Math.max(dist1, Math.max(dist2, dist3));
		Point1 a;
		if(ans==dist1) {
//			return p1;
			a=new Point1(p1.x,p1.y);
		}else if(ans==dist2) {
//			return p2;
			a=new Point1(p2.x,p2.y);
		}else {
//			return p3
			a=new Point1(p3.x,p3.y);
		}
//		return dis1>dis2?(dis1>dis3?p1:p3):(dis2>dis3?p2:p3);
		return a;
	}

}
class Point1{
	double x;
	double y;
	Point1(double x,double y){
		this.x=x;
		this.y=y;
	}
}