package chapter10;
class Ekclass{
    int a;

    public int getA() {
        return a;
    }

    Ekclass(int a ){
        this.a =a;

    }
    public  int returnone(){
        return 1;
    }
}
class Anotherone extends  Ekclass{
    Anotherone(int c){
        super(c);
        System.out.println("im am the construcotr");
    }
}

public class thisnadsuper {
    public static void main(String[] args) {
        Ekclass ekclass = new Ekclass(5);
        System.out.println(ekclass.getA());
        Anotherone make = new Anotherone(69);

    }
}
