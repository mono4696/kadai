import java.util.*;
public class Q4_19{
	public static void main(String[] args){
		int sum=0;
		int count=0;
		while(true){
			System.out.print("好きな数値を入力(0で終了)>");
			int n=new Scanner(System.in).nextInt();
			sum+=n;
			count++;
			if(n==0){
				System.out.println("平均値は"+(sum/count));
				break;
			}
		}
	}
}
