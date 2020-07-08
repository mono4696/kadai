import java.util.*;
public class Q4_5{
	public static void main(String[] args){
		int sum=0;
		for(int i=0; i<10; i++){
			System.out.println("整数を入力>");
			int n=new Scanner(System.in).nextInt();
			sum+=n;
		}
		System.out.println("平均値"+sum/10);
	}
}
