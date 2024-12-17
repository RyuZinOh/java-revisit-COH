package chapter10.practice;

import jdk.swing.interop.SwingInterOpUtils;

class Circle{
    public int r;
    Circle(){
        System.out.println("non parametrized constructor");
    }

    Circle(int r){
        System.out.println(" circle paratermized construcotr");
        this.r = r;
    }
    public  double area(){
        return this.r * this.r * Math.PI;
    }
}
class Cylindar extends  Circle{
    Cylindar(int r, int h ){
        super(r);
        System.out.println("this is cylindar parametrized constructor");
        this.h = h;
    }
    public int h;
    public double volume(){
        return this.r * this.r * Math.PI * this.h;
    }

}
public class circlesylindar {
    public static void main(String[] args) {
         Cylindar cun = new Cylindar(10,10);
         Circle coc  = new Circle(10);
        System.out.println(cun.volume());
    }
}
