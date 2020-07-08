import java.util.*;
public class Q6_1{
	public static void main(String[] args){
		System.out.print("整数を入力>");
		int num=new Scanner(System.in).nextInt();
		System.out.printf("%dを二乗すると...",num);
		reverse(num);
	}
	public static void reverse(int i){
		int ans=i*i;
		System.out.println(ans);
	}
}
