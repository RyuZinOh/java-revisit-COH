package chapter4;
import  java.util.Scanner;
public class switchin {
    public static void main(String[] args) {
        Scanner scanne = new Scanner(System.in);
        System.out.println("enter your age");
        int age = scanne.nextInt();
        //else if ladder
//        if(age>55){
//            System.out.println(" u are experienced");
//        }
//        else if(age>46){
//            System.out.println("u are semi experinced");
//        }
//        else if(age>40){
//            System.out.println("u are semi semi experinced");
//        }
//        else{
//            System.out.println(" u care not experienced");
//        }
        switch (age) {
            case 18 -> System.out.println("u are 18");
            case 50 -> System.out.println("u are 50");
            case 60 -> System.out.println("u are 60");
            case 80 -> System.out.println("u are 80");
            case 44 -> System.out.println("u are 44");
            default -> System.out.println("its default age");
        }

    }
}
