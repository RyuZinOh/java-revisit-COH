package chapter9;

import org.w3c.dom.CDATASection;

import java.awt.*;

class  circle{
     float pie = 3.14f;
     private  float radius;

     public  void  setname(float radis){

        radius =  radis;
     }
     public float getname(){
         return radius;
     }

        }
public class getsettter {
    public static void main(String[] args) {
        circle xd =new circle();
        xd.setname(10.0f);
       float r =  xd.getname();
        System.out.println(xd.pie * r *r);
    }
}
