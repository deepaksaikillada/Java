package hackathon;
import java.util.*;
public class hacathon1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		sc.nextLine();
		List<Author>author=new ArrayList<>();
		List<Book>books=new ArrayList<>();
		for(int i=0;i<n;i++) {
			int a=sc.nextInt();
			sc.nextLine();
			String b=sc.nextLine();
			author.add(new Author(a,b));
			int c=sc.nextInt();
			sc.nextLine();
			String d=sc.nextLine();
			String e=sc.nextLine();
			double f=sc.nextDouble();
			sc.nextLine();
			Author bookAuthor=new Author(a,b);
			books.add(new Book(c,d,e,f,bookAuthor));
		}
		String genre1=sc.nextLine();
		String genre2=sc.nextLine();
		double discount=sc.nextDouble();
		sc.nextLine();
		List<Book>ans4=Business.getBooksBelongingToAGenre(books,genre1);
		if(ans4.isEmpty()) {
			System.out.println("Genre is not available in the lsit");
		}else {
			for(Book res:ans4) {
				System.out.println("AuthorName: "+res.author.authorName+ ", Title: "+res.title);				
			}
		}
		
		List<Book>ans5=Business.calculateDiscountedPrice(books,genre2,discount);
		if(ans5.isEmpty()) {
			System.out.println("Discounted books are unavailable in the given genre.");
		}else {
			System.out.println("Discounted "+genre2+" Books:");
			for(Book res2:ans5) {
				System.out.printf("AuthorName: "+res2.author.authorName+", Title: "+res2.title+", Updated Price: %.1f\n",res2.price);
//				System.out.println("AuthorName: "+res2.author.authorName+", Title: "+res2.title+", Updated Price: "+res2.price);
				System.out.println();
			}
		}
	}
}
class Author{
	int authorId;
	String authorName;
	Author(int authorId,String authorName){
		this.authorId=authorId;
		this.authorName=authorName;
	}
}

class Book{
	int bookId;
	String title;
	String genre;
	double price;
	Author author;
	Book(int bookId,String title,String genre,double price,Author author){
		this.bookId=bookId;
		this.title=title;
		this.genre=genre;
		this.price=price;
		this.author=author;
	}
}
class Business{
	public static List<Book> getBooksBelongingToAGenre(List<Book>books,String genre1){
		List<Book>ans=new ArrayList<>();
//		Book[] fin=new Book[books.size()];
//		books.toArray();
		for(Book book:books) {
			if(book.genre.equalsIgnoreCase(genre1)) {
				ans.add(book);
			}
		}
		
		return ans;
	}
	
	public static List<Book> calculateDiscountedPrice(List<Book>books,String genre2,double discount){
		List<Book>ans2=new ArrayList<>();
		for(Book book:books) {
			if(book.genre.equalsIgnoreCase(genre2)) {
				 // Print original price and discount for debugging
//				 System.out.println("Original Price: " + book.price);
//	                System.out.println("Discount: " + discount);

				double updatedPrice= (book.price- ((book.price*discount)/100));
				 // Print updated price for debugging
//                System.out.println("Updated Price: " + updatedPrice);

				ans2.add(new Book(book.bookId,book.title,book.genre,updatedPrice,book.author));
			}
		}
		return ans2;
	}
}