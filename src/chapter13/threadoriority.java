package chapter13;

class rias extends Thread{
    public rias(String name){
        super(name);
    }

    @Override
    public void run() {
        System.out.println("running");
    }
}

class boobe extends Thread{
    public boobe(String name){
        super(name);
    }

    @Override
    public void run() {
        System.out.println("running");
    }
}

public class threadoriority {
    public static void main(String[] args) {
        boobe boobe = new boobe("man");
        rias rias = new rias("safal");
        boobe.setPriority(Thread.MAX_PRIORITY);
        rias.setPriority(Thread.MIN_PRIORITY);
        rias.start();
        boobe.start();
        System.out.println("rias "+rias.getPriority());
        System.out.println("booba "+boobe.getPriority());

    }
}
