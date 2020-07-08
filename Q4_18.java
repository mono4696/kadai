import java.util.*;
public class Q4_18{
	public static void main(String[] args){
		int sum=0;
		while(true){
			System.out.print("好きな数値を入力(0で終了)>");
			int n=new Scanner(System.in).nextInt();
			sum+=n;
			if(n==0){
				System.out.println("合計は"+sum);
				break;
			}
		}
	}
}
