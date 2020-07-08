import java.util.*;
public class Q3_12{
  public static void main(String[] args){
    System.out.println("1:まぐろ 2:えび 3:こはだ");
    System.out.print("好きな鮨を選択>");
    int x=new Scanner(System.in).nextInt();
    switch(x){
    case 1:
        System.out.println("まぐろに縁がありそう" );
        break;
    case 2:
        System.out.println("えびに縁がありそう");
        break;
    case 3:
        System.out.println("こはだに縁がありそう");
        break;
    }
  }
}
