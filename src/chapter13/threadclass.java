package chapter13;


class Safal extends  Thread{
    public Safal(String name){
        super(name);
    }

    public void run() {
        int i =0;
        while(i<20){
            if(i == 4){
                break;
            }else {
                System.out.println("i am a thread");
            }
            i++;
        }
    }
}
public class threadclass {
    public static void main(String[] args) {
        Safal safal = new Safal("hero");
        safal.start();
        System.out.println("the id of the thread is "+safal.getId());
    }
}
