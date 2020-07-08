import java.util.*;
public class Q6_4_2{
	public static void main(String[] args){
		triangle(3);
    System.out.println();
		triangle(4);
    System.out.println();
		triangle(5);
    System.out.println();
	}
	public static void triangle(int x){
		for(int i=0; i<x; i++){
      for(int j=0; j<=i; j++){
        System.out.print("$");
      }
      System.out.println();
    }
	}
}
