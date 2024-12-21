package chapter14.practice;
import com.sun.jdi.event.ExceptionEvent;

import java.util.Scanner;
import java.util.concurrent.CountDownLatch;

class custumL extends Exception{
    @Override
    public String toString() {
        return "invalid index";
    }
}
public class getdatafromarrayuntil {
    public static void main(String[] args) throws custumL {
        int[] marks = {80, 90, 10, 70, 100};
        int count =0;
        Scanner gg = new Scanner(System.in);
        while (count < 5){
            try {
                System.out.println("enter index");
                 int damon = gg.nextInt();
               if (damon <0 || damon >=marks.length){
                   count++;
                   throw new custumL();
               }
                   System.out.println(marks[damon]);

            } catch (custumL e) {
                System.out.println(e.toString());
            }

        }
    }

}
