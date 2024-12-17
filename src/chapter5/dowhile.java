package chapter5;

import java.util.Scanner;

public class dowhile {

    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter upto n which number will be shown");
        n = sc.nextInt();
        int b =0;
        do{
            System.out.println(b);
            b++;
        }while (b<n);
    }
}
