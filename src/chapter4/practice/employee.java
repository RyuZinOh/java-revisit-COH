package chapter4.practice;

import java.util.Scanner;

public class employee {
    public static void main(String[] args) {
        float income;
        Scanner getinc = new Scanner(System.in);
        System.out.println("whaths the income");
        income = getinc.nextFloat();
        if(income >250000f && income <=500000f){
            System.out.println(income * 5/100f);
        }
        else if(income >500000f && income <=1000000f){
            System.out.println(income * 20/100f);
        }
        else if(income >1000000f){
            System.out.println(income * 30/100f);
        }else{
            System.out.println("no tax xutting");
        }
    }
}
