import java.util.*;
public class Q6_3_2{
	public static void main(String[] args){
    Scanner scan=new Scanner(System.in);
		System.out.print("整数を入力>");
		int num1=scan.nextInt();
		System.out.print("整数を入力>");
		int num2=scan.nextInt();
		System.out.print("整数を入力>");
		int num3=scan.nextInt();
		System.out.print("より大きいのは...");
		mathMax(num1,num2,num3);
    scan.close();
	}
	public static void mathMax(int x,int y,int z){
		if(x<z && y<z){
		  System.out.println(z);
    }else if(x<y && z<y){
		  System.out.println(y);
    }else{
		  System.out.println(x);
    }
	}
}
