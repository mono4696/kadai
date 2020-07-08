class Dog{
    String Name;
    int Age;
    String Breed;

    public Dog(String breed){
      Breed=breed;
    }
    public void SetName(String nm){
        Name=nm;
    }
    public void SetAge(int age){
        Age=age;
    }
    public void ShowProfile(){
        System.out.printf("犬種は%sです。名前は%s(%d歳)です。%n",Breed,Name,Age);
    }
}
public class Q7_4{
  public static void main(String[] args){
    Dog MyDog=new Dog("柴犬");

    MyDog.SetName("ぽち");
    MyDog.SetAge(3);
    MyDog.ShowProfile();
  }
}
