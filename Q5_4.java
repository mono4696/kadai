import java.util.*;
public class Q5_4{
  public static void main(String[] args){
    int[] num=new int[10];
    int sum=0;
    int count=0;
    while(count<10 && sum<=100){
	  System.out.print("数値を入力>");
	  num[count]=new Scanner(System.in).nextInt();
      sum+=num[count];
      count++;
	  if(sum>100){
		  System.out.println(sum);
		  break;
	  }
    }
    for(int i=0; i<count; i++){
      System.out.print(" "+num[i]);
    }
    
  }
}
