package chapter10;

import javax.crypto.Mac;

class One{
    public void name(){
        System.out.println("my name is one");
    }
    public void greet(){
        System.out.println("konnochiwa");
    }
}
class Two extends  One{
    @Override
    public void name() {
        System.out.println("my name is class two");
    }
    public void greeting(){
        System.out.println("namaste");
    }
}
class Three extends Two{
    @Override
    public void name() {
        System.out.println("this is haku");
    }
    public void donger(){
        System.out.println("hi");
    }
}
public class dynamicmethoddispatch {
    public static void main(String[] args) {
//cant do like if we create a major super thing and derived one which is updated
        //uts obvious the old one will never run the updated one thing unless its overridden
        //        One max = new Three();
//        max.donger();

    }
}
