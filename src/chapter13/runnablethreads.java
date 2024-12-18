package chapter13;
class RunThread implements  Runnable{
    public void run() {
        System.out.println("me thread not threat");
           System.out.println("me thread not threat");
           System.out.println("me thread not threat");
           System.out.println("me thread not threat");
           System.out.println("me thread not threat");
           System.out.println("me thread not threat");
           System.out.println("me thread not threat");
           System.out.println("me thread not threat");
           System.out.println("me thread not threat");
    }
}

class RunThread2 implements  Runnable{
    public void run() {
        System.out.println("me thread but not thred 2");
        System.out.println("me thread but not thred 2");
        System.out.println("me thread but not thred 2");
        System.out.println("me thread but not thred 2");
        System.out.println("me thread but not thred 2");
        System.out.println("me thread but not thred 2");
        System.out.println("me thread but not thred 2");
        System.out.println("me thread but not thred 2");
        System.out.println("me thread but not thred 2");

    }
}

public class runnablethreads {
    public static void main(String[] args) {

        RunThread bullet1 = new RunThread();
        Thread  gun1 = new Thread( bullet1);
        RunThread2 bullet2 = new RunThread2();
        Thread  gun2 = new Thread( bullet2);
        gun1.start();
        gun2.start();

    }
}
