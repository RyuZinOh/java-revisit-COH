package chapter4.practice;

import java.util.Scanner;

public class days {
    public static void main(String[] args) {
        Scanner getd = new Scanner(System.in);
        int day ;
        System.out.println("enter number");
        day = getd.nextInt();
        switch (day) {
            case 1 -> System.out.println("sunday");
            case 2 -> System.out.println("monday");
            case 3 -> System.out.println("tuesday");
            case 4 -> System.out.println("wednesday");
            case 5 -> System.out.println("thirsday");
            case 6 -> System.out.println("friday");
            case 7 -> System.out.println("saturday");
            default -> System.out.println("not found related day");
        }
    }
}
