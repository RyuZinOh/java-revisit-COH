package chapter6.practice;

import com.sun.jdi.FloatType;

import java.text.BreakIterator;

public class sumarray {
    public static void main(String[] args) {
        float[] arr = {1.0f, 2.5f, 3.5f, 4.0f, 6.0f};
        float sum = 0;
        for (int i = 0; i <= arr.length - 1; i++) {
            sum += arr[i];
        }
        System.out.println(sum);


        //presnet or not
        float[] arre = {1.0f, 2.5f, 3.5f, 4.0f, 6.0f};
        float num = 4.0f;
        boolean ispresent = false;
        for (float element: arre){
            if(num == element){
                ispresent = true;
                break;
            }


        }
        if(ispresent){
            System.out.println("yes");
        }else{
            System.out.println("no");
        }
    }

}
