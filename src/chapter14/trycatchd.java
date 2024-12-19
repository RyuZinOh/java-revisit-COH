package chapter14;

public class trycatchd{
    public static void main(String[] args) {
        int a  = 66666;
        int b = 0;
        try {
            //try to run this
            int c = a/b;
            System.out.println(c);
            //if excetoion occured, then catch it below
        } catch (Exception e) {
            System.out.println("dont add 0 mf");
        }
        System.out.println("ended");
    }
}
