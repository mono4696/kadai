import java.util.*;
public class Q5_6{
  public static void main(String[] args){
    int kuku[][] = new int[9][9];
   // 配列 kuku に値を代入する
	for(int i=0; i<9; i++){
		for(int j=0; j<9; j++){
			kuku[i][j]=(i+1)*(j+1);
		}
	}
	for(int i=0; i<kuku.length; i++){
		for(int j=0; j<kuku[i].length; j++){
       		System.out.print(kuku[i][j] );
		}
       	System.out.println();
	}
  }
}
