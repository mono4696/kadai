import java.util.*;
public class Q6_2{
	public static void main(String[] args){
    Scanner scan=new Scanner(System.in);
		System.out.print("整数を入力>");
		int num1=scan.nextInt();
		System.out.print("整数を入力>");
		int num2=scan.nextInt();
		System.out.print("二つの整数の平均は...");
		average(num1,num2);
    scan.close();
	}
	public static void average(int i,int j){
		int ans=(i+j)/2;
		System.out.println(ans);
	}
}
