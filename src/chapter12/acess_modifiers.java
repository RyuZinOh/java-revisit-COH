package chapter12;
import safal.importer;

class user extends  importer {
    public void smet(){
        System.out.println(x);
        System.out.println(y);
    }
}
public class acess_modifiers{
    public static void main(String[] args) {
        user covax = new user();
        covax.smet();
    }
}
