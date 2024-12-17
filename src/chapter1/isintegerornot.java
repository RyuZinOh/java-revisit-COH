package chapter1;
import java.util.Scanner;
public class isintegerornot {
    public static void main(String[] args) {
        Scanner getn = new Scanner(System.in);
        System.out.println("enter nummber ");
       boolean answer =   getn.hasNextInt();
        System.out.println(answer);

    }
}