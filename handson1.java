package handson;
import java.util.Scanner;
//import java.util.*;
//import java.math.*;
public class handson1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Account acc=new Account(sc.nextInt(),sc.nextDouble(),sc.nextDouble());
		int years=sc.nextInt();
		double answer=calculateInterest(acc,years);
		System.out.printf("%.3f",answer);
	}
	public static double calculateInterest(Account acc,int years) {
		
//		double ans=0.0;
		double ans=acc.getInterestRate();
		ans+=(acc.getInterestRate()*years)/100;
		
		return ((acc.getBalance()*ans)/100);
	}

}
class Account{
	int id;
	double balance;
	double interestRate;
	Account(int id,double balance,double interestRate){
		this.id=id;
		this.balance=balance;
		this.interestRate=interestRate;
	}
	public void setId(int id) {
		this.id=id;
	}
	
	public int getId() {
		return this.id;
	}
	
	public void setBalance(double balance) {
		this.balance=balance;
	}
	public double getBalance() {
		return this.balance;
	}
	
	public void setInterestRate(double interestRate) {
		this.interestRate=interestRate;
	}
	public double getInterestRate() {
		return this.interestRate;
	}
}
