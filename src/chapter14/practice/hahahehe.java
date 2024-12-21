package chapter14.practice;


import java.util.Scanner;

class haha extends Exception{
    @Override
    public String toString() {
        return "haha";
    }

    public void goku(String a ){
        if(a ==null || a.isBlank()){
            throw  new IllegalArgumentException("hehe");
        }
        System.out.println(a);
    }
}


public class hahahehe {
    public static void main(String[] args) throws haha {
        int a =10;
        Scanner sc = new Scanner(System.in);
        haha pom = new haha();
        try {
            System.out.println(a/0);
        }catch (ArithmeticException x){
            try {
                throw  new haha();
            }catch (haha zpt){
                System.out.println(zpt.toString());
                try {
                    System.out.println("enter arg for goku");
                    String inout = sc.nextLine();
                pom.goku(inout);
                }catch (IllegalArgumentException e){
                    System.out.println(e.getMessage());
                }
            }
        }catch (IllegalArgumentException e){
            System.out.println(e);
        }

    }
}
