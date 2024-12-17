package chapter11.practice;

interface BasicAnimal{
    void eat();
    void sleep();
}

class Monkey {
    public  void jump(){
        System.out.println("jumping");
    }
    public void bite(){
        System.out.println("bititing");
    }
}

class Human extends Monkey implements BasicAnimal{
    public void eat(){
        System.out.println("eating");
    }
    public void sleep(){
        System.out.println("sleeping");
    }
}
public class prac2 {
    public static void main(String[] args) {
        Human axe = new Human();
        axe.eat();
        axe.sleep();
        axe.jump();
        axe.bite();

    }

}
