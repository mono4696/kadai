import java.util.*;
public class Q6_5{
	public static void main(String[] args){
    	Scanner scan=new Scanner(System.in);
		//異なる三つの三角を作りたいので三回回す
    	for(int i=0; i<3; i++){
		   System.out.print("サイズを入力>");
		   int size=scan.nextInt();
		   System.out.print("表示する一文字を入力>");
		   char mozi=scan.next().charAt(0);
		   triangle(size,mozi);
    	}
    	scan.close();
	}
	public static void triangle(int x,char c){
		for(int i=0; i<x; i++){
      		for(int j=0; j<=i; j++){
        		System.out.print(c);
      		}
      		System.out.println();
    	}
	}
}
