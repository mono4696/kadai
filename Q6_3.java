import java.util.*;
public class Q6_3{
	public static void main(String[] args){
    Scanner scan=new Scanner(System.in);
		System.out.print("整数を入力>");
		int num1=scan.nextInt();
		System.out.print("整数を入力>");
		int num2=scan.nextInt();
		System.out.print("より大きいのは...");
		mathMax(num1,num2);
    scan.close();
	}
	public static void mathMax(int i,int j){
		int ans=Math.max(i,j);
		System.out.println(ans);
	}
}
