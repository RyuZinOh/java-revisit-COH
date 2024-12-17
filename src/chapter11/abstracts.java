package chapter11;


abstract class base{
    public base(){
        System.out.println(" i am a construcotr");
    }
    public void sayHello(){
        System.out.println("hello");
    }
   abstract public void greet();
}
class delulu extends  base{
    @Override
    public void greet() {
        System.out.println("good moaning");
    }

}

public class abstracts {
    public static void main(String[] args) {
        delulu dex = new delulu();
        dex.sayHello();
    }
}
