import java.util.*;
public class Q5_3{
  public static void main(String[] args){
    int[] nums=new int[10];
	for(int i=0; i<nums.length; i++){
   	 System.out.print("数値を入力>");
     nums[i]=new Scanner(System.in).nextInt();
    }
    for(int i:nums){
	//for(int i=0; i<nums.length; i++){
      if((i%2)==0){
        System.out.print("偶数:");
        System.out.println(i);
      }
      if((i%2)!=0){
        System.out.print("奇数:");
        System.out.println(i);
      }
    }
    
  }
}
