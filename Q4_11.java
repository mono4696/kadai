import java.util.*;
public class Q4_11{
	public static void main(String[] args){
		System.out.print("好きな数値を入力>");
		int n=new Scanner(System.in).nextInt();
		int out=0;
		for(int i=0; i<n; i++){
			System.out.print(out++);
			if(out>9){
				out=0;
			}
		}
	}
}
