package chapter14;

import java.util.Scanner;

public class electrojaculaiton {
    public static void main(String[] args) {
        int [] linus = new int[3];
        boolean flag = true;
        int xplicit;
        Scanner lisiyo = new Scanner(System.in);
            while(flag){
                try {
                    System.out.println("enter index value");
                    xplicit =  lisiyo.nextInt();
                    System.out.println(linus[xplicit]);
                }catch (ArrayIndexOutOfBoundsException e){
                    flag = false;
                    System.out.println(e);
                } catch (Exception e) {
                    System.out.println("error some occurred");
                }

            }

    }
}
