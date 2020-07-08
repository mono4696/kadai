import java.util.*;
public class Q3_8{
  public static void main(String[] args){
    System.out.print("中間試験の点数を入力>");
    int test1=new Scanner(System.in).nextInt();
    System.out.print("期末試験の点数を入力>");
    int test2=new Scanner(System.in).nextInt();
    if(test1>=60 && test2>=60){
      System.out.println("合格");
    }else if((test1+test2)>=130){
      System.out.println("合格");
    }else if((test1+test2)>=100 && (test1>=90 || test2>=90)){
      System.out.println("合格");
    }else{
      System.out.println("不合格");
    }
  }
}
