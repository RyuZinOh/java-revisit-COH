package chapter14;

public class throwsvsthrows {
    public static void main(String[] args) {
        try {
            System.out.println(   divide(10,0));
        }catch (Exception e){
            System.out.println("arthemetic error ok");
        }
    }

    public  static  int divide(int a,  int b) throws ArithmeticException{
        int result = a/b;
        return result;
    }

    public static double area(int r) throws Negati{
        if(r<0){
            throw new Negati();
        }
        double res = Math.PI*r;
        return res;

    }
}


class  Negati extends Exception{
    @Override
    public String toString() {
        return "mf, dont add negative radius";
    }
}