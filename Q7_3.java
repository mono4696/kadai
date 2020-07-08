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
public class Q7_3{
  public static void main(String[] args){
    Dog MyDog1=new Dog();
    Dog MyDog2=new Dog();

    MyDog1.SetName("ぽち");
    MyDog1.SetAge(3);
    MyDog2.SetName("ハチ");
    MyDog2.SetAge(1);
    MyDog1.ShowProfile();
    MyDog2.ShowProfile();
  }
}
