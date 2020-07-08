class Dog{
    String Name;
    int Age;

    public void SetName(String nm){
        Name=nm;
    }
    public void SetAge(int age){
        Age=age;
    }
    public void ShowProfile(){
        System.out.printf("名前は、%s(%d歳)です。%n",Name,Age);
    }
}
public class Q7_2{
  public static void main(String[] args){
    Dog MyDog=new Dog();

    MyDog.SetName("ぽち");
    MyDog.SetAge(3);
    MyDog.ShowProfile();
  }
}
