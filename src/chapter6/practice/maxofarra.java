package chapter6.practice;

public class maxofarra {
    public static void main(String[] args) {
        int[] arr = {100,140,125,127722,1420};
        int max = arr[0];
        for (int i = 0; i<=arr.length-1;i++)
            if(max > arr[i]){
                continue;
            }else{
                max = arr[i];
            }

        System.out.println(max);
    }
}
