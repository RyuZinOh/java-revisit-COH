package chapter7;

import com.sun.tools.attach.VirtualMachineDescriptor;

import javax.swing.plaf.metal.MetalInternalFrameTitlePane;
import java.lang.reflect.InaccessibleObjectException;

public class overloadin {

    static void safal(){
        System.out.println(" no args passed");
    }
    static void safal(int a){
        System.out.println("one value passed");
    }
    static void safal(int a, int b){
        System.out.println("two value passed");
    }
    static  int safal(int a, int b, int c){
        return c;
    }
    public static void main(String[] args) {
       int x = safal(1,2,3);

        safal();
        safal(1);
        safal(1, 4);
        System.out.println(x);

    }
}
