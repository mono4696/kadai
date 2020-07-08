import java.util.*;
public class Q5_7{
  public static void main(String[] args){
	System.out.print("1~9で好きな数値を入力>");
	int a=new Scanner(System.in).nextInt();
	System.out.print("1~9で好きな数値を入力>");
	int b=new Scanner(System.in).nextInt();
    int kuku[][] = new int[9][9];
    for(int i=0; i<9; i++){
        for(int j=0; j<9; j++){
            kuku[i][j]=(i+1)*(j+1);
        }
    }
    System.out.println(kuku[a-1][b-1]);
  }
}
