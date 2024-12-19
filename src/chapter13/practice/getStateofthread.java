package chapter13.practice;

class Japan extends Thread{
    @Override
    public void run() {

        System.out.println("japan");
    }
}

class Nepal extends Thread{
    @Override
    public void run() {
        System.out.println("mepal");
    }
}

public class getStateofthread {
    public static void main(String[] args) {
        Japan gg = new Japan();
        Nepal np = new Nepal();
        gg.start();
        System.out.println(gg.getState());
    }
}
