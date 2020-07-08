import java.util.*;
public class Q4_9{
	public static void main(String[] args){
		int max=0;
		int min=0;
		for(int i=0; i<10; i++){
			System.out.print("整数をを入力>");
			int n=new Scanner(System.in).nextInt();
			if(n==0){
				max=n;
				min=n;
			}
			if(n>max){
				max=n;
			}
			if(n<min){
				min=n;
			}
		}
		System.out.println("最大値は"+max+"、最小値は"+min);
	}
}
