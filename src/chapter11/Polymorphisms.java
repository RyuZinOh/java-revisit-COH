package chapter11;

interface Pen {
    void write();
}
interface Canvas{
    void getWritten();
}
class Artists implements  Pen, Canvas{
    public void write(){
        System.out.println("writing");
    }
    public void getWritten(){
        System.out.println("getting write on");
    }
}
public class Polymorphisms {
    public static void main(String[] args) {
        Pen p = new Artists(); //wont use gwtwritten
        Canvas c = new Artists(); //cant use pen interfaces
        Artists  artists = new Artists(); //uses all thius this in polymorphism
        artists.write();
        artists.getWritten();
        p.write();
        c.getWritten();

    }
}
