import java.util.*;
public class Q4_8{
	public static void main(String[] args){
		int max=0;
		for(int i=0; i<10; i++){
			System.out.print("整数をを入力>");
			int n=new Scanner(System.in).nextInt();
			if(n>max){
				max=n;
			}
		}
		System.out.println("最大値は"+max);
	}
}
