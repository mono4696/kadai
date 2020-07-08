import java.util.*;
class CoinCase{
    int Yen500=0;
    int Yen100=0;
    int Yen50=0;
    int Yen10=0;
    int Yen5=0;
    int Yen1=0;
    //硬貨を追加する(引数は硬貨の種類(int)と枚数(int))
    public void AddCoins(int yen,int count){
      switch(yen){
        case 500:
        Yen500+=count;
        break;
        case 100:
        Yen100+=count;
        break;
        case 50:
        Yen50+=count;
        break;
        case 10:
        Yen10+=count;
        break;
        case 5:
        Yen5+=count;
        break;
        case 1:
        Yen1+=count;
        break;
      }
    }
    //総ての硬貨の枚数を取得する(引数なし)
    public int GetCount(){
    }
    //指定した硬貨が何枚あるかを取得する(引数は硬貨の種類(int)、戻り値は枚数(int))
    public int GetCount(int yen){
      switch(yen){
        case 500:
        System.out.printf("500円は%d枚%n",Yen500);
        return Yen500;
        case 100:
        System.out.printf("100円は%d枚%n",Yen100);
        return Yen100;
        case 50:
        System.out.printf("50円は%d枚%n",Yen50);
        return Yen50;
        case 10:
        System.out.printf("10円は%d枚%n",Yen10);
        return Yen10;
        case 5:
        System.out.printf("5円は%d枚%n",Yen5);
        return Yen5;
        case 1:
        System.out.printf("1円は%d枚%n",Yen1);
        return Yen1;
      }       
      return 0;
    }
    //硬貨の総額を取得する(戻り値は硬貨の総額(int))
    public int GetAmount(){
        int sum=(Yen500*500)+(Yen100*100)+(Yen50*50)+(Yen10*10)+(Yen5*5)+(Yen1*1);
        System.out.printf("総額は%d%n",sum);
        return sum;
    }
    //指定した種類の硬貨の総額を取得する(引数あり)
    public int GetAmount(){
    }
}

public class Q7_6{
  public static void main(String[] args){
    Scanner scan=new Scanner(System.in);
    CoinCase coins=new CoinCase();
    for(int i=0; i<10; i++){
      System.out.print("硬貨の種類を入力>");
      int yen=scan.nextInt();
      System.out.print("その硬貨の枚数を入力>");
      int count=scan.nextInt();
      coins.AddCoins(yen,count);
      coins.GetCount(yen);
      coins.GetAmount();
    }
  }
}
