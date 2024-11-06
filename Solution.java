package hackathon;

import java.util.Scanner;
import java.util.*;
public class Solution{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		sc.nextLine();
		Student[] stud=new Student[n];
		for(int i=0;i<n;i++) {
			int a=sc.nextInt();
			sc.nextLine();
			String b=sc.nextLine();
			int c=sc.nextInt();
			sc.nextLine();
			stud[i]=new Student(a,b,c);
		}
		String ans=findStudentWithhighestTotal(stud);
		System.out.println(ans);
		List<Integer>ans2=searchStudentsBypercentage(stud);
		if(ans2==null) {
			System.out.println("No Student found with mentioned attribute.");
		}else {
			for(int res:ans2) {
				System.out.println(res);
			}
		}
	}
	public static String findStudentWithhighestTotal(Student[] stud) {
		String ans="";
		int maxi=Integer.MIN_VALUE;
		for(int i=0;i<stud.length;i++) {
			if(stud[i].totalmarksobt >maxi) {
				maxi=stud[i].totalmarksobt;
				ans=stud[i].name.toUpperCase();
			}
		}
		return ans;
	}
	public static List<Integer> searchStudentsBypercentage(Student[] stud){
		List<Integer>ans=new ArrayList<>();
		for(int i=0;i<stud.length;i++) {
			if((stud[i].totalmarksobt ) >=280) {
				ans.add(stud[i].id);
			}
		}
		ans.sort((a,b)->Integer.compare(a,b));
//		ans.toArray();
		if(ans.isEmpty()) {
			return null;
		}else {
			return ans;
		}
//		return ans;
	}
}

class Student{
	int id;
	String name;
	int totalmarksobt;
	Student(int id,String name,int totalmarksobt){
		this.id=id;
		this.name=name;
		this.totalmarksobt=totalmarksobt;
	}
}