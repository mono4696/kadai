import java.util.*;
public class Q4_7{
	public static void main(String[] args){
		int gsum=0;
		int hsum=0;
		for(int i=1; i<=9; i++){
			System.out.print(i+"回表、巨人の得点を入力>");
			int gp=new Scanner(System.in).nextInt();
			gsum+=gp;
			System.out.print(i+"回裏、阪神の得点を入力>");
			int hp=new Scanner(System.in).nextInt();
			hsum+=hp;
		}
		System.out.println("巨人:"+gsum+"点、阪神:"+hsum+"点");
		if(gsum==hsum){
			System.out.println("同点");
		}else if(gsum<hsum){
			System.out.println("阪神の勝ち");
		}else{
			System.out.println("巨人の勝ち");	
		}
	}
}
