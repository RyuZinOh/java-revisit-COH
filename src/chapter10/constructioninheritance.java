package chapter10;

class Safal{
    Safal(){
        System.out.println("this is safal lama");
    }
    Safal(int x ){
        System.out.println("overloaded by " + x);
    }
}

class Goku extends Safal{
    Goku(){
        super(0);
        System.out.println("deruved from safal");
    }
    Goku(int x, int y){
        super(x);
        System.out.println("derived safal overloaded by "+y);
    }
}

class Vegeta extends Goku{
    Vegeta(){
        System.out.println("i am child of derived");
    }
    Vegeta(int x, int y, int z){
        super(x,y);
        System.out.println("this is "+z);
    }
}

public class constructioninheritance {
    public static void main(String[] args) {
//        Goku ans = new Goku(10,10);
        Vegeta sim = new Vegeta(10,10,10);

    }
}
