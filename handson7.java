package handson;
import java.util.*;
public class handson7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		sc.nextLine();
		Book[] books=new Book[n];
		for(int i=0;i<n;i++) {
			int id=sc.nextInt();
			sc.nextLine();
			String title=sc.nextLine();
			String author=sc.nextLine();
			double price=sc.nextDouble();
			sc.nextLine();
			books[i]=new Book(id,title,author,price);
		}
		Book[] ans=sortBooksByPrice(books);
		for(Book book:ans) {
			System.out.println(book);
		}
	}
	public static Book[] sortBooksByPrice(Book[] books) {
//		Book[] fin=new Book[4];
//		Arrays.sort(books,(a,b)->a.getPrice()-b.getPrice()); //Type mismatch: cannot convert from double to int
		Arrays.sort(books,(a,b)->Double.compare(a.getPrice(), b.getPrice()));
		return books;
	}
}
class Book{
	int id;
	String title;
	String author;
	double price;
	Book(int id,String title, String author, double price){
		this.id=id;
		this.title=title;
		this.author=author;
		this.price=price;
	}
	public void setId(int id) {
		this.id=id;
	}
	public int getId() {
		return this.id;
	}
	
	public void setTitle(String title) {
		this.title=title;
	}
	public String getTitle() {
		return this.title;
	}
	
	public void setAuthor(String author) {
		this.author=author;
	}
	public String getAuthor() {
		return this.author;
	}
	
	public void setPrice(double price) {
		this.price=price;
	}
	public double getPrice() {
		return this.price;
	}
	@Override
	public String toString() {
		return id+" "+title+" "+author+" "+price;
	}
}