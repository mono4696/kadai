import java.util.*;
public class Q4_6{
	public static void main(String[] args){
		int win=0;
		int loose=0;
		for(int i=0; i<10; i++){
			System.out.println("0(負け)か1(勝ち)かを入力>");
			int n=new Scanner(System.in).nextInt();
			if(n==1){
				win++;
			}else{
				loose++;
			}
		}
		System.out.println("勝ち回数"+win+"回"+"負け回数"+loose+"回");
	}
}
