class Dog{
    String Name;
 
    public void SetName(String nm){
        Name = nm;
    }
    public void ShowProfile(){
        System.out.printf("名前は、%sです。%n",Name);
    }
}
public class Q7_1{
  public static void main(String[] args){
    Dog MyDog=new Dog();

    MyDog.SetName("ぽち");
    MyDog.ShowProfile();
  }
}
