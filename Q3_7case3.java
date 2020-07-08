import java.util.*;
public class Q3_7case3{
  public static void main(String[] args){
    System.out.print("試験の点数を入力>");
    int x=new Scanner(System.in).nextInt();
    if(x>=80){
      System.out.println("優");
    }else if(x>=70){
      System.out.println("良");
    }else if(x>=60){
      System.out.println("可");
    }else{
      System.out.println("不可");
    }
  }
}
