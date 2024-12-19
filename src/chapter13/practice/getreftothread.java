package chapter13.practice;
class monk extends  Thread{
    @Override
    public void run() {
        System.out.println("monksta");
    }
}
class xdxd extends  Thread{
    @Override
    public void run() {
        System.out.println("xdxd");
    }
}
public class getreftothread {
    public static void main(String[] args) {
        monk man = new monk();
        xdxd xdxd  = new xdxd();
        System.out.println(Thread.currentThread());
        System.out.println(
                Thread.currentThread().getState()
        );
    }
}
