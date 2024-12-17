package chapter5;

import java.util.Scanner;

public class forloop {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter toi n from which number will be shown");
        n = sc.nextInt();

        for (int b=n; b!=0;b--){
            if(b==2){
//                continue;
//                break
            }
            else{
                System.out.println(b);
            }

        }

    }
}
