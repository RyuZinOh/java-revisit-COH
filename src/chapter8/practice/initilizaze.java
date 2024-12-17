package chapter8.practice;

class  square{
    int side;
    public int area(){
        return side*side;
    }
    public int perimeter(){
        return 4*side;
    }

}
public class initilizaze {
    public static void main(String[] args) {
        square square = new square();
        square.side = 4;
        System.out.println( square.area());
        System.out.println(square.perimeter());

    }
}
