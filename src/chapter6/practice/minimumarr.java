package chapter6.practice;

public class minimumarr {
    public static void main(String[] args) {
        int[] arr = {100,140,125,127722,1420};
        int min = arr[0];
        for (int i = 0; i<=arr.length-1;i++)
            if(min < arr[i]){
                continue;
            }else{
                min = arr[i];
            }

        System.out.println(min);
    }
}
