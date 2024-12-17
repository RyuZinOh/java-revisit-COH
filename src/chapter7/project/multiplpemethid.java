package chapter7.project;

import java.util.Scanner;

public class multiplpemethid {
    static  void tble(int n){
        for (int i  = 1 ; i<=n;i++){
            System.out.format("%d * %d =%d \n", n , i , n*i);
        }
    }
    public static void main(String[] args) {
        Scanner ask = new Scanner(System.in);
        System.out.println("enter number");
        int get = ask.nextInt();
        tble(get);

    }
}
