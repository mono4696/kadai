import java.util.*;
public class Q4_15{
	public static void main(String[] args){
		System.out.print("好きな数字を入力>");
		int n=new Scanner(System.in).nextInt();
		for(int i=2; i<=(n/2); i++){
			if((n%i)==0){
				break;
			}
			if(i>(n/2)){
				System.out.println(n+"は素数です");
			}else{
				System.out.println(n+"は素数ではありません");
			}
		}
	}
}
