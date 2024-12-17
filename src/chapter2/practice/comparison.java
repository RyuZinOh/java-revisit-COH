package chapter2.practice;
import java.util.Scanner;
public class comparison {
    public static void main(String[] args) {
        int anumber = 100;
        Scanner obj = new Scanner(System.in);
        System.out.println("enter the number");
        int x = obj.nextInt();
        System.out.println(anumber<x);
    }
}
