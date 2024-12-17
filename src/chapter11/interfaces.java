package chapter11;


interface Bicycle{
    int a = 45;
    void applyBrake(int dec);
    void speedUp(int inc);
}
class GearCycle implements Bicycle{

    void blowHorn(){
        System.out.println("bowing");
    }
    public void applyBrake(int dec){
        System.out.println("aplying brake");
    }

    public void speedUp(int inc) {
        System.out.println("applying speed");

    }
}
public class interfaces {
    public static void main(String[] args) {
GearCycle gear = new GearCycle();
gear.blowHorn();
gear.applyBrake(4);
        System.out.println(gear.a);
    }
}
