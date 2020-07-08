import java.util.*;
public class Q4_12{
	public static void main(String[] args){
		int sum=0;
		while(sum<=100){
		System.out.print("好きな数値を入力>");
		int n=new Scanner(System.in).nextInt();
		sum+=n;
		}
	System.out.println("合計は"+sum);
	}
}
