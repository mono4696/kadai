import java.util.*;
public class Q4_21{
	public static void main(String[] args){
		System.out.print("好きな数値を入力>");
		int n=new Scanner(System.in).nextInt();
		for(int i=0; i<n; i++){
			for(int y=0; y<n; y++){
				if(i==y || (n-i-1)==y){
					System.out.print("X");
				}else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
