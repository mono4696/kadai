import java.util.*;
public class Q3_13{
  public static void main(String[] args){
    System.out.print("月を表す数値を入力>");
    int x=new Scanner(System.in).nextInt();
    switch(x){
    case 2:
        System.out.println("28日");
        break;
    case 4:
    case 6:
    case 9:
    case 11:
        System.out.println("30日");
        break;
    case 1:
    case 3:
    case 5:
    case 7:
    case 8:
    case 10:
    case 12:
        System.out.println("31日" );
        break;
    default:
        System.out.println("入力が間違っています");
        break;
    }
  }
}
