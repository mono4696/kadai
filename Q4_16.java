import java.util.*;
public class Q4_16{
	public static void main(String[] args){
		System.out.print("2以上の数字を入力>");
		int n=new Scanner(System.in).nextInt();
		for(int i=2; n>1; i++){
			while((n%i)==0){
				System.out.print(i+"");
				n/=i;
			}
		}
	}
}
