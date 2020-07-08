import java.util.*;
public class Q4_13{
	public static void main(String[] args){
		int st=0;
		int ball=0;
		while(st<3 && ball<4){
		System.out.print("ストライクなら1、ボールなら2を入力>");
		int n=new Scanner(System.in).nextInt();
			if(n==1){
				st++;
			}
			if(n==2){
				ball++;
			}
		}
	System.out.println("ストライク"+st+"、ボール"+ball);
	}
}
