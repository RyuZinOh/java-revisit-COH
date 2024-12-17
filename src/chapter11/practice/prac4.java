package chapter11.practice;

interface Tvremote{
    void clic();
}

interface SmartTvRemote extends  Tvremote{
    void changeChannel();
}


class Tv implements  SmartTvRemote{
    public  void changeChannel(){
        System.out.println("chaning channel");
    }
    public  void clic(){
        System.out.println("clicing");
    }
    public  void on(){
        System.out.println("on ing the tv");
    }
}

public class prac4 {
    public static void main(String[] args) {
        Tvremote tvs = new Tv();
        tvs.clic();

        SmartTvRemote xd = new Tv();
        xd.changeChannel();
        xd.clic();


        Tv dean = new Tv();
        dean.clic();
        dean.changeChannel();
        dean.on();




    }
}
