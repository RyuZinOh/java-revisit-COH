package chapter1;
import java.util.Scanner;

public class resultP {
    public static void main(String[] args) {
        System.out.println("results");
        float sub1, sub2, sub3, sub4, sub5 ;
        Scanner getm = new Scanner(System.in);
        System.out.println("enter marks obtained in math");
        sub1 = getm.nextFloat();
        System.out.println("enter marks obtained in science");
        sub2 = getm.nextFloat();
        System.out.println("enter marks obtained in english");
        sub3 = getm.nextFloat();
        System.out.println("enter marks obtained in history");
        sub4 = getm.nextFloat();
        System.out.println("enter marks obtained in helth");
        sub5 = getm.nextFloat();
        float result = ((sub1+sub2+sub3+sub4+sub5)*100)/500;
        System.out.println("u have obtained marks overall"+ result+"%");
    }
}
