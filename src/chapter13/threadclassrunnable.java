package chapter13;

class goku implements Runnable{
    public void run(){
        System.out.println(" i am goku");
    }
}


class vegeta  implements  Runnable{
    private String pompom;
    public vegeta(String xd){
        this.pompom = xd;
    }

    public void run() {
        System.out.println(pompom);
    }
}
public class threadclassrunnable {
    public static void main(String[] args) {
        goku bullet = new goku();
        Thread hand  = new Thread(bullet, "safal");
        hand.start();

        //another one
        vegeta vegan = new vegeta("sheesh");
        Thread bamba = new Thread(vegan);
    bamba.start();
    }
}
