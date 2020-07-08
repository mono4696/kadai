import java.util.*;
public class Q6_8{
  //フィボナッチ数列とは、二つ前の項と一つ前の項を足し合わせていくことで出来る数列。
  //a1=a2=1, a(n+2)=a(n+1)+an(n>=1)
	public static void main(String[] args){
    for(int i=11; i<=20; i++){
      System.out.print(fibnacci(i)+" ");
    }
    System.out.println();
	}
	public static int fibnacci(int x){
    if(x==0){
      return 0;
    }else if(x==1){
        return 1;
    }else{
        return fibnacci(x-2)+fibnacci(x-1);
    }
	}
}
