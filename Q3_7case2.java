import java.util.*;
public class Q3_7case2{
  public static void main(String[] args){
    System.out.print("試験の点数を入力>");
    int x=new Scanner(System.in).nextInt();
    if(x>=80){
      System.out.println("たいへんよくできました。");
    }else if(x>=60){
      System.out.println("よくできました。");
    }else{
      System.out.println("ざんねんでした。");
    }
  }
}
