package chapter8.practice;

class cellphone{
    public void ringing(){
        System.out.println("rinigng");
    }

    public void vibrating(){
        System.out.println("vibraating");
    }

}
public class troontroon {
    public static void main(String[] args) {
        cellphone mox = new cellphone();
        mox.ringing();
        mox.vibrating();
    }
}
