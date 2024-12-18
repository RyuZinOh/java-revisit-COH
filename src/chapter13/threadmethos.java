package chapter13;
class yoda extends  Thread{
    @Override
    public void run() {
        while (true){
            System.out.println("i am running");
            try {
                Thread.sleep(400);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
class  makima extends  Thread{
    @Override
    public void run() {
        while (true){
            System.out.println(" me to running");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
public class threadmethos {
    public static void main(String[] args) {
        yoda meh = new yoda();
        makima makima = new makima();
        meh.start();
//        try {
//            meh.join();
//        }catch(Exception e){
//            System.out.println(e);
//        }
        makima.start();
    }
}
/*
* start
* sleep
* join
* */
