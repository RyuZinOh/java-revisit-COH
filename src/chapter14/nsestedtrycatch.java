package chapter14;

public class nsestedtrycatch {
    public static void main(String[] args) {
        int result;
        int x = 5;
        int y =  0;
        try {
            System.out.println("i am sexy af, capping ;3, or am i?");
            try {
                result = x/y;
                System.out.println(result);
            }catch (ArithmeticException e){
                System.out.println("mf, dont divide by zero");
            } catch (Exception e) {
                System.out.println("some other worldly exception");
            }
        }catch (Exception e){
            System.out.println("exception caught level one");
        }
    }
}
