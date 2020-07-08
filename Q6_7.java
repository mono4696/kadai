import java.util.*;
public class Q6_7{
	//素数かどうか判定して、10000以上10100未満の素数を全て表示する
    //素数とは、1と自分自身でしか割り切れない、1以外の数
	public static void main(String[] args){
    	for(int i=10000; i<10100; i++){
			if(prime(i)){
			System.out.print(i+" ");
			}
    	}
    	System.out.println();
	}
	public static boolean prime(int x){
    	if(x<=3){
      		return true;
    	}
		//2 ~ xの1/2の数までを使って順番にxを割っていく
		//最後まで割りきれなければtrue(素数である)
		for(int i=2; i<=(x/2); i++){
      		if((x%i)==0){
        		return false;
      		}
    	}
    	return true;
	}
}
