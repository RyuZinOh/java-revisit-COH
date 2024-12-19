package chapter13.practice;
class goodmorning extends Thread{
    @Override
    public void run() {
        while (true){
            System.out.println("goodmorning");
        }
    }
}

class  welcome implements  Runnable{
    @Override
    public void run() {
        while (true){
            System.out.println("welcome");
        }
    }
}
public class gooodmoaningandwelcome {
    public static void main(String[] args) {
        goodmorning gd = new goodmorning();

        welcome quirk = new welcome();
        Thread hold = new Thread(quirk);

        hold.start();
        gd.start();
    }
}
