import java.util.*;
public class Q3_4{
  public static void main(String[] args){
    System.out.print("xの数値を入力>");
    int x=new Scanner(System.in).nextInt();
    System.out.print("yの数値を入力>");
    int y=new Scanner(System.in).nextInt();
    if(x==y){
      System.out.println("xとyは等しい");
    }else if(x<y){
      System.out.println("xはyより小さい");
    }else{
      System.out.println("xはyより大きい");
    }
  }
}
