package chapter7.project;

import java.util.Scanner;

public class recursionsum {
   static int rsum(int n){
       if(n == 1 ) {
           return 1;
       }else{
           return n + rsum(n-1);
       }

   }
    public static void main(String[] args) {
        Scanner value = new Scanner(System.in);
        System.out.println("enter the end point");
        int ans = value.nextInt();
        System.out.println(rsum(ans));

    }
}
