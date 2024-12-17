package chapter13;

class MyThread1 extends Thread{
    @Override
    public void run(){
        while(true){
            System.out.println("my thread is running");
            System.out.println("i am happy");
        }
    }

}

class MyThread2 extends  Thread {
    @Override
    public void run() {
        while (true) {
            System.out.println("my thread2 is chatting with her");
            System.out.println("i am sad");
        }
    }
}
public class doingthreads {
    public static void main(String[] args) {
        MyThread1 thread1 = new MyThread1();
        MyThread2 thread2 = new MyThread2();
        thread1.start(); //to call , we need to call start, which implements threads.java, so srun will be called
        thread2.start();
    }
}
