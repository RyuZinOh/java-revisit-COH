package chapter6.practice;

import java.awt.*;

public class arrayissortedorno {
    public static void main(String[] args) {

        int [] arr = {1,2,3,4,7};
        boolean x = true;
        for (int i=0;i<arr.length-1;i++){
            if(arr[i]> arr[i+1]){
                x = false;
           break;
            }
        }

        if(x){
            System.out.println("its sorted");
        }else {
            System.out.println("not sorted");
        }
    }
}
