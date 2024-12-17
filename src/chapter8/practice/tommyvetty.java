package chapter8.practice;
class tommyv{
    public  void hit(){
        System.out.println("hitting");
    }
    public void run(){
        System.out.println("running");
    }
    public void fire(){
        System.out.println("firing");
    }
}
public class tommyvetty {
    public static void main(String[] args) {
        tommyv se = new tommyv();
        se.fire();
        se.hit();
        se.run();

    }
}
