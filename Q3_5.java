import java.util.*;
public class Q3_5{
  public static void main(String[] args){
    System.out.print("正の整数値を入力>");
    int x=new Scanner(System.in).nextInt();
    if(x%2==0){
      System.out.println("これは偶数");
    }else{
      System.out.println("これは奇数");
    }
  }
}
