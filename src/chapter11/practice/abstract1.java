package chapter11.practice;

abstract class Pen{
    abstract  public void write();
    abstract  public void refill();
}

class reality extends Pen{
    @Override
    public void refill() {
        System.out.println("refilling");
    }

    @Override
    public void write() {
        System.out.println("writing");
    }
    void chaneNib(){
        System.out.println("chanigng the nib");
    }
}
public class abstract1 {
    public static void main(String[] args) {
        reality reality = new reality();
        reality.refill();
        reality.write();
        reality.chaneNib();
    }
}
