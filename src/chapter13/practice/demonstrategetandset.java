package chapter13.practice;


import javax.management.openmbean.OpenMBeanOperationInfoSupport;

class Oppai extends Thread{
    @Override
    public void run() {
        System.out.println("opppai sugoi desu");
    }
}

class Thigh extends  Thread{
    @Override
    public void run() {
        System.out.println("supreme lord thigh");
    }
}
public class demonstrategetandset {
    public static void main(String[] args) {
        Oppai oops = new Oppai();
        Thigh thgh = new Thigh();
        oops.setPriority(Thread.MIN_PRIORITY);
        thgh.setPriority(Thread.MAX_PRIORITY);
        System.out.println("OPpai "+oops.getPriority());
        System.out.println("Thighs "+thgh.getPriority());
        oops.start();
        thgh.start();
    }
}
