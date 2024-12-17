package chapter4.practice;

import java.util.Scanner;

public class leapyearornot {
    public static void main(String[] args) {
        int year;
        Scanner scs = new Scanner(System.in);
        System.out.println("enter year");
        year = scs.nextInt();
        if( (year% 4 ==0) && (year %100 !=0 || year%400 == 0)){
            System.out.println("leap year");
        }else {
            System.out.println("not leap year");
        }

        //leap year is divisible by 4 and isnt divisible by 100 unless its divisbile by 400



    }
}
