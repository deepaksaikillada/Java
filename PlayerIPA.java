package ipa;
import java.util.*;
public class PlayerIPA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Player[] players=new Player[4];
		for(int i=0;i<4;i++) {
			players[i]=new Player(sc.nextInt(),sc.nextLine(),sc.nextInt(),sc.nextLine(),sc.nextLine());
		}
		String playerType=sc.nextLine();
		String matchType=sc.nextLine();
		int runs=LowestRuns(players,playerType);
		if(runs!=Integer.MAX_VALUE)
        {
            System.out.println(runs);
        }
        else
        {
            System.out.println("No such player");
        }
		Integer[] ids=AssId(players,matchType);
		if(ids!=null) {
			 System.out.println("No Player with given match Type");
		}else {
			for(int id:ids) {
				System.out.println(id);
			}
		}
	}
	public static int LowestRuns(Player[] players,String playerType) {
		int ans=Integer.MAX_VALUE;
		for(int i=0;i<4;i++) {
			if(players[i].getPtype().equalsIgnoreCase(playerType)) {
				ans=Math.min(ans, players[i].getRuns());
			}
		}
		return ans;
	}
	public static Integer[] AssId(Player[] players,String mType) {
//		int[] ans=new int[0];
//		int cnt=0;
		List<Integer>ans=new ArrayList<>();
		for(int i=0;i<4;i++) {
			if(players[i].getMtype().equalsIgnoreCase(mType)) {
//				ans[cnt]=players[i].getId();
				ans.add(players[i].getId());
//				cnt++;
			}
		}
		
		/*
		 * if (ans.size() > 0) { 
		 * 	// Convert List<Integer> to int[] 
		 * 	int[] result = new int[ans.size()]; 
			 * for (int i = 0; i < ans.size(); i++) { 
			 * result[i] = ans.get(i); 
			 * } 
		 * 	return result; 
		 * } 
		 * return null;
		 */
		
		if(ans.size()>0) {
//			return ans;
			return ans.toArray(new Integer[0]);
		}
		return null;
	}
}

class Player{
	private int id,runs;
	private String name,pType,mType;
	Player(int id,String name,int runs,String pType,String mType){
		this.id=id;
		this.name=name;
		this.runs=runs;
		this.pType=pType;
		this.mType=mType;
	}
	public int getId(){
		return this.id;
	}
	public int getRuns() {
		return this.runs;
	}
	
	public String getName() {
		return this.name;
	}
	public String getPtype() {
		return this.pType;
	}
	public String getMtype() {
		return this.mType;
	}
}