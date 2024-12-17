package chapter10;

import java.sql.SQLOutput;

class A{
    public  int bbg(){
        return 4;
    }

    public void meth2(){
        System.out.println("method two from clss A");
    }
}

class B extends A{
    @Override
    public void meth2(){
        System.out.println("method two from clss B");
    }
    public void meth3() {
        System.out.println(" method three from class B");
    }
}
public class methodoveridding {
    public static void main(String[] args) {
        A a = new A();
        a.meth2();

        B b = new B();
        b.meth2();

    }
}
