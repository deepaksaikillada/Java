package handson;
import java.util.*;
public class handson9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		sc.nextLine();
		Books[] books=new Books[n];
		for(int i=0;i<n;i++) {
			int a=sc.nextInt();
			sc.nextLine();
			String b=sc.nextLine();
			String c=sc.nextLine();
			double d=sc.nextDouble();
			sc.nextLine();
			books[i]=new Books(a,b,c,d);
		}
		String search=sc.nextLine();
		Books[] ans=searchTitle(search,books);
		Arrays.sort(ans,(a,b)->Integer.compare(a.getId(),b.getId()));
		for(Books book:ans) {
//			System.out.println(book.getId());
			System.out.println(book);
		}
	}
	public static Books[] searchTitle(String search,Books[] books) {
//		Books[] ans=new Books[];
		List<Books>ans=new ArrayList<>();
		for(int i=0;i<books.length;i++) {
			if(books[i].getTitle().toLowerCase().contains(search.toLowerCase())) {
				ans.add(books[i]);
			}
		}
//		ans.sort((a,b)->Integer.compare(a.getId(),b.getId()));
		return ans.toArray(new Books[0]);
	}

}
class Books{
	int id;
	String title;
	String author;
	double price;
	Books(int id,String title,String author,double price){
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
		return id+"";
	}
}