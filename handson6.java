package handson;
import java.util.*;
public class handson6 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		sc.nextLine();
		Document[] doc=new Document[n];
		for(int i=0;i<n;i++) {
			int id=sc.nextInt();
			sc.nextLine();
			String title=sc.nextLine();
			String folderName=sc.nextLine();
			int pages=sc.nextInt();
			sc.nextLine();
			 doc[i]=new Document(id,title,folderName,pages);
//			Document doc=new 
		}
		Document[] fin=docWithOddPages(doc);
		for(Document d:fin) {
			System.out.println(d);
		}
	}
	public static Document[] docWithOddPages(Document[] doc) {
		int x=0;
		int z=doc.length;
		for(int i=0;i<z;i++) {
			if(doc[i].getPages()%2!=0) {
				x++;
			}
		}
		Document[] ans=new Document[x];
		int y=0;
		for(int i=0;i<z;i++) {
			if(doc[i].getPages()%2!=0) {
				ans[y]=doc[i];
				y++;
			}
		}
//		Arrays.sort(ans,(a,b)->Integer.compare(a.getId(), b.getId()));
		Arrays.sort(ans,(a,b)->a.getId()-b.getId());
		
		return ans;
	}
}
class Document{
	int id;
	String title;
	String folderName;
	int pages;
	Document(int id,String title,String folderName,int pages){
		this.id=id;
		this.title=title;
		this.folderName=folderName;
		this.pages=pages;
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
	
	public void setFolderName(String folderName) {
		this.folderName=folderName;
	}
	public String getFolderName() {
		return this.folderName;
	}
	
	public void setPages(int pages) {
		this.pages=pages;
	}
	public int getPages() {
		return this.pages;
	}
	@Override
    public String toString() {
		return id+" "+title+" "+folderName+" "+pages;
		
//        return "Document{" +
//                "id=" + id +
//                ", title='" + title + '\'' +
//                ", folderName='" + folderName + '\'' +
//                ", pages=" + pages +
//                '}';
		
    }
}