import java.util.*;
public class Q3_9{
  public static void main(String[] args){
    System.out.println("曜日を選択");
    System.out.print("0=日曜、1=月曜、2=火曜、3=水曜、4=木曜、5=金曜、6=土曜>");
    int day=new Scanner(System.in).nextInt();
    System.out.println("時間帯を選択");
    System.out.print("0=午前、1=午後、2=夜間>");
    int time=new Scanner(System.in).nextInt();
    if(day==0){
      System.out.println("休診です。");
    }else if((day==2 || day==5) && time==0){
      System.out.println("休診です。");
    }else if(day==6 && (time==1 || time==2)){
      System.out.println("休診です。");
    }else if(day==3 && time==2){
      System.out.println("休診です。");
    }else{
      System.out.println("診療しています。");
    }
  }
}
