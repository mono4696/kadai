import java.util.*;
public class Q3_6{
  public static void main(String[] args){
    System.out.print("整数値を入力>");
    int x=new Scanner(System.in).nextInt();
    if((x%2)==0 && x>0 || x==0){
      System.out.println("これは正の偶数");
    }else if((x%2)==0 && x<0){
      System.out.println("これは負の偶数");
    }else if((x%2)!=0 && x>0){
      System.out.println("これは正の奇数");
    }else{
      System.out.println("これは負の奇数");
    }
  }
}
