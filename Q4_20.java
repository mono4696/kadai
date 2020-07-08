import java.util.*;
public class Q4_20{
	public static void main(String[] args){
		System.out.print("好きな数値を入力>");
		int n=new Scanner(System.in).nextInt();
		for(int i=0; i<n; i++){
			for(int y=0; y<=i; y++){
				System.out.print("$");
			}
			System.out.println();
		}
	}
}
