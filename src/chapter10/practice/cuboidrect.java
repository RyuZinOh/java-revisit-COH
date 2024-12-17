package chapter10.practice;

import javax.imageio.metadata.IIOInvalidTreeException;
import java.util.function.IntToLongFunction;

class Rectangle{
    int length, width;
    Rectangle(int l, int b){
        this.length = l;
        this.width = b;
    }
    Rectangle(){
        System.out.println("non parameterized rectangle");
    }
    public void area(){
        System.out.println(length *  width);
    }
}

class Cuboid extends Rectangle{
    int height;
    Cuboid(int l, int b, int h){
        super(l, b);
        this.height = h;
    }
    public  void area(){
        System.out.println(2*length*width + 2* width*height + 2*height*length);
    }
}
public class cuboidrect {

    public static void main(String[] args) {
//        Rectangle rect = new Rectangle(10,20);
        Cuboid cubs = new Cuboid(10,10,10);
        cubs.area();
    }
}
