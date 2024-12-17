package chapter11;

import jdk.swing.interop.SwingInterOpUtils;

import java.sql.SQLOutput;

interface Sample1{
    void meth1();
    void meth2();
}
interface  Sample2 extends Sample1{
    void meth3();
    void meth4();
}

class MySampleClass implements Sample2{
    public void meth3(){
        System.out.println("meth3");
    }

 public void meth4(){
        System.out.println("meth4");
    }

    public void meth1(){
        System.out.println("meth1");
    }
    public void meth2(){
        System.out.println("meth2");
    }

}
public class inheritaneinterface {
    public static void main(String[] args) {

        MySampleClass se = new MySampleClass();
        se.meth4();

    }
}
