import java.util.*;
public class Q5_8{
   public static void main(String[] args){
	   //10個の整数を入力して、それを小さい順に並べ替える。
      int[] values=new int[10];
      for(int i=0; i<10; i++){
	  	System.out.print("整数を入力>");
	  	int num=new Scanner(System.in).nextInt();
		values[i]+=num;
	  }
	  //入れ替え（小さい順にする)
      for(int i=0; i<10; i++){
     	for(int j=i+1; j<10; j++){
       	  if(values[i] > values[j]){
            int temp=values[i];
           	values[i]=values[j];
            values[j]=temp;
           }
      	 }
       } 
	  //表示(入れ替えが済んでいるので小さい順に出る)
       for(int i=0; i<10; i++){
         System.out.print( values[i] + " " );
	   }
   }
}
