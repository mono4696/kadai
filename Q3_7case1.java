import java.util.*;
public class Q3_7case1{
  public static void main(String[] args){
    System.out.print("試験の点数を入力>");
    int x=new Scanner(System.in).nextInt();
    if(x>=60){
    System.out.println("合格");
    }else{
    System.out.println("不合格");
    }
  }
}
