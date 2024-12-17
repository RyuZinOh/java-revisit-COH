package chapter9.practice;

import com.sun.source.doctree.ReturnTree;

import java.lang.reflect.InvocationTargetException;

class Cylinder{
    private int radius;
    private int height;

    public void setHeight(int z) {
        height = z;
    }

    public void setRadius(int x) {
        radius = x;
    }

    public int getRadius() {
        return radius;
    }

    public int getHeight() {
        return height;
    }
    public double calca(){
        return (2*3.14*radius*height) + (2 *3.14*radius*radius);
    }
public  double volumec(){
        return 3.14*radius*radius*height;
}


}
public class get_set_cyliundar {
    public static void main(String[] args) {


        Cylinder cs = new Cylinder();
        cs.setHeight(12);
        cs.setRadius(9);
        System.out.println(cs.getHeight());
        System.out.println(cs.getRadius());
        System.out.println(cs.calca());
        System.out.println(cs.volumec());
    }
}
