package chapter1;
import java.util.Scanner;
public class greet {
    public static void main(String[] args) {
        String greet;
        Scanner getg = new Scanner(System.in);
        System.out.println("Whats your name");
        greet = getg.nextLine();

        System.out.println("Hello "+greet+", have a good day");


    }

    public static class takinginput {
        public static void main(String[] args) {
         System.out.println("Taking input from user");
         Scanner sc = new Scanner(System.in);
            System.out.println("enter the num1");
            //int a = sc.nextInt();
    //        float a = sc.nextFloat();
    //        System.out.println("enter the num2");
    //        //int b = sc.nextInt();
    //        float b = sc.nextFloat();
    //        //int sum = a+b;
    //        float sum = a+b;
    //        System.out.println("the sum of hte number is");
    //        System.out.println(sum);
    //        boolean b1 = sc.hasNextInt();
    //        System.out.println(b1);
    //        String str = sc.next();
    String str = sc.nextLine();
            System.out.println(str);
        }
    }
}
