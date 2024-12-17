package chapter11;

interface Camera {
    void takeSnap();
    void recordVideo();
    default void record4k(){
        System.out.println("recording in 4k");
    };
}

interface Wifi {
    String[] getNetworks();
    void connectToNetwork(String network);
}

class Cellphone {
    void callNumber(int p) {
        System.out.println("Calling phone number " + p);
    }

    void pickCall() {
        System.out.println("Connecting...");
    }
}

class SmartPhone extends Cellphone implements Wifi, Camera {
    public void takeSnap() {
        System.out.println("Taking snapshots");
    }

    public void recordVideo() {
        System.out.println("Recording video");
    }

    public String[] getNetworks() {
        System.out.println("Getting list of networks");
        String[] netLists = {"safal", "vegeta", "goku"};
        return netLists;
    }

    @Override
    public void connectToNetwork(String network) {
        System.out.println("Connecting to " + network);
    }

    @Override
    public void record4k() {
        System.out.println("recording in 4k after taling snamp");
    }
}

public class defaultmethods {
    public static void main(String[] args) {
        SmartPhone ms = new SmartPhone();
        String[] networks = ms.getNetworks();
        for (String network : networks) {
            System.out.println(network);
        }
        ms.record4k();
    }
}
