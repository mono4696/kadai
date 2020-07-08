import java.util.*;
public class Q5_1{
  public static void main(String[] args){
	  int[] num=new int[10];
	  for(int i=0; i<10; i++){
	  	  System.out.print("数値を入力>");
		  num[i]=new Scanner(System.in).nextInt();
		  System.out.println("2倍すると..."+(num[i]*2));
	  }
  }
}
