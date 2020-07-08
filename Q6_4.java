import java.util.*;
public class Q6_4{
	public static void main(String[] args){
    Scanner scan=new Scanner(System.in);
		System.out.print("サイズを入力>");
		int size=scan.nextInt();
		triangle(size);
    scan.close();
	}
	public static void triangle(int x){
		for(int i=0; i<x; i++){
      for(int j=0; j<=i; j++){
        System.out.print("$");
      }
      System.out.println();
    }
	}
}
