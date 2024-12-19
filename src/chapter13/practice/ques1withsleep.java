package chapter13.practice;
class ohio extends Thread{
    @Override
    public void run() {
        while (true){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("goodmorning");
        }
    }
}

class milked implements  Runnable {
    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("welcome");
        }
    }
}
    public class ques1withsleep {
        public static void main(String[] args) {
            ohio oo = new ohio();
            milked milker  = new milked();
            Thread handj = new Thread(milker);
            handj.start();
            oo.start();

        }
}

