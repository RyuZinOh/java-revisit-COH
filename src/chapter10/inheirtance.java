package chapter10;

class base{
    public void setX(int x) {
        System.out.println("im an a x");
        this.x = x;
    }

   public int getx(){
        return x;
   }
    int x;
}


class Derived extends  base{
    int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
public class inheirtance {
    public static void main(String[] args) {
        base be = new base();
        Derived mav = new Derived();
        be.setX(4);
        mav.setX(10);
        System.out.println(be.getx());
        System.out.println(mav.getx());



    }
}
